package es.studium.Practica1;

public class Alumno {
	private String nombre;
	private String direccion;
	private Centro centro;
	private Asignatura asignatura;
	private float nota;

public Alumno() {
	nombre="";
	direccion="";
	centro=new Centro();
	asignatura=new Asignatura();
	nota=0.0f;
}
public Alumno(String nombre, String direccion,Centro centro,Asignatura asignatura,float nota) {
	this.nombre=nombre;
	this.direccion=direccion;
	this.centro=centro;
	this.asignatura=asignatura;
	this.nota=nota;
}
public float getNota() {
	return nota;
}
public void setNota(float nota) {
	this.nota = nota;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public Centro getCentro() {
	return centro;
}
public void setCentro(Centro centro) {
	this.centro = centro;
}
public Asignatura getAsignatura() {
	return asignatura;
}
public void setAsignatura(Asignatura asignatura) {
	this.asignatura = asignatura;
}
}