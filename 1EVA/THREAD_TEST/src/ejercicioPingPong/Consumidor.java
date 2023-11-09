package ejercicioPingPong;

public class Consumidor extends Thread {

	private Cola cola;

	public Consumidor(Cola c) {

		this.cola = c;
	}

	@Override
	public void run() {
		super.run();

		
		while (true) {

			String str=cola.get();
			System.out.println("CONSUMIDOR: " + str);

		}

	}

}
