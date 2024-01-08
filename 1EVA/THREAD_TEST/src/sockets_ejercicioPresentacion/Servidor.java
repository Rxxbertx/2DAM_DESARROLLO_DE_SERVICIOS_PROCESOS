package sockets_ejercicioPresentacion;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor {

	public static void main(String[] args) throws IOException {
		
		
		DatagramSocket socket = new DatagramSocket
				(55555);
		
		
				while (true) {

					
					// Preparar
					
					DatagramPacket paquete = new DatagramPacket(new byte[1024], 1024);
					
					
					// Recibir
					
					socket.receive(paquete);
					
					// Procesar
					
					/*StringBuilder mensaje = new StringBuilder();
					mensaje.append("Mensaje recibido de: ");
					mensaje.append(paquete.getAddress().getHostAddress());
					mensaje.append(" : ");
					mensaje.append(paquete.getPort());
					mensaje.append(" : ");
					mensaje.append(new String(paquete.getData()));*/
					
					System.out.println(new String(paquete.getData()));
					
					
				}
		
		

	}

}

