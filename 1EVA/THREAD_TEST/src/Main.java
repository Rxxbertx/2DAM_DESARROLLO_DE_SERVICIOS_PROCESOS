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
		
		
		new ThreadTest(1).start();
		new ThreadTest(2).start();
		new ThreadTest(3).start();
		
		System.out.println("TRES HILOS CREADOS");
		
		
		

	}

}
