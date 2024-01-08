package sockets_ejercicioPresentacion;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente1 {

	public static void main(String[] args) throws IOException {

		Persona p = new Persona("Roberto", 27, "12345678A");

		DatagramSocket socket = new DatagramSocket();

		ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();
		ObjectOutputStream objectOutput = new ObjectOutputStream(byteArrayOutput);

		objectOutput.writeObject(p);

		byte[] mensajeBytes = byteArrayOutput.toByteArray();

		// cambiar los 0 por la ip del servidor
		InetAddress ip = InetAddress.getByAddress(new byte[] { (byte) 127, (byte) 0, (byte) 0, (byte) 1 });

		DatagramPacket paquete = new DatagramPacket(mensajeBytes, mensajeBytes.length, ip, 55555);

		socket.send(paquete);

		// Cierra el socket
		socket.close();

	}

}
