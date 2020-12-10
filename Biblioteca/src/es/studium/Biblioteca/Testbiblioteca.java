package es.studium.Biblioteca;

public class Testbiblioteca {

	public static void main(String[] args) {

		Autor a1 = new Autor("jk", "rowling", "inglesa");
		Autor a2 = new Autor("jk", "rowling", "inglesa");
		Autor a3 = new Autor("jk", "rowling", "inglesa");

		Libro l1 = new Libro("HarryPotter", a1, 2003, "editorial magica", 400);
		Libro l2 = new Libro("El quijote", a2, 1604, "editorial de la mancha", 1000);
		Libro l3 = new Libro("Spiderman", a3, 1999, "editorial comic", 60);

		System.out.println("El libro " + l1.getTitulo() + " Tiene " + l1.getPag() + " paginas");
		System.out.println("El libro " + l2.getTitulo() + " Tiene " + l2.getPag() + " paginas");
		System.out.println("El libro " + l3.getTitulo() + " Tiene " + l3.getPag() + " paginas");

	}
}
