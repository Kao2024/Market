/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds.client;

import ds.service1.LightSwitch;
import ds.service2.Inventory;
import ds.service3.StandardPrice;
import ds.service4.CustomPrice;
import java.io.IOException;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo ;

/**
 *
 * @author HP
 */
public class ServiceRegistration {
     public static void main(String[] args) throws InterruptedException {

        try {
            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
            System.out.println("Registration: InetAddress.getLocalHost():" + InetAddress.getLocalHost());

            //start first service
            //LightSwitch.startMe();
            LightSwitch.startGrpc();
            
            // Register first service
            ServiceInfo service1 = ServiceInfo.create("_grpc._tcp.local.", "LightSwitch", 50051, "Service for LightSwitch");
            jmdns.registerService(service1);
            System.out.println("Registered:" + InetAddress.getLocalHost() + service1.getPort());
                        
            // Wait a bit
            Thread.sleep(2000);
            
            //start second service
            //Inventory.startMe();
            Inventory.startGrpc();
            
            // Register second service
            ServiceInfo service2 = ServiceInfo.create("_grpc._tcp.local.", "Inventory", 50052, "Service for Inventory");
            jmdns.registerService(service2);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service2.getPort());
            
            // Wait a bit
            Thread.sleep(2000);
            
            //start third service
            //StandardPrice.startMe();
            StandardPrice.startGrpc();
            
            // Register third service            
            ServiceInfo service3 = ServiceInfo.create("_grpc._tcp.local.", "StandardPrice", 50053, "Service for Price");
            jmdns.registerService(service3);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service3.getPort());
            
            // Wait a bit
            Thread.sleep(2000);
            
            //start fourth service
            //CustomPrice.startMe();
            CustomPrice.startGrpc();
            
            // Register fourth service
            ServiceInfo service4 = ServiceInfo.create("_grpc._tcp.local.", "CustomPrice", 50054, "Service for enquiry");
            jmdns.registerService(service4);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service4.getPort());
            
            // Wait a bit
            Thread.sleep(2000);
            
            // Unregister all services
            jmdns.unregisterAllServices();
        
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
