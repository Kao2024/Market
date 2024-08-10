package ds.service3;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import generated.ds.service3.RequestMessage;
import generated.ds.service3.ResponseMessage;
import generated.ds.service3.Service3Grpc.Service3ImplBase; 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.util.Map;


public class StandardPrice extends Service3ImplBase{
    public static void main(String[] args) throws Exception {
    	
        startMe();
        startGrpc();
    }
    public static void startMe() throws IOException {
	HttpServer server = HttpServer.create(new InetSocketAddress(8003), 0);
        
        server.createContext("/index.html", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Service3 is running at" + server.getAddress() + "/index.html");
	}
    static class MyHandler implements HttpHandler {
    	
        public void handle(HttpExchange t) throws IOException {
            
            String response = "This is the response from Service3 at " + LocalDateTime.now();
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
            
        }
    }
    private final Map<String, Integer> price = Map.of(
        "Product001", 100,
        "Product002", 200,
        "Product003", 300,
        "Product004", 400,
        "Product005", 500,
        "Product006", 600);
    


    public static void startGrpc() throws InterruptedException, IOException {
	StandardPrice service3 = new StandardPrice();

	int port = 50053;

	Server server = ServerBuilder.forPort(port)
            .addService(service3)
            .build()
            .start();

	System.out.println("Service-3 started, listening on " + port);

	server.awaitTermination();
                
    }

    @Override
    public void service3Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

	//prepare the value to be set back
	String ProductNumber = request.getProductNumber();
        int StandardPrice = price.getOrDefault(ProductNumber, -1);
		
	//preparing the response message
	ResponseMessage reply2;
        if (StandardPrice == -1){
            reply2 = ResponseMessage.newBuilder()
                .setProductNumber(ProductNumber + " Product not exist")
                .build();
        }else {
            reply2 = ResponseMessage.newBuilder()
                .setProductNumber(ProductNumber)
                .setPrice(StandardPrice)
                .build();
        }

	responseObserver.onNext( reply2 ); 
	responseObserver.onCompleted();
    }
}
