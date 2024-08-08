package ds.service2;

import java.io.IOException;

import generated.ds.service2.RequestMessage;
import generated.ds.service2.ResponseMessage;
import generated.ds.service2.Service2Grpc.Service2ImplBase; 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Map;


public class Inventory extends Service2ImplBase{
    private final Map<String, Integer> inventory = Map.of(
        "Product001", 10,
        "Product002", 20,
        "Product003", 30,
        "Product004", 40,
        "Product005", 50,
        "Product006", 60);
    


    public static void main(String[] args) throws InterruptedException, IOException {
	Inventory service2 = new Inventory();

	int port = 50052;

	Server server = ServerBuilder.forPort(port)
            .addService(service2)
            .build()
            .start();

	System.out.println("Service-2 started, listening on " + port);

	server.awaitTermination();
                
    }

    @Override
    public void service2Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

	//prepare the value to be set back
	String ProductNumber = request.getProductNumber();
        int stock = inventory.getOrDefault(ProductNumber, 0);
		
	//preparing the response message
	ResponseMessage reply1 = ResponseMessage.newBuilder()
                .setProductNumber(ProductNumber)
                .setStock(stock)
                .build();

	responseObserver.onNext( reply1 ); 
	responseObserver.onCompleted();
	}
}
