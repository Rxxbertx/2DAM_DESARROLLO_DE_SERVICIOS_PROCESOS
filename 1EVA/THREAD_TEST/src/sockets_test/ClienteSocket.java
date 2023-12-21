package sockets_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteSocket {

	public static void main(String[] args) throws UnknownHostException, IOException {

		byte[] ipBytes = { (byte) 192, (byte) 168, 33, 70 };

		// Conectar al servidor en la IP y puerto especificados
		Socket socket = new Socket(InetAddress.getByAddress(ipBytes), 9000);

		System.out.println("CONNECTED");

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

		// Crear flujos de entrada/salida para comunicarse con el servidor

		Runnable cliente = new Runnable() {

			@Override
			public void run() {

				Scanner sc = new Scanner(System.in);

				while (true) {

					String opc = sc.nextLine();
					// Enviar un mensaje al servidor desde el telnet

					out.println(opc);

					if (opc.equals("salir")) {
						break;
					}

				}

			}
		};
		Thread hilo2 = new Thread(cliente);
		hilo2.start();

		Runnable server = new Runnable() {

			@Override
			public void run() {

				while (true) {

					try {

						String respuestaServidor;

						if (socket.isInputShutdown()) {
							break;
						}
						
						respuestaServidor = in.readLine();

						
						
						if (respuestaServidor != null) {
							System.out.println("Alexis: " + respuestaServidor);
							if (respuestaServidor.equals("salir")) {
								break;
							}
						}

					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		};
		Thread hilo = new Thread(server);
		hilo.start();

		try {
			hilo.join();
			hilo2.join();
			socket.close();
			in.close();
			out.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
