package com.sebas;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ChatImpl extends UnicastRemoteObject implements Chat {
    protected ChatImpl() throws RemoteException {
        super();
    }

    @Override
    public String enviarMensaje(String nombre, String mensaje) throws RemoteException {
        return "📩 [" + nombre + "]: " + mensaje;
    }
}

