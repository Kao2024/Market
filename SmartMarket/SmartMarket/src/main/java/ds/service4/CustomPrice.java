package ds.service4;

import java.io.IOException;

import generated.ds.service4.EnquiryRequest;
import generated.ds.service4.EnquiryResponse;
import generated.ds.service4.Service4Grpc.Service4ImplBase; 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.Map;


public class CustomPrice extends Service4ImplBase{
    private final Map<String, Integer> price = new HashMap<>(Map.of(
        "Product001", 100,
        "Product002", 200,
        "Product003", 300,
        "Product004", 400,
        "Product005", 500,
        "Product006", 600));
    


    public static void main(String[] args) throws InterruptedException, IOException {
	CustomPrice service4 = new CustomPrice();

	int port = 50054;

	Server server = ServerBuilder.forPort(port)
            .addService(service4)
            .build()
            .start();

	System.out.println("Service-4 started, listening on " + port);

	server.awaitTermination();
                
    }

    @Override
    public StreamObserver<EnquiryRequest> customizedPrice(StreamObserver<EnquiryResponse> responseObserver) {
        return new StreamObserver<EnquiryRequest>() {
            @Override
            public void onNext(EnquiryRequest request) {
                
            //prepare the value to be set back
            int standardPrice = price.get(request.getProductNumber());
            int customizePrice = standardPrice;
	
            //preparing the response message
            if ("10 coupon".equals(request.getCouponNumber())) {
                        customizePrice -= 10; 
            }
            if ("home".equals(request.getDelivery())) {
                        customizePrice += 20;
            }
            EnquiryResponse response = EnquiryResponse.newBuilder()
                        .setProductNumber(request.getProductNumber())
                        .setPrice(customizePrice)
                        .build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}