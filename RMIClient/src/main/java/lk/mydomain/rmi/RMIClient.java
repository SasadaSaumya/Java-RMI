package lk.mydomain.rmi;

import lk.mydomain.rmi.client.Message;
import lk.mydomain.rmi.client.StudentService;
import lk.mydomain.rmi.model.Student;

import javax.naming.Context;
import javax.naming.InitialContext;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Properties;

public class RMIClient  {
    public static void main(String[] args) {
        try {
          Registry registry = LocateRegistry.getRegistry("localhost",6666);
          registry.list();

          for (String s : registry.list()) {
              System.out.println("registry service: " + s);
          }

//            StudentService studentService  = (StudentService) registry.lookup("student_service")    ;
//
//            List<Student> students = studentService.getStudents();
//            for (Student student : students) {
//                System.out.println(student.getId() + " " + student.getName() + " " + student.getAddress() + " " + student.getContact());
//            }

            //other option 1
//          StudentService studentService1 = (StudentService) Naming.lookup("rmi://localhost:6666/student_service");
//            List<Student> students = studentService1.getStudents();
//            for (Student student : students) {
//                System.out.println(student.getId() + " : " + student.getName() + " " + student.getAddress() + " " + student.getContact());
//            }

            //other option 2 most used

            Properties prop = new Properties();
            prop.put(Context.PROVIDER_URL, "rmi://localhost:6666");
            prop.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.rmi.registry.RegistryContextFactory");

            InitialContext context = new InitialContext(prop);
            StudentService studentService2 = (StudentService) context.lookup("student_service");
            List<Student> students = studentService2.getStudents();
            for (Student student : students) {
                System.out.println(student.getId() + " : " + student.getName() + " " + student.getAddress() + " " + student.getContact());
            }

//         Message message  = (Message) registry.lookup("message_service")    ;
//         System.out.println(message.hello("Sasanda"));

        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
