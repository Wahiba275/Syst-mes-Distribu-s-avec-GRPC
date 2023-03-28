package ma.enset.clients;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import ma.enset.stubs.Chat;
import ma.enset.stubs.ChatServiceGrpc;
import java.util.Scanner;

public class GrpcClient {
    private static String from;
    private static String to;
    private static String message;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost" , 5005)
                .usePlaintext()
                .build();
        ChatServiceGrpc.ChatServiceStub serviceStub = ChatServiceGrpc.newStub(managedChannel);
        StreamObserver<Chat.ConvertCurencyRequest> performStream = serviceStub.performStream(new StreamObserver<Chat.ConvertCurrencyResponse>() {
            @Override
            public void onNext(Chat.ConvertCurrencyResponse convertCurrencyResponse) {
                System.out.println(convertCurrencyResponse);
            }
            @Override
            public void onError(Throwable throwable) {
            }
            @Override
            public void onCompleted() {
                System.out.println("END.............");
            }
        });
        while (true){
            System.out.print("from: ");
            from = scan.nextLine();
            System.out.print("to: ");
            to=scan.nextLine();
            System.out.print("Message : ");
            message=scan.nextLine();
            Chat.ConvertCurencyRequest request = Chat.ConvertCurencyRequest.newBuilder()
                    .setCurrencyFrom(from)
                    .setCurrencyTo(to)
                    .setMessage(message)
                    .build();
            performStream.onNext(request);
        }
    }
}
