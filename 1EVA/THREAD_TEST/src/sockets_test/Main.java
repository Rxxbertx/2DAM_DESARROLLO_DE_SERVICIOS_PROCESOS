package sockets_test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {

	static ServerSocket ss;
	static Socket s;
	
	
	public static void main(String[] args) {
		
		byte[] ipBytes = { (byte) 192, (byte) 168, 33, 70 };
		
		try {
			//ss = new ServerSocket(9000);
			System.out.println("INICIO");
			s = new Socket(InetAddress.getByAddress(ipBytes),23);
			System.out.println("connected");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(ss!=null) {
			
			//initServer();
			
		}
		
		if(s!=null) {
			
			initSocketMio();
			
		}
		

	}


	private static void initSocketMio() {
		
		OutputStream os = null;
		
		
		
		
		try {
			
			os =  s.getOutputStream();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (os != null) {
			
			
			
			Scanner sc = new Scanner(System.in);
			
			String temp = sc.nextLine();
			

			if (!temp.isBlank()) {
			
				try {

					os.write(temp.getBytes());
					 os.flush();  // Flush the output stream to ensure data is sent
					    os.close();  // Close the output stream
					System.out.println("DENTRO");
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
	
				


			
		}
		
		
		
		
	}


	private static void initServer() {
		
		Socket alexis;
		
		try {
			 alexis = ss.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
