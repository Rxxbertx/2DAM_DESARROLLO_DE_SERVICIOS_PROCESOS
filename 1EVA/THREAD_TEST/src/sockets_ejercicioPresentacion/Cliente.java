package sockets_ejercicioPresentacion;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {

	public static void main(String[] args) throws IOException {
		
		
		
		DatagramSocket socket = new DatagramSocket();

        StringBuilder mensaje = new StringBuilder();
        
        mensaje.append("Mensaje enviado desde: ");
        mensaje.append(socket.getLocalAddress().getHostName());
        mensaje.append(" : ");
        mensaje.append(socket.getLocalPort());
        mensaje.append(" : ");
        mensaje.append("DATOS : SOY ROBERTO");
        
        
        byte[] mensajeBytes = mensaje.toString().getBytes();
        
        //cambiar los 0 por la ip del servidor
        InetAddress ip = InetAddress.getByAddress(new byte[] {(byte) 0, (byte) 0, (byte) 0, (byte) 0});

        DatagramPacket paquete = new DatagramPacket(mensajeBytes, mensajeBytes.length, ip, 55555);
        
        
        socket.send(paquete);
        
        // Cierra el socket
        socket.close();

	}

}
