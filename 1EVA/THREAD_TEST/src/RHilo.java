
public class RHilo implements Runnable {

	int id;
	
	public RHilo(int id) {
		
		this.id=id;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("HILO RUNNABLE SE HA INICIALIZADO");
		
		for (int j = 0; j < 10; j++) {
			
			System.out.println("HILO RUNNABLE: "+id+" CONTADOR: "+j);
		
		}
		
	}
	
	
	

}
