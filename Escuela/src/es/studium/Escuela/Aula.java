package es.studium.Escuela;

public class Aula {

	private String nombre;
	private int albergar;

	public Aula() {

		nombre = "";
		albergar = 0;
	}

	public Aula(String nombre, int albergar) {
		this.nombre = nombre;
		this.albergar = albergar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAlbergar() {
		return albergar;
	}

	public void setAlbergar(int albergar) {
		this.albergar = albergar;
	}

}
