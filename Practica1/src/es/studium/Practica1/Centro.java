package es.studium.Practica1;

public class Centro {
	private int idCentro;
	private String nombreCentro;
	private String direccionCentro;
	
public Centro(){
	idCentro=0;
	nombreCentro="";
	direccionCentro="";
}

public Centro(String nombreCentro,String direccionCentro,int idCentro) {
	this.nombreCentro=nombreCentro;
	this.direccionCentro=direccionCentro;
	this.idCentro=idCentro;
}

public int getIdCentro() {
	return idCentro;
}

public void setIdCentro(int idCentro) {
	this.idCentro = idCentro;
}

public String getNombreCentro() {
	return nombreCentro;
}

public void setNombreCentro(String nombreCentro) {
	this.nombreCentro = nombreCentro;
}

public String getDireccionCentro() {
	return direccionCentro;
}

public void setDireccionCentro(String direccionCentro) {
	this.direccionCentro = direccionCentro;
}
}
