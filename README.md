# 📡 Proyecto Chat Distribuido con Java RMI  

Este proyecto implementa un **sistema de chat distribuido** utilizando **Java RMI (Remote Method Invocation)**.  
El objetivo es demostrar cómo funciona la comunicación en red mediante RMI, permitiendo que múltiples clientes se conecten a un servidor central para enviar y recibir mensajes.  

---

## 📑 Descripción  

El chat distribuido está compuesto por:  

- **Servidor RMI** 👉 Registra el servicio de chat y gestiona los mensajes enviados por los clientes.  
- **Interfaz Remota (Chat.java)** 👉 Define los métodos que pueden invocar los clientes de forma remota.  
- **Implementación del Servicio (ChatImpl.java)** 👉 Contiene la lógica para procesar y devolver los mensajes.  
- **Cliente (ClienteChat.java)** 👉 Cada cliente se conecta al servidor, ingresa su nombre y puede enviar mensajes.  

Con esto, se simula un chat simple donde los usuarios interactúan a través de un **servidor remoto**.  


---

## 📖 Explicación de los Archivos

## Chat.java

- Define la interfaz remota con el método enviarMensaje.

- Es el contrato que tanto servidor como clientes deben cumplir.

## ChatImpl.java

- Implementa la lógica del método enviarMensaje.

- Retorna un mensaje con el formato: "[Usuario]: Mensaje".

## ServidorChat.java

- Crea e inicia el registro RMI en el puerto 1099.

- Publica el objeto remoto para que los clientes lo encuentren.

## ClienteChat.java

- Se conecta al registro RMI del servidor.

- Solicita el nombre del usuario y permite enviar mensajes en un bucle infinito.

---

## 🎯 Conclusión

Este proyecto demuestra cómo Java RMI simplifica la creación de aplicaciones distribuidas,
donde diferentes procesos pueden comunicarse de manera transparente como si fueran locales.
El sistema de chat implementado sirve como ejemplo práctico del uso de interfaces remotas,registro RMI,
invocación de métodos a distancia y comunicación cliente-servidor, lo que constituye la base para aplicaciones distribuidas más complejas.

---

## ⚙️ Requisitos  

- **Java JDK 11 o superior** (se recomienda JDK 17 o JDK 21).  
- Sistema operativo Windows, Linux o macOS.  
- Editor o IDE (Visual Studio Code, NetBeans, IntelliJ o similar).  
- Git para clonar el repositorio (opcional).  
