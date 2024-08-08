package generated.ds.service2;

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
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service2.proto")
public final class Service2Grpc {

  private Service2Grpc() {}

  public static final String SERVICE_NAME = "service2.Service2";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.ds.service2.RequestMessage,
      generated.ds.service2.ResponseMessage> getInStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InStock",
      requestType = generated.ds.service2.RequestMessage.class,
      responseType = generated.ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ds.service2.RequestMessage,
      generated.ds.service2.ResponseMessage> getInStockMethod() {
    io.grpc.MethodDescriptor<generated.ds.service2.RequestMessage, generated.ds.service2.ResponseMessage> getInStockMethod;
    if ((getInStockMethod = Service2Grpc.getInStockMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getInStockMethod = Service2Grpc.getInStockMethod) == null) {
          Service2Grpc.getInStockMethod = getInStockMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service2.RequestMessage, generated.ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "InStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.RequestMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("InStock"))
                  .build();
          }
        }
     }
     return getInStockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ds.service2.StockRequest,
      generated.ds.service2.ResponseMessage> getAllStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AllStock",
      requestType = generated.ds.service2.StockRequest.class,
      responseType = generated.ds.service2.ResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.ds.service2.StockRequest,
      generated.ds.service2.ResponseMessage> getAllStockMethod() {
    io.grpc.MethodDescriptor<generated.ds.service2.StockRequest, generated.ds.service2.ResponseMessage> getAllStockMethod;
    if ((getAllStockMethod = Service2Grpc.getAllStockMethod) == null) {
      synchronized (Service2Grpc.class) {
        if ((getAllStockMethod = Service2Grpc.getAllStockMethod) == null) {
          Service2Grpc.getAllStockMethod = getAllStockMethod = 
              io.grpc.MethodDescriptor.<generated.ds.service2.StockRequest, generated.ds.service2.ResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "service2.Service2", "AllStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.StockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ds.service2.ResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new Service2MethodDescriptorSupplier("AllStock"))
                  .build();
          }
        }
     }
     return getAllStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static Service2Stub newStub(io.grpc.Channel channel) {
    return new Service2Stub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static Service2BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new Service2BlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static Service2FutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new Service2FutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class Service2ImplBase implements io.grpc.BindableService {

    /**
     */
    public void inStock(generated.ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<generated.ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getInStockMethod(), responseObserver);
    }

    /**
     */
    public void allStock(generated.ds.service2.StockRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service2.ResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAllStockMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInStockMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ds.service2.RequestMessage,
                generated.ds.service2.ResponseMessage>(
                  this, METHODID_IN_STOCK)))
          .addMethod(
            getAllStockMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                generated.ds.service2.StockRequest,
                generated.ds.service2.ResponseMessage>(
                  this, METHODID_ALL_STOCK)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2Stub extends io.grpc.stub.AbstractStub<Service2Stub> {
    private Service2Stub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2Stub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2Stub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2Stub(channel, callOptions);
    }

    /**
     */
    public void inStock(generated.ds.service2.RequestMessage request,
        io.grpc.stub.StreamObserver<generated.ds.service2.ResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInStockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void allStock(generated.ds.service2.StockRequest request,
        io.grpc.stub.StreamObserver<generated.ds.service2.ResponseMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAllStockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2BlockingStub extends io.grpc.stub.AbstractStub<Service2BlockingStub> {
    private Service2BlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2BlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2BlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2BlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.ds.service2.ResponseMessage inStock(generated.ds.service2.RequestMessage request) {
      return blockingUnaryCall(
          getChannel(), getInStockMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<generated.ds.service2.ResponseMessage> allStock(
        generated.ds.service2.StockRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAllStockMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class Service2FutureStub extends io.grpc.stub.AbstractStub<Service2FutureStub> {
    private Service2FutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private Service2FutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected Service2FutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new Service2FutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.ds.service2.ResponseMessage> inStock(
        generated.ds.service2.RequestMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getInStockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IN_STOCK = 0;
  private static final int METHODID_ALL_STOCK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final Service2ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(Service2ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IN_STOCK:
          serviceImpl.inStock((generated.ds.service2.RequestMessage) request,
              (io.grpc.stub.StreamObserver<generated.ds.service2.ResponseMessage>) responseObserver);
          break;
        case METHODID_ALL_STOCK:
          serviceImpl.allStock((generated.ds.service2.StockRequest) request,
              (io.grpc.stub.StreamObserver<generated.ds.service2.ResponseMessage>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    Service2BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.ds.service2.Service2Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service2");
    }
  }

  private static final class Service2FileDescriptorSupplier
      extends Service2BaseDescriptorSupplier {
    Service2FileDescriptorSupplier() {}
  }

  private static final class Service2MethodDescriptorSupplier
      extends Service2BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    Service2MethodDescriptorSupplier(String methodName) {
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
      synchronized (Service2Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new Service2FileDescriptorSupplier())
              .addMethod(getInStockMethod())
              .addMethod(getAllStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
