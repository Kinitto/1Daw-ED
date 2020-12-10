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
	
	public Pelicula(String titulo,int año,int duracion) {
		this.titulo=titulo;
		this.anio=año;
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

	public void setAnio(int año) {
		this.anio = año;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
}