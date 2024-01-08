package sockets_ejercicioPresentacion;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class Main {

	public static void main(String[] args) throws UnknownHostException, SocketException {

		InetAddress ip = InetAddress.getByAddress(new byte[] { (byte) 224, (byte) 0, (byte) 0, (byte) 1 });

		int puerto = 55555;

		MultiCastSocketServidor server = new MultiCastSocketServidor(ip, puerto);

		MultiCastSocketCliente cliente = new MultiCastSocketCliente("Roberto", ip, puerto);

		
		for (Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
                interfaces.hasMoreElements(); ) {

               NetworkInterface networkInterface = interfaces.nextElement();
               System.out.println("Nombre de interfaz: " + networkInterface.getName());
               System.out.println("Nombre de interfaz mostrable: " + networkInterface.getDisplayName());
		}
		
	
		
		
		server.start();
		cliente.start();

		try {

			server.join();
			cliente.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
