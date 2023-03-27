package ma.enset.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import ma.enset.services.ChatGrpcService;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(5555)
                .addService(new ChatGrpcService())
                .build();
        server.start();
        server.awaitTermination();
    }
}
