package ma.enset.services;

import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Chat;
import ma.enset.stubs.ChatServiceGrpc;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

public class ChatGrpcService extends ChatServiceGrpc.BanqueServiceImplBase {
    HashMap<String , StreamObserver> clients = new HashMap<>();
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
        return new StreamObserver<Chat.ConvertCurencyRequest>() {
            @Override
            public void onNext(Chat.ConvertCurencyRequest convertCurencyRequest) {
                String currencyFrom = convertCurencyRequest.getCurrencyFrom();
                String currencyTo = convertCurencyRequest.getCurrencyTo();
                if(!clients.containsKey(currencyFrom)){
                    clients.put(currencyFrom , responseObserver);
                }
                if(currencyTo.isEmpty()){
                    for(String s : clients.keySet()){
                        if(!s.equals(currencyFrom)) {
                            clients.get(s).onNext(convertCurencyRequest);
                        }
                    }
                } else if (clients.containsKey(currencyTo)) {
                    StreamObserver<Chat.ConvertCurencyRequest> requestStreamObserver = clients.get(currencyTo);
                    requestStreamObserver.onNext(convertCurencyRequest);
                }
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
                        responseObserver.onCompleted();
            }
        };
       /* return  new StreamObserver<Bank.ConvertCurencyRequest>() {
             @Override
             public void onNext(Bank.ConvertCurencyRequest convertCurencyRequest) {
                Bank.ConvertCurrencyResponse response = Bank.ConvertCurrencyResponse.newBuilder()
                        .setResult(convertCurencyRequest.getAmount()*Math.random()*40)
                        .build();
                responseObserver.onNext(response);
             }
             @Override
             public void onError(Throwable throwable) {
             }
             @Override
             public void onCompleted() {
                responseObserver.onCompleted();
             }
         };*/
    }
}
