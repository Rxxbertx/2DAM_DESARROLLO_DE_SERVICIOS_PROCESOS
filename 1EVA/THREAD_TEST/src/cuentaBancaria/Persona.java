package cuentaBancaria;

import java.util.Random;

public class Persona extends Thread {

	/*
	 * Crea después una clase persona (que herede de hilo) que realice 2 ingresos y
	 * 2 reintegros alternándolos con algún sleep() en medio; hasta que ocurra
	 * alguno de los errores anteriores. Para crear los movimientos de dinero
	 * generar números aleatorios entre 1 y 500 con la función: random: int
	 * aleatorio = ((int) (Math.random()*500+1) El constructor de la clase debe
	 * llevar el nombre de persona.
	 */

	String nombre;
	CuentaBancaria cb;
	int intentosIngreso = 0;
	int intentosRetiro = 0;
	int contadorIngreso = 0;
	int contadorRetiro = 0;
	boolean retirar;
	private boolean finalizacion;

	public Persona(String nombre, CuentaBancaria cb) {

		this.nombre = nombre;
		this.cb = cb;
		retirar = ((int) (Math.random() * 2)) == 0 ? true : false;
		setName(nombre);
	}

	@Override
	public void run() {

		while (!interrupted()) {

			if (!retirar) {

				if (contadorIngreso < 2)
					ingresar();
				else if (contadorRetiro < 2)
					retirar();
				else
					interrupt();

			} else {

				if (contadorRetiro < 2)
					retirar();
				else if (contadorIngreso < 2)
					ingresar();
				else
					interrupt();

			}

			if (!finalizacion) {
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				continue;
			}

		}

		System.err.println(Thread.currentThread().getName() + " HA SALIDO DEL SISTEMA");

	}

	@Override
	public void interrupt() {
		// TODO Auto-generated method stub

		finalizacion = true;
		super.interrupt();

	}

	private synchronized void retirar() {

		if (intentosRetiro > 2) {

			System.err.println(
					Thread.currentThread().getName() + " INTENTALO DE NUEVO MAS TARDE: DEMASIADOS FALLOS RETIRANDO");
			interrupt();

		} else {

			float cantidad = (float) ((Math.random() * 500) + 1);

			if (cb.retiro(cantidad)) {

				contadorRetiro++;
				intentosRetiro = 0;
				retirar = false;

			} else {

				try {
					System.err.println(
							Thread.currentThread().getName() + " VOLVIENDO A INTENTAR LA OPERACION EN 5 SEGUNDOS");

					wait(5000);
					intentosRetiro++;
					retirar();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

	private synchronized void ingresar() {

		if (intentosIngreso > 2) {

			System.err.println(
					Thread.currentThread().getName() + " INTENTALO DE NUEVO MAS TARDE: DEMASIADOS FALLOS INGRESANDO");

			interrupt();

		} else {

			float cantidad = (float) ((Math.random() * 500) + 1);

			if (cb.ingreso(cantidad)) {

				contadorIngreso++;
				intentosIngreso = 0;
				retirar = true;

			} else {

				intentosIngreso++;
				try {
					System.err.println(
							Thread.currentThread().getName() + " VOLVIENDO A INTENTAR LA OPERACION EN 5 SEGUNDOS");

					wait(5000);

					ingresar();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

	}

}
