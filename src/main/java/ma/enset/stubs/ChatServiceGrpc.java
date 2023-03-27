package ma.enset.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Chat.proto")
public final class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "BanqueService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = ma.enset.stubs.Chat.ConvertCurencyRequest.class,
      responseType = ma.enset.stubs.Chat.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse> getConvertMethod;
    if ((getConvertMethod = ChatServiceGrpc.getConvertMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getConvertMethod = ChatServiceGrpc.getConvertMethod) == null) {
          ChatServiceGrpc.getConvertMethod = getConvertMethod =
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getGetCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCurrencyStream",
      requestType = ma.enset.stubs.Chat.ConvertCurencyRequest.class,
      responseType = ma.enset.stubs.Chat.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getGetCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse> getGetCurrencyStreamMethod;
    if ((getGetCurrencyStreamMethod = ChatServiceGrpc.getGetCurrencyStreamMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getGetCurrencyStreamMethod = ChatServiceGrpc.getGetCurrencyStreamMethod) == null) {
          ChatServiceGrpc.getGetCurrencyStreamMethod = getGetCurrencyStreamMethod =
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "getCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("getCurrencyStream"))
                  .build();
          }
        }
     }
     return getGetCurrencyStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getPerformStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "performStream",
      requestType = ma.enset.stubs.Chat.ConvertCurencyRequest.class,
      responseType = ma.enset.stubs.Chat.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getPerformStreamMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse> getPerformStreamMethod;
    if ((getPerformStreamMethod = ChatServiceGrpc.getPerformStreamMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getPerformStreamMethod = ChatServiceGrpc.getPerformStreamMethod) == null) {
          ChatServiceGrpc.getPerformStreamMethod = getPerformStreamMethod =
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "performStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("performStream"))
                  .build();
          }
        }
     }
     return getPerformStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getFullCurrencyStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullCurrencyStream",
      requestType = ma.enset.stubs.Chat.ConvertCurencyRequest.class,
      responseType = ma.enset.stubs.Chat.ConvertCurrencyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest,
      ma.enset.stubs.Chat.ConvertCurrencyResponse> getFullCurrencyStreamMethod() {
    io.grpc.MethodDescriptor<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse> getFullCurrencyStreamMethod;
    if ((getFullCurrencyStreamMethod = ChatServiceGrpc.getFullCurrencyStreamMethod) == null) {
      synchronized (ChatServiceGrpc.class) {
        if ((getFullCurrencyStreamMethod = ChatServiceGrpc.getFullCurrencyStreamMethod) == null) {
          ChatServiceGrpc.getFullCurrencyStreamMethod = getFullCurrencyStreamMethod =
              io.grpc.MethodDescriptor.<ma.enset.stubs.Chat.ConvertCurencyRequest, ma.enset.stubs.Chat.ConvertCurrencyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "BanqueService", "fullCurrencyStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurencyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ma.enset.stubs.Chat.ConvertCurrencyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new BanqueServiceMethodDescriptorSupplier("fullCurrencyStream"))
                  .build();
          }
        }
     }
     return getFullCurrencyStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BanqueServiceStub newStub(io.grpc.Channel channel) {
    return new BanqueServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BanqueServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BanqueServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BanqueServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BanqueServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BanqueServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void convert(ma.enset.stubs.Chat.ConvertCurencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     * <pre>
     *server stream model
     * </pre>
     */
    public void getCurrencyStream(ma.enset.stubs.Chat.ConvertCurencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrencyStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurencyRequest> performStream(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getPerformStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     *Bidirectional streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullCurrencyStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.ConvertCurencyRequest,
                ma.enset.stubs.Chat.ConvertCurrencyResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetCurrencyStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.ConvertCurencyRequest,
                ma.enset.stubs.Chat.ConvertCurrencyResponse>(
                  this, METHODID_GET_CURRENCY_STREAM)))
          .addMethod(
            getPerformStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.ConvertCurencyRequest,
                ma.enset.stubs.Chat.ConvertCurrencyResponse>(
                  this, METHODID_PERFORM_STREAM)))
          .addMethod(
            getFullCurrencyStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                ma.enset.stubs.Chat.ConvertCurencyRequest,
                ma.enset.stubs.Chat.ConvertCurrencyResponse>(
                  this, METHODID_FULL_CURRENCY_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class BanqueServiceStub extends io.grpc.stub.AbstractStub<BanqueServiceStub> {
    private BanqueServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public void convert(ma.enset.stubs.Chat.ConvertCurencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server stream model
     * </pre>
     */
    public void getCurrencyStream(ma.enset.stubs.Chat.ConvertCurencyRequest request,
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCurrencyStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurencyRequest> performStream(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getPerformStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *Bidirectional streaming model
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurencyRequest> fullCurrencyStream(
        io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullCurrencyStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class BanqueServiceBlockingStub extends io.grpc.stub.AbstractStub<BanqueServiceBlockingStub> {
    private BanqueServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public ma.enset.stubs.Chat.ConvertCurrencyResponse convert(ma.enset.stubs.Chat.ConvertCurencyRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server stream model
     * </pre>
     */
    public java.util.Iterator<ma.enset.stubs.Chat.ConvertCurrencyResponse> getCurrencyStream(
        ma.enset.stubs.Chat.ConvertCurencyRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCurrencyStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BanqueServiceFutureStub extends io.grpc.stub.AbstractStub<BanqueServiceFutureStub> {
    private BanqueServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BanqueServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BanqueServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BanqueServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ma.enset.stubs.Chat.ConvertCurrencyResponse> convert(
        ma.enset.stubs.Chat.ConvertCurencyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_CURRENCY_STREAM = 1;
  private static final int METHODID_PERFORM_STREAM = 2;
  private static final int METHODID_FULL_CURRENCY_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BanqueServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BanqueServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((ma.enset.stubs.Chat.ConvertCurencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse>) responseObserver);
          break;
        case METHODID_GET_CURRENCY_STREAM:
          serviceImpl.getCurrencyStream((ma.enset.stubs.Chat.ConvertCurencyRequest) request,
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PERFORM_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.performStream(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse>) responseObserver);
        case METHODID_FULL_CURRENCY_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullCurrencyStream(
              (io.grpc.stub.StreamObserver<ma.enset.stubs.Chat.ConvertCurrencyResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BanqueServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ma.enset.stubs.Chat.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BanqueService");
    }
  }

  private static final class BanqueServiceFileDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier {
    BanqueServiceFileDescriptorSupplier() {}
  }

  private static final class BanqueServiceMethodDescriptorSupplier
      extends BanqueServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BanqueServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BanqueServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetCurrencyStreamMethod())
              .addMethod(getPerformStreamMethod())
              .addMethod(getFullCurrencyStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
