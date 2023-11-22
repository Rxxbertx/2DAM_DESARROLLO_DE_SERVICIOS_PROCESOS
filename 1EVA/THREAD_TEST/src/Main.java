
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

THilo hilo = new THilo();
		THilo hilo2 = new THilo();
		THilo hilo3= new THilo();
		
		hilo.setPriority(1);
		hilo2.setPriority(10);
		hilo3.setPriority(1);
		
		
		
		hilo.start();
		hilo2.start();
		hilo3.start();
		
		try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		hilo.pararHilo();
		hilo2.pararHilo();
		hilo3.pararHilo();
		
		System.out.println(hilo.getContador());
		System.out.println(hilo2.getContador());
		System.out.println(hilo3.getContador());
			
		}
		


}
