package ejercicioPingPong;

public class Cola {

	private String str;
	private boolean disponible = false;

	public synchronized String get() {

		while (!disponible) {
			try {

				wait();

			} catch (InterruptedException e) {

			}

		}

		disponible = false;
		notifyAll();
		return "PONG";
	}

	public synchronized void put(String str) {

		while (disponible) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		disponible = true;
		this.str = str;
		notifyAll();

	}

}
