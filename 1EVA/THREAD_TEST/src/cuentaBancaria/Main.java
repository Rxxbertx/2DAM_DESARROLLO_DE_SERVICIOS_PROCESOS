package cuentaBancaria;

public class Main {

	public static void main(String[] args) {

		CuentaBancaria cb = new CuentaBancaria(200F, 500F);
		
		Persona alexander = new Persona("alexander", cb);
		Persona pablito = new Persona("pablito", cb);
		Persona admin = new Persona("AdminSupremo", cb);
		

		admin.start();
		alexander.start();
		pablito.start();

		try {
			admin.join();
			alexander.join();
			pablito.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		cb.mostrarSaldo();

	}

}
