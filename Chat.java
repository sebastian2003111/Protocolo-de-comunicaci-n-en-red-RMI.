package com.sebas;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Chat extends Remote {
    String enviarMensaje(String nombre, String mensaje) throws RemoteException;
}


