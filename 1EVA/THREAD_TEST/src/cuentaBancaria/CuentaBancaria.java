package cuentaBancaria;

public class CuentaBancaria {

	/*
	 * 
	 * • Genera un programa para gestionar el saldo de una cuenta. El constructor
	 * recibe los valores, saldo inicial y saldo máximo. Se debe contar con métodos
	 * para obtener el saldo actual, hacer un ingreso y un reintegro (restar del
	 * saldo). También se deberán controlar correctamente los errores, por ejemplo:
	 * • Que no haya saldo. Se muestra el saldo actual y se le indica que no se
	 * puede realizar la operación. • Que se supere un máximo de dinero en cuenta.
	 * En este caso, se mostrará un mensaje indicando que no se puede hacer ese
	 * ingreso porque el saldo estaría por encima del máximo establecido (sacar cual
	 * es el máximo).
	 * 
	 */

	Float saldoInicial;
	Float saldoMaximo;
	Float saldo;
	private Float saldoAnterior;

	public CuentaBancaria(Float saldoInicial, Float saldoMaximo) {

		this.saldoInicial = saldoInicial;
		this.saldoMaximo = saldoMaximo;
		saldo = this.saldoInicial;

	}

	public synchronized boolean ingreso(Float cantidad) {

		if (comprobarCantidad(cantidad,"INGRESO")) {

			saldoAnterior=saldo;
			saldo += cantidad;
			System.out.println(String.format("%s SALDO INGRESADO CORRECTAMENTE: %.2f€", Thread.currentThread().getName(),cantidad));
			mostrarSaldo();
			return true;

		}else {
			
			mostrarSaldo();
		return false;

		}


	}

	public synchronized boolean retiro(Float cantidad) {
		
		if (comprobarCantidad(cantidad,"RETIRO")) {

			saldoAnterior=saldo;
			saldo -= cantidad;
			System.out.println(String.format("%s SALDO RETIRADO CORRECTAMENTE: %.2f€", Thread.currentThread().getName(),cantidad));
			mostrarSaldo();
			return true;

		}else {
			
			mostrarSaldo();
			return false;
			
			
		}

	}

	protected void mostrarSaldo() {

		
		System.out.println(String.format("%s SALDO ACTUAL: %.2f€ SALDO ANTERIOR: %.2f€", Thread.currentThread().getName(),saldo,saldoAnterior));
		saldoAnterior=saldo;
		
	}

	private boolean comprobarCantidad(Float cantidad, String metodo) {

		if (metodo.equals("INGRESO")) {
			
			if(cantidad+saldo>saldoMaximo) {
				
				System.err.println(Thread.currentThread().getName()+" ERROR AL AGREGAR EL SALDO: " + cantidad + "€ Supera el limite maximo de la cuenta: "
						+ saldoMaximo);
				return false;
			}
			
			if (cantidad <= 0) {
				System.err.println(Thread.currentThread().getName()+" ERROR AL AGREGAR EL SALDO: " + cantidad + "€ Debes introducir un saldo mayor a 0€");
				return false;
			}
			return true;

		}

		if (metodo.equals("RETIRO")) {

			if (cantidad > saldo) {
				System.err.println(Thread.currentThread().getName()+" ERROR AL RETIRAR EL SALDO: " + cantidad+"€ NO PUEDES RETIRAR MAS DE LO QUE TIENES DISPONIBLE");
				return false;
			}
			if (cantidad <= 0) {
				System.err.println(Thread.currentThread().getName()+" ERROR AL RETIRAR EL SALDO: " + cantidad + "€ Debes introducir un RETIRO mayor a 0€");
				return false;
			}
			return true;

		}
		
		return false;

	}

}
