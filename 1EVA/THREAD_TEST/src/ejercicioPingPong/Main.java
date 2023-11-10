package ejercicioPingPong;

public class Main {

	public static void main(String[] args) {

		Cola c = new Cola();

		Productor productor = new Productor(c, "PING");
		Consumidor consumidor = new Consumidor(c);

		consumidor.start();
		productor.start();

	}

}
