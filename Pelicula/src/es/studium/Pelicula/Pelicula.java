package es.studium.Pelicula;

public class Pelicula 
{
	private String titulo; 
	private int anio;
	private int duracion;
	
	public Pelicula(){
		titulo="";
		anio=0;
		duracion=0;
	}
	
	public Pelicula(String titulo,int a�o,int duracion) {
		this.titulo=titulo;
		this.anio=a�o;
		this.duracion=duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int a�o) {
		this.anio = a�o;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}