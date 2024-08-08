package ds.service4;

import ds.service3.*;
import java.io.IOException;

import generated.ds.service4.RequestMessage;
import generated.ds.service4.ResponseMessage;
import generated.ds.service4.Service4Grpc.Service4ImplBase; 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Map;


public class CustomPrice extends Service4ImplBase{
    private final Map<String, Integer> price = Map.of(
        "Product001", 100,
        "Product002", 200,
        "Product003", 300,
        "Product004", 400,
        "Product005", 500,
        "Product006", 600);
    


    public static void main(String[] args) throws InterruptedException, IOException {
	CustomPrice service3 = new CustomPrice();

	int port = 50054;

	Server server = ServerBuilder.forPort(port)
            .addService(service3)
            .build()
            .start();

	System.out.println("Service-3 started, listening on " + port);

	server.awaitTermination();
                
    }

//    @Override
//    public void service3Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
//
//	//prepare the value to be set back
//	String ProductNumber = request.getProductNumber();
//        int StandardPrice = price.getOrDefault(ProductNumber, -1);
//		
//	//preparing the response message
//	ResponseMessage reply3;
//        if (StandardPrice == -1){
//            reply3 = ResponseMessage.newBuilder()
//                .setProductNumber(ProductNumber + " Product not exist")
//                .build();
//        }else {
//            reply3 = ResponseMessage.newBuilder()
//                .setProductNumber(ProductNumber)
//                .setPrice(StandardPrice)
//                .build();
//        }
//
//	responseObserver.onNext( reply3 ); 
//	responseObserver.onCompleted();
//    }
}
