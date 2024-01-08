package sockets_ejercicioPresentacion;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class MultiCastSocketServidor extends Thread {

	InetAddress ip;
	int puerto;
	InetSocketAddress group;
	MulticastSocket socket;
	NetworkInterface nInterface;

	public MultiCastSocketServidor(InetAddress ip, int puerto) {

		this.ip = ip;
		this.puerto = puerto;

	}

	void initSocket() {

		if (ip != null && puerto > 0) {

			try {
				socket = new MulticastSocket(puerto);

				group = new InetSocketAddress(ip, puerto);

				nInterface = NetworkInterface.getByName("en2");
				
				socket.joinGroup(group, nInterface);
				
				System.out.println("CHAT DE GRUPO INICIALIZADO");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	};

	@Override
	public void run() {

		initSocket();
		super.run();

		while (!isInterrupted()) {

			DatagramPacket paquete = new DatagramPacket(new byte[1024], 1024);

			try {
				socket.receive(paquete);
				System.out.println("\n"+new String(paquete.getData()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				interrupt();
			}

		}

	}

}
