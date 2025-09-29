package com.sebas;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorChat {
    public static void main(String[] args) {
        try {
            ChatImpl chat = new ChatImpl();
            Registry registro = LocateRegistry.createRegistry(1099);
            registro.rebind("Chat", chat);
            System.out.println("Servidor de Chat RMI listo...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}

