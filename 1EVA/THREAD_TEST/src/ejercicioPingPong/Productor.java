package ejercicioPingPong;

public class Productor extends Thread {

	private Cola cola;
	private String ping;

	public Productor(Cola c, String ping) {

		this.cola = c;
		this.ping = ping;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();

		while (true) {

			cola.put(ping);

			System.out.println("PRODUCTOR: " + ping);

			try {

				sleep(2000);

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

}
