package ma.enset.services;

import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Chat;
import ma.enset.stubs.ChatServiceGrpc;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

public class ChatGrpcService extends ChatServiceGrpc.ChatServiceImplBase {
    HashMap<String , StreamObserver> clients = new HashMap<>();
    private Map<String, StreamObserver<Chat.ConvertCurrencyResponse>> clients1 = new ConcurrentHashMap<>();
    @Override
    public void convert(Chat.ConvertCurencyRequest request, StreamObserver<Chat.ConvertCurrencyResponse> responseObserver) {
        String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();
        String message = request.getMessage();
        Chat.ConvertCurrencyResponse response=Chat.ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setMessage(message)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCurrencyStream(Chat.ConvertCurencyRequest request, StreamObserver<Chat.ConvertCurrencyResponse> responseObserver) {
       String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();
        String message = request.getMessage();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                Chat.ConvertCurrencyResponse response = Chat.ConvertCurrencyResponse.newBuilder()
                        .setCurrencyFrom(currencyFrom)
                        .setCurrencyTo(currencyTo)
                        .setMessage(message)
                        .build();
                responseObserver.onNext(response);
                ++counter;
                if(counter==20){
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);
    }
    @Override
    public StreamObserver<Chat.ConvertCurencyRequest> performStream(StreamObserver<Chat.ConvertCurrencyResponse> responseObserver) {
        return new StreamObserver<Chat.ConvertCurencyRequest>() {
            double sum =0;
            @Override
            public void onNext(Chat.ConvertCurencyRequest convertCurencyRequest) {
                for (int i =0 ; i<10 ; i++){
                    sum+=i;
                }
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                Chat.ConvertCurrencyResponse response = Chat.ConvertCurrencyResponse.newBuilder()
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    @Override

    public StreamObserver<Chat.ConvertCurencyRequest> fullCurrencyStream(StreamObserver<Chat.ConvertCurrencyResponse> responseObserver) {
        StreamObserver<Chat.ConvertCurencyRequest> requestObserver = new StreamObserver<Chat.ConvertCurencyRequest>() {
            @Override
            public void onNext(Chat.ConvertCurencyRequest request) {
                String from = request.getCurrencyFrom();
                String to = request.getCurrencyTo();
                String message = request.getMessage();

                // envoyer la réponse à tous les clients qui ont la devise 'from'
                for (Map.Entry<String, StreamObserver<Chat.ConvertCurrencyResponse>> entry : clients1.entrySet()) {
                    if (entry.getKey().equals(from)) {
                        Chat.ConvertCurrencyResponse response = Chat.ConvertCurrencyResponse.newBuilder()
                                .setMessage(message)
                                .setCurrencyFrom(from)
                                .setCurrencyTo(to)
                                .build();
                        entry.getValue().onNext(response);
                    }
                }

                //  ajouter le client à la liste s'il n'y est pas encore
                if (!clients.containsKey(from)) {
                    clients.put(from, responseObserver);
                }
            }

            @Override
            public void onError(Throwable t) {
                // Supprimer le client s'il y a une erreur
                String message = t.getMessage();
                clients.entrySet().removeIf(entry -> entry.getValue().equals(responseObserver));
            }

            @Override
            public void onCompleted() {
                // Supprimer le client une fois terminé
                clients.entrySet().removeIf(entry -> entry.getValue().equals(responseObserver));
                responseObserver.onCompleted();
            }
        };

        return requestObserver;
    }



}
