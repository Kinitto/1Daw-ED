package LigaDeFutbol;

public class Equipo {
	
	private String nombre;
	private int anio;
	private int socios;
	
	public Equipo() {
		nombre="";
		anio=0;
		socios=0;
	}
	
	public Equipo(String nombre,int anio,int socios) {
		this.nombre=nombre;
		this.anio=anio;
		this.socios=socios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getSocios() {
		return socios;
	}

	public void setSocios(int socios) {
		this.socios = socios;
	}

}
