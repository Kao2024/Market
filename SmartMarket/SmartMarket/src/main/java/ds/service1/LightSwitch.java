package ds.service1;

import java.io.IOException;

import generated.ds.service1.LightRequest;
import generated.ds.service1.LightResponse;
import generated.ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.Map;


public class LightSwitch extends Service1ImplBase{
    private final Map<String, Boolean> Lights = Map.of(
        "Light1", false,
        "Light2", false,
        "Light3", false,
        "Light4", false,
        "Light5", false);
        
    public static void main(String[] args) throws InterruptedException, IOException {
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
    public StreamObserver<LightRequest> TurnOn(StreamObserver<LightResponse> responseObserver) {
    
        // Retrieve the value from the stream of requests of the client. 
	return new StreamObserver<LightRequest>() {
        		
            // For each message in the stream, get one stream at a time.
            @Override
            public void onNext(LightRequest request) {
                // The default light status is false which is off, change to true to turn on 
                Lights.put(request.getLightNumber(), true);

            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub

            }

            // Once the complete stream is received this logic will be executed.
            @Override
            public void onCompleted() {
                // Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
                // Here, response is sent once the client is done with sending the stream.
                StringBuilder LightNumber = new StringBuilder();
                boolean status = true;
                
                LightResponse response = LightResponse.newBuilder()
                    .setLightNumber(LightNumbers.toString())
                    .setStatus(status)
                    .build();
                responseObserver.onNext(LightResponse);
                responseObserver.onCompleted();
            }
                
        };
    }
    @Override
    public StreamObserver<LightRequest> TurnOff(StreamObserver<LightResponse> responseObserver) {
    
        // Retrieve the value from the stream of requests of the client. 
	return new StreamObserver<LightRequest>() {
        		
            // For each message in the stream, get one stream at a time.
            @Override
            public void onNext(LightRequest request) {
                // The default light status is false which is off, change to true to turn on 
                Lights.put(request.getLightNumber(), true);

            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub

            }


            // Once the complete stream is received this logic will be executed.
            @Override
            public void onCompleted() {
                // Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
                // Here, response is sent once the client is done with sending the stream.
                LightResponse.Builder responseBuilder = LightResponse.newBuilder();
                //preparing the response message
		LightResponse reply1 = LightResponse.newBuilder()
                        .setlightNumber(lightNumber)
                        .setStatus(status)
                        .build();
		responseObserver.onNext( reply1 ); 
                LightResponse reply1 = LightResponse.newBuilder()
                        .setlightNumber(lightNumber)
                        .setStatus(status)
                        .build();
		responseObserver.onNext( reply2 );
                LightResponse reply1 = LightResponse.newBuilder()
                        .setlightNumber(lightNumber)
                        .setStatus(status)
                        .build();
		responseObserver.onNext( reply3 );
                
                responseObserver.onCompleted();
            }
        };
    }   
    
}