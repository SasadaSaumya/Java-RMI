package lk.mydomain.rmi;

import lk.mydomain.rmi.client.StudentService;
import lk.mydomain.rmi.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class StudentImpl extends UnicastRemoteObject implements StudentService {

    protected StudentImpl() throws RemoteException {
    }

    @Override
    public List<Student> getStudents() throws RemoteException {
        return List.of(
                new Student(1,"Amaya","Colombo","0778790231"),
                new Student(2,"Janith","Kandy","0728790431"),
                new Student(3,"Seth","Gampaha","0718794231")
        );
    }
}
