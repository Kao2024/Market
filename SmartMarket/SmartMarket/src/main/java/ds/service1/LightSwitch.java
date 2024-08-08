package ds.service1;

import java.io.IOException;

import generated.ds.service1.LightRequest;
import generated.ds.service1.LightResponse;
import generated.ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.util.HashMap;
import java.util.Map;


public class LightSwitch extends Service1ImplBase{
    private final Map<String, Boolean> Lights = new HashMap<>(Map.of(
        "Light1", false,
        "Light2", false,
        "Light3", false,
        "Light4", false,
        "Light5", false));
        
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


   
    public StreamObserver<LightRequest> TurnOn(StreamObserver<LightResponse> responseObserver) {
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
   
    public StreamObserver<LightRequest> TurnOff(StreamObserver<LightResponse> responseObserver) {
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