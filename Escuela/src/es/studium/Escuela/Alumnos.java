package es.studium.Escuela;

public class Alumnos {
	private String nombre;
	private String apellido;
	private int edad;
	private boolean pago;
	private Aula aula;

	public Alumnos() {
		nombre = "";
		edad = 0;
		apellido = "";
		pago = false;
		aula = new Aula();

	}

	public Alumnos(String nombre, String apellido, int edad, boolean pago, Aula aula) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pago = pago;
		this.aula = aula;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

}
