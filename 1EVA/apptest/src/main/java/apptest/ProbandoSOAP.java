package apptest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import soap.ServicioWebInterface;
import soap.ServicioWebService;

public class ProbandoSOAP {
	
	public static void main(String[] args) throws IOException {
		
		
		//soap con java cliente
		
		
		ServicioWebService service = new ServicioWebService();
		
		ServicioWebInterface serviceActions = service.getServicioWebPort();
		
		
		String result = serviceActions.getGreating("holaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaa"
				+ "aaaaaaaaaaaaaaaaaaaaaa");
		
		System.out.println(result);
		
		
	}
	

}
