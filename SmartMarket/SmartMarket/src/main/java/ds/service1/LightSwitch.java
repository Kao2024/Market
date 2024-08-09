package ds.service1;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import generated.ds.service1.LightRequest;
import generated.ds.service1.LightResponse;
import generated.ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


public class LightSwitch extends Service1ImplBase{
    public static void main(String[] args) throws Exception {
    	
        startMe();
        startGrpc();
    }
    
    public static void startMe() throws IOException {
	HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
        server.createContext("/index.html", new MyHandler());
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Service1 is running at" + server.getAddress() + "/index.html");
	}
    static class MyHandler implements HttpHandler {
    	
        public void handle(HttpExchange t) throws IOException {
            
            String response = "This is the response from Service1 at " + LocalDateTime.now();
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
            
        }
    }
    private final Map<String, Boolean> Lights = new HashMap<>(Map.of(
        "Light1", false,
        "Light2", false,
        "Light3", false,
        "Light4", false,
        "Light5", false));
        
    public static void startGrpc() throws InterruptedException, IOException {
	LightSwitch service1 = new LightSwitch();

	int port = 50051;

	Server server = ServerBuilder.forPort(port)
			.addService(service1)
			.build()
			.start();

	System.out.println("Service-1 started, listening on " + port);

	server.awaitTermination();
    }


    @Override
    public StreamObserver<LightRequest> turnOn(StreamObserver<LightResponse> responseObserver) {
        return new StreamObserver<LightRequest>() {
            @Override
            public void onNext(LightRequest request) {
                String lightNumber = request.getLightNumber();
                Lights.put(lightNumber, true);

                LightResponse response = LightResponse.newBuilder()
                        .setLightNumber(lightNumber)
                        .setStatus(true)
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
    
    @Override
    public StreamObserver<LightRequest> turnOff(StreamObserver<LightResponse> responseObserver) {
        return new StreamObserver<LightRequest>() {
            @Override
            public void onNext(LightRequest request) {
                String lightNumber = request.getLightNumber();
                Lights.put(lightNumber, false);

                LightResponse response = LightResponse.newBuilder()
                        .setLightNumber(lightNumber)
                        .setStatus(false)
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