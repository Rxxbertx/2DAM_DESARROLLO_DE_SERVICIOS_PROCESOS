package sockets_ejercicioPresentacion;

import java.io.Serializable;

public class Persona implements Serializable {


	String nombre;
	int edad;
	String dni;

	public Persona(String nombre, int edad, String dni) {

		setNombre(nombre);
		setEdad(edad);
		setDni(dni);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}

	@Override
	public String toString() {
		
		return "OBJETO PERSONA: Nombre: " + getNombre() + " Edad: " + getEdad() + " DNI: " + getDni();
	}

}
