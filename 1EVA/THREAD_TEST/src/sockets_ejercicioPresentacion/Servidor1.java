package sockets_ejercicioPresentacion;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Servidor1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		DatagramSocket socket = new DatagramSocket(55555);

		while (true) {

			// Preparar

			DatagramPacket paquete = new DatagramPacket(new byte[1024], 1024);

			// Recibir

			socket.receive(paquete);

			// Procesar Deserializar

			ByteArrayInputStream byteArrayInput = new ByteArrayInputStream(paquete.getData());
			ObjectInputStream objectInput = new ObjectInputStream(byteArrayInput);

			Object p = objectInput.readObject();

			System.out.println(p.toString());

		}

	}

}
