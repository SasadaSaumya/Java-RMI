package lk.mydomain.rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {

    public static void main(String[] args) {

        try {
         Registry registry = LocateRegistry.createRegistry(6666); //use not using port

         registry.bind("message_service",new MessageImpl());
         registry.bind("student_service",new StudentImpl());

         System.out.println("RMI Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
