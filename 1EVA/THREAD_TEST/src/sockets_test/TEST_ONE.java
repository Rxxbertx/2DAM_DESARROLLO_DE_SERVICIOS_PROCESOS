package sockets_test;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TEST_ONE {

	public static void main(String[] args) throws URISyntaxException, IOException {

		Scanner sc = new Scanner(System.in);

		while (true) {
			
			Boolean salir=false;
			
			menu();
			switch (sc.nextLine()) {
			case "1":
					inetAddress();
				break;
			case "2":
					url();
				break;
			case "3":
					urlConnection();
				break;

			default:
				salir=true;
				break;
				
			}
			
			if (salir)break;
		}

		
		

		

	}

	private static void urlConnection() throws IOException, URISyntaxException {
		
		URL url = new URI("https://www.lamaravillosaorquestadelalcohol.com").toURL();
		URLConnection urlCon = url.openConnection();
		InputStream is =  urlCon.getInputStream();

		int data = 0;

		while ((data = is.read()) != -1) {

			System.out.print((char) data);

		}

		is.close();
		
	}

	private static void menu() {

		System.out.println(
				"-------------------------------------\n(1) PARA USAR INET ADDRESS\n(2) PARA USAR URL Y LEER EL CODIGO HTML\n(3) PARA COMUNICARTE CON LA PAGINA WEB\n------------------------------------- ");

	}

	private static void url() throws URISyntaxException, IOException {

		URL Url = new URI("https://www.lamaravillosaorquestadelalcohol.com").toURL();

		InputStream is = Url.openStream();

		int data = 0;

		while ((data = is.read()) != -1) {

			System.out.print((char) data);

		}

		is.close();

	}

	private static void inetAddress() throws UnknownHostException {

		InetAddress inetAddressLocal = InetAddress.getLocalHost();

		System.out.println("-------------LOCALHOST--------------");

		System.out.println("HOST: " + inetAddressLocal.getHostName());
		System.out.println("IP: " + inetAddressLocal.getHostAddress());
		System.out.println("DOMAIN: " + inetAddressLocal.getCanonicalHostName());

		System.out.println("-------------GOOGLE--------------");

		inetAddressLocal = InetAddress.getByName("www.google.es");

		System.out.println("HOST: " + inetAddressLocal.getHostName());
		System.out.println("IP: " + inetAddressLocal.getHostAddress());
		System.out.println("DOMAIN: " + inetAddressLocal.getCanonicalHostName());

		System.out.println("-------------GOOGLE_ES_ALL--------------");

		InetAddress[] inetAddresses = InetAddress.getAllByName("www.google.es");

		for (int i = 0; i < inetAddresses.length; i++) {

			System.out.println("\t------------GOOGLE " + (i + 1) + "-------------");

			System.out.println("\tHOST: " + inetAddresses[i].getHostName());
			System.out.println("\tIP: " + inetAddresses[i].getHostAddress());
			System.out.println("\tDOMAIN: " + inetAddresses[i].getCanonicalHostName());

		}

	}

}
