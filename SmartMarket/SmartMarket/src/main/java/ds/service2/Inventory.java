package ds.service2;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import generated.ds.service2.RequestMessage;
import generated.ds.service2.ResponseMessage;
import generated.ds.service2.Service2Grpc.Service2ImplBase; 
import generated.ds.service2.StockRequest;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.util.Map;


public class Inventory extends Service2ImplBase{
    public static void main(String[] args) throws Exception {
    	
        //startMe();
        startGrpc();
    }
//    public static void startMe() throws IOException {
//	HttpServer server2 = HttpServer.create(new InetSocketAddress(8002), 0);
//        
//        server2.createContext("/index.html", new MyHandler());
//        server2.setExecutor(null); // creates a default executor
//        server2.start();
//        System.out.println("Service2 is running at" + server2.getAddress() + "/index.html");
//	}
//    static class MyHandler implements HttpHandler {
//    	
//        public void handle(HttpExchange t) throws IOException {
//            
//            String response = "This is the response from Service2 at " + LocalDateTime.now();
//            t.sendResponseHeaders(200, response.length());
//            OutputStream os = t.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//            
//        }
//    }
    
    
    
    private final Map<String, Integer> inventory = Map.of(
        "Product001", 10,
        "Product002", 20,
        "Product003", 30,
        "Product004", 40,
        "Product005", 50,
        "Product006", 60);
    


    public static void startGrpc() throws InterruptedException, IOException {
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
    public void inStock(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

	//prepare the value to be set back
	String ProductNumber = request.getProductNumber();
        int stock = inventory.getOrDefault(ProductNumber, 0);
		
	//preparing the response message
	ResponseMessage reply = ResponseMessage.newBuilder()
                .setProductNumber(ProductNumber)
                .setStock(stock)
                .build();

	responseObserver.onNext( reply ); 
	responseObserver.onCompleted();
    }
    
    @Override
    public void allStock(StockRequest request, StreamObserver<ResponseMessage> responseObserver) {
        inventory.forEach((product, stock) -> {
            ResponseMessage response = ResponseMessage.newBuilder()
                    .setProductNumber(product)
                    .setStock(stock)
                    .build();
            responseObserver.onNext(response);
            
        });
        responseObserver.onCompleted();
    }
}
