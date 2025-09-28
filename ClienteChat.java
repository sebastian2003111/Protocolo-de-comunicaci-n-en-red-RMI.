package com.sebas;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteChat {
    public static void main(String[] args) {
        try {
            Registry registro = LocateRegistry.getRegistry("localhost", 1099);
            Chat chat = (Chat) registro.lookup("Chat");

            Scanner scanner = new Scanner(System.in); 
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();

            while (true) {
                System.out.print("Escribe un mensaje: ");
                String mensaje = scanner.nextLine();
                String respuesta = chat.enviarMensaje(nombre, mensaje);
                System.out.println(respuesta);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


