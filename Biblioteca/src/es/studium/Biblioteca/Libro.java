package es.studium.Biblioteca;

public class Libro {
	private String titulo;
	private Autor autor;
	private int anio;
	private String editorial;
	private int pag;

	public Libro() {
		titulo = "";
		new Autor();
		anio = 0;
		editorial = "";
		pag = 0;

	}

	public Libro(String titulo, Autor autor, int año, String editorial, int pag) {
		this.titulo = titulo;
		this.autor = autor;
		this.anio = año;
		this.editorial = editorial;
		this.pag = pag;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getPag() {
		return pag;
	}

	public void setPag(int pag) {
		this.pag = pag;
	}

}
