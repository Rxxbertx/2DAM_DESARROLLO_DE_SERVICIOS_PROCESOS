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
		
		
			RHilo hiloImpRunnable = new RHilo(1);
			THilo hiloThread = new THilo(2);
			
			
			Thread hiloRunneable = new Thread(hiloImpRunnable);
			
			hiloRunneable.start();
			hiloThread.start();
			
			
			System.out.println("HILO MAIN INICIALIZADO");
			
			for (int i = 0; i < 10; i++) {
				
				System.out.println("HILO MAIN: 0 CONTADOR"+i);
				
			}
			

	}

}
