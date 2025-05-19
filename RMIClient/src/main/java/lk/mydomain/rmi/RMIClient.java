package lk.mydomain.rmi;

import lk.mydomain.rmi.client.Message;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIClient  {
    public static void main(String[] args) {
        try {
          Registry registry = LocateRegistry.getRegistry("localhost",6666);
          registry.list();

          for (String s : registry.list()) {
              System.out.println("registry service: " + s);
          }

         Message message  = (Message) registry.lookup("message service")    ;
         System.out.println(message.hello("Sasanda"));

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
