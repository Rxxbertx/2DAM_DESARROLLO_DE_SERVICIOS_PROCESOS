package sockets_ejercicioPresentacion;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.util.Scanner;

public class MultiCastSocketCliente extends Thread {

	String nombre;
	InetAddress ip;
	MulticastSocket socket;
	int puerto;

	public MultiCastSocketCliente(String nombre, InetAddress ip, int puerto) {

		this.nombre = nombre;
		this.ip = ip;
		this.puerto = puerto;
	}

	public void initSocket() {

		try {
			socket = new MulticastSocket();

			System.out.println("INGRESO AL CHAT DE GRUPO CORRECTO");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	};

	@Override
	public void run() {

		initSocket();
		super.run();

		Scanner sc = new Scanner(System.in);

		while (!isInterrupted()) {

			String mensaje = nombre + ": " + sc.nextLine();

			DatagramPacket paquete = new DatagramPacket(mensaje.getBytes(), mensaje.length(), ip, puerto);

			if (socket != null) {
				try {
					socket.send(paquete);
					
				} catch (IOException e) {

					e.printStackTrace();
					socket.close();
					interrupt();
				}
			}

		}
		sc.close();

	}

}
