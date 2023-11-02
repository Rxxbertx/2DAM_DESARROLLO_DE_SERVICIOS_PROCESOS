
public class RHilo implements Runnable {


	
	public RHilo() {
		

		
	}
	
	@Override
	public  void run() {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)((Math.random()*10)+1);
		
		if (aleatorio!=2) {
			for (int i = 0; i < aleatorio; i++) {
			
			
			System.out.println("HILO RUNNABLE: "+Thread.currentThread().getName()+" CONTADOR: "+aleatorio);

		}
		}else {
			System.out.println("HILO RUNNABLE: "+ Thread.currentThread().getName()+ " saco un 2");
		}
		
		
		

		
		System.out.println("FIN: "+Thread.currentThread().getName()+" termine");
		
		
		
		
	}
	
	
	

}
