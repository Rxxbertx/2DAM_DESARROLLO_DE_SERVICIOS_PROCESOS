import java.util.Iterator;

public class THilo extends Thread {

	int id;
	long contador;
	boolean stopHilo = false;

	public THilo(int contador) {
		this.contador = contador;
	}
	
	public THilo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		System.out.println("HILO THREAD SE HA INICIALIZADO");

		while (!stopHilo) {

			contador++;

		}
	}

	long getContador() {
		return contador;
	}
	
	void pararHilo() {
		stopHilo=true;
	}

}
