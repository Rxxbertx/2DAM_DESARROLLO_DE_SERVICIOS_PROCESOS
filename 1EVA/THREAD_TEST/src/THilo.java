import java.util.Iterator;

public class THilo extends Thread {

	int id;
	
	public THilo(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	
		System.out.println("HILO THREAD SE HA INICIALIZADO");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("HILO THREAD: "+id+" CONTADOR: "+i);
		
		}
		
		
	
	
	}
	
	
	
	
}
