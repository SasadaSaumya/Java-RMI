package lk.mydomain.rmi;

import lk.mydomain.rmi.client.Message;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements Message {


    protected MessageImpl() throws RemoteException {
    }

    @Override
    public String hello(String name) throws RemoteException {
        return "Hello " + name;
    }
}
