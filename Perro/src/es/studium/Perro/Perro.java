package es.studium.Perro;

public class Perro 
{

	private String raza; 
	private String tamano;
	private int edad;
	private String color;
	
	public Perro() {
		raza="";
		tamano="";
		edad=0;
		color="";
	}
	public Perro(String raza,String tamano,int edad,String color) {
		this.raza=raza;
		this.tamano=tamano;
		this.edad=edad;
		this.color=color;
		
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
