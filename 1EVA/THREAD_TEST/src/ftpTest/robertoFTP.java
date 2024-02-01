package ftpTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class robertoFTP {
	
	

	public static void main(String[] args) throws Exception{
		
		
		String server = "192.168.33.65";
		int puerto = 21;
		String usuario = "Alumno";
		String contra = "123";
		
		
		
		
		FTPClient ftp = new FTPClient();

		ftp.connect(server,puerto);
		
		ftp.login(usuario, contra);
		
		
		ftp.setFileType(FTP.BINARY_FILE_TYPE);
		
		int i = 0;
		while (true) {
			i++;
			String rutaRemota = "iamgen"+i+".jpg";
			
			String rutaLocal = "C:\\Users\\dam2t06\\Downloads\\python.jpg";
			
			File file = new File(rutaLocal);
			
			FileInputStream fis = new FileInputStream(file);
			boolean exito = ftp.storeFile(rutaRemota, fis);
			
			if (exito) {
				System.out.println("b");
			}else {
				System.out.println("m");
			}
		}
		
		

		
		

		//ftp.logout();
		//ftp.disconnect();
		
		
		
		
	}
	

}
