package es.studium.Practica1;

public class Asignatura {
	private String nombreAsignatura;
	private int horasAsignatura;
	private int idAsignatura;

public Asignatura(){
	nombreAsignatura="";
	horasAsignatura=0;
	idAsignatura=0;
}
public Asignatura(String nombreAsignatura,int horasAsignatura,int idAsignatura) {
	this.nombreAsignatura=nombreAsignatura;
	this.horasAsignatura=horasAsignatura;
	this.idAsignatura=idAsignatura;
}
public String getNombreAsignatura() {
	return nombreAsignatura;
}
public void setNombreAsignatura(String nombreAsignatura) {
	this.nombreAsignatura = nombreAsignatura;
}
public int getHorasAsignatura() {
	return horasAsignatura;
}
public void setHorasAsignatura(int horasAsignatura) {
	this.horasAsignatura = horasAsignatura;
}
public int getIdAsignatura() {
	return idAsignatura;
}
public void setIdAsignatura(int idAsignatura) {
	this.idAsignatura = idAsignatura;
}
}