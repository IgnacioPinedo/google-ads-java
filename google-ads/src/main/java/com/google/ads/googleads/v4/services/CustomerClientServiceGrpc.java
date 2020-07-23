package com.google.ads.googleads.v4.services;

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
 * Service to get clients in a customer's hierarchy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/ads/googleads/v4/services/customer_client_service.proto")
public final class CustomerClientServiceGrpc {

  private CustomerClientServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v4.services.CustomerClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCustomerClientRequest,
      com.google.ads.googleads.v4.resources.CustomerClient> getGetCustomerClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerClient",
      requestType = com.google.ads.googleads.v4.services.GetCustomerClientRequest.class,
      responseType = com.google.ads.googleads.v4.resources.CustomerClient.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCustomerClientRequest,
      com.google.ads.googleads.v4.resources.CustomerClient> getGetCustomerClientMethod() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v4.services.GetCustomerClientRequest, com.google.ads.googleads.v4.resources.CustomerClient> getGetCustomerClientMethod;
    if ((getGetCustomerClientMethod = CustomerClientServiceGrpc.getGetCustomerClientMethod) == null) {
      synchronized (CustomerClientServiceGrpc.class) {
        if ((getGetCustomerClientMethod = CustomerClientServiceGrpc.getGetCustomerClientMethod) == null) {
          CustomerClientServiceGrpc.getGetCustomerClientMethod = getGetCustomerClientMethod =
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v4.services.GetCustomerClientRequest, com.google.ads.googleads.v4.resources.CustomerClient>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.services.GetCustomerClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v4.resources.CustomerClient.getDefaultInstance()))
              .setSchemaDescriptor(new CustomerClientServiceMethodDescriptorSupplier("GetCustomerClient"))
              .build();
        }
      }
    }
    return getGetCustomerClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerClientServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerClientServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerClientServiceStub>() {
        @java.lang.Override
        public CustomerClientServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerClientServiceStub(channel, callOptions);
        }
      };
    return CustomerClientServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerClientServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerClientServiceBlockingStub>() {
        @java.lang.Override
        public CustomerClientServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerClientServiceBlockingStub(channel, callOptions);
        }
      };
    return CustomerClientServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CustomerClientServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CustomerClientServiceFutureStub>() {
        @java.lang.Override
        public CustomerClientServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CustomerClientServiceFutureStub(channel, callOptions);
        }
      };
    return CustomerClientServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to get clients in a customer's hierarchy.
   * </pre>
   */
  public static abstract class CustomerClientServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested client in full detail.
     * </pre>
     */
    public void getCustomerClient(com.google.ads.googleads.v4.services.GetCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CustomerClient> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCustomerClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v4.services.GetCustomerClientRequest,
                com.google.ads.googleads.v4.resources.CustomerClient>(
                  this, METHODID_GET_CUSTOMER_CLIENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to get clients in a customer's hierarchy.
   * </pre>
   */
  public static final class CustomerClientServiceStub extends io.grpc.stub.AbstractAsyncStub<CustomerClientServiceStub> {
    private CustomerClientServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerClientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested client in full detail.
     * </pre>
     */
    public void getCustomerClient(com.google.ads.googleads.v4.services.GetCustomerClientRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CustomerClient> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to get clients in a customer's hierarchy.
   * </pre>
   */
  public static final class CustomerClientServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CustomerClientServiceBlockingStub> {
    private CustomerClientServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerClientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested client in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v4.resources.CustomerClient getCustomerClient(com.google.ads.googleads.v4.services.GetCustomerClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerClientMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to get clients in a customer's hierarchy.
   * </pre>
   */
  public static final class CustomerClientServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CustomerClientServiceFutureStub> {
    private CustomerClientServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerClientServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CustomerClientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested client in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v4.resources.CustomerClient> getCustomerClient(
        com.google.ads.googleads.v4.services.GetCustomerClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CUSTOMER_CLIENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CUSTOMER_CLIENT:
          serviceImpl.getCustomerClient((com.google.ads.googleads.v4.services.GetCustomerClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v4.resources.CustomerClient>) responseObserver);
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

  private static abstract class CustomerClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CustomerClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v4.services.CustomerClientServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CustomerClientService");
    }
  }

  private static final class CustomerClientServiceFileDescriptorSupplier
      extends CustomerClientServiceBaseDescriptorSupplier {
    CustomerClientServiceFileDescriptorSupplier() {}
  }

  private static final class CustomerClientServiceMethodDescriptorSupplier
      extends CustomerClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CustomerClientServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CustomerClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CustomerClientServiceFileDescriptorSupplier())
              .addMethod(getGetCustomerClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
