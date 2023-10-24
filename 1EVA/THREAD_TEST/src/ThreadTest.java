
public class ThreadTest extends Thread{

	
	int i;
	
	public ThreadTest(int i) {
		
		this.i=i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		int contador=0;
		
		System.out.println("CREACION DE HILO: "+i);
		
		while (contador <=5) {
			
			System.out.println("HILO "+i+" :CONTADOR: "+contador++);
			
			
		}
		
	}
	
}
