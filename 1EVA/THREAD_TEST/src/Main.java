/**
 * 
 */

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * RHilo hiloImpRunnable = new RHilo(1); THilo hiloThread = new THilo(2);
		 * 
		 * 
		 * Thread hiloRunneable = new Thread(hiloImpRunnable);
		 * 
		 * hiloRunneable.start(); hiloThread.start();
		 * 
		 * 
		 * System.out.println("HILO MAIN INICIALIZADO");
		 * 
		 * for (int i = 0; i < 10; i++) {
		 * 
		 * System.out.println("HILO MAIN: 0 CONTADOR"+i);
		 * 
		 * }
		 */

		/*ThreadTest hilo0 = new ThreadTest("A", 2);

		ThreadTest hilo1 = new ThreadTest("B", 5);

		ThreadTest hilo2 = new ThreadTest("C", 10);

		hilo2.start();
		hilo0.start();
		hilo1.start();
		

		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
			
			hilo2.join();
			hilo0.join();
			hilo1.join();
			
			
		} catch (InterruptedException e) {
			System.out.println("ALgo ha ido mal");
		}*/
		
		
		Thread hilo = new Thread(new RHilo());
		Thread hilo2 = new Thread(new RHilo());

		hilo.setName("HiLoN MuSk");
		hilo2.setName("HiLo2");
		
		
		hilo2.start();
		hilo.start();
		
		try {
			hilo2.join();
			hilo.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("FIN PROGAMA");
		
		
		
		
		
		
		
		


	}

}
