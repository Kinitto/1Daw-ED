package es.studium.Escuela;

public class TestAlumnos {

	public static void main(String[] args) {

		Aula a1 = new Aula("Informatica", 20);
		Aula a2 = new Aula("Montaje", 30);

		Alumnos al1 = new Alumnos("Baldo", "Baldomero", 24, false, a1);
		Alumnos al2 = new Alumnos("Alicia", "Martinez", 48, true, a2);
		Alumnos al3 = new Alumnos("Alejandro", "Infante", 12, true, a1);

		System.out.println("el alumno " + al1.getApellido() + " esta en el aula de " + a1.getNombre());
		System.out.println("el alumno " + al2.getApellido() + " esta en el aula de " + a2.getNombre());
		System.out.println("el alumno " + al3.getApellido() + " esta en el aula de " + a1.getNombre());
	}
}
