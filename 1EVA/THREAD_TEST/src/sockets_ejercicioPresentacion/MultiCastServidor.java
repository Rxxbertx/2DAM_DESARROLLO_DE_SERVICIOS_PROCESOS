package sockets_ejercicioPresentacion;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;

public class MultiCastServidor {

	public static void main(String[] args) throws IOException {
		
		byte [] multicastGroup = {(byte) 239,(byte) 239,(byte) 239,(byte) 239};
		int port = 55555;
		
		InetAddress groupAddress = InetAddress.getByAddress(multicastGroup);
		
		InetSocketAddress groupSocketAddress = new InetSocketAddress(groupAddress, port);
		
		NetworkInterface networkInterface = NetworkInterface.getByInetAddress(groupAddress);
		
		
		MulticastSocket multicast = new MulticastSocket();
		
		multicast.joinGroup(groupSocketAddress, networkInterface);
		
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		multicast.receive(packet);
		
		System.out.println(packet.getData());
		
		multicast.close();

	}

}
