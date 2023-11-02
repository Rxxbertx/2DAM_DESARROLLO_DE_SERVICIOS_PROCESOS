
public class ThreadTest extends Thread{

	
	int numero;
	
	public ThreadTest(String name, int numero) {
		
		setName(name);
		this.numero= numero;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		int contador=0;
		
		while (contador <=numero) {
			
			System.out.println("HILO "+getName()+" :CONTADOR: "+contador++);
			
			
		}
		//no va hacer nada mas
		
	}
	
}
