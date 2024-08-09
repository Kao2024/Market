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

            //start a service
            LightSwitch.startMe(); 
            //Inventory.startMe();
            //StandardPrice.startMe();
            //CustomPrice.startMe();
            
            // Register a service
            ServiceInfo service1 = ServiceInfo.create("_http._tcp.local.", "service1", 50051, "path=index.html");
            jmdns.registerService(service1);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service1.getPort());
            
            ServiceInfo service2 = ServiceInfo.create("_http._tcp.local.", "service2", 50052, "path=index.html");
            jmdns.registerService(service2);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service2.getPort());
            
            ServiceInfo service3 = ServiceInfo.create("_http._tcp.local.", "service3", 50053, "path=index.html");
            jmdns.registerService(service3);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service3.getPort());
            
            ServiceInfo service4 = ServiceInfo.create("_http._tcp.local.", "service4", 50054, "path=index.html");
            jmdns.registerService(service4);
            System.out.println("Registered: :" + InetAddress.getLocalHost() + service4.getPort());
            
            // Wait a bit
            Thread.sleep(2000);
         
            
            
            // Unregister all services
            //jmdns.unregisterAllServices();
            

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
