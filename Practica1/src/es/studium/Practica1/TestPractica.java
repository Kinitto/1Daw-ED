package es.studium.Practica1;

public class TestPractica {

	public static void main(String[] args) {
		
		Centro c1= new Centro("Escuela de inglés","Reyes Católicos, 14",1001);
		Centro c2= new Centro("Escuela de francés","Cristóbal Colón, 92",2002);
		
		Asignatura a1= new Asignatura("Inglés b1",300,3003);
		Asignatura a2= new Asignatura("Inglés b2",280,3004);
		Asignatura a3= new Asignatura("Francés b1",300,4003);
		Asignatura a4= new Asignatura("Francés a2",280,4004);
		
		Alumno al1= new Alumno("Ana Abel","Paseo de América,15",c1,a1,7);
		Alumno al2= new Alumno("Benito Bueno","Reyes Católicos,16",c1,a2,6);
		Alumno al3= new Alumno("Carmen Cano","Reyes Católicos,2",c1,a1,5);
		Alumno al4= new Alumno("Esteban Escalera","Isabel la Católica,28",c2,a3,9);
		Alumno al5= new Alumno("Francisco Farfán","Cristobal Colón,s/n",c2,a4,8.5f);
		
		System.out.println("Las direcciones de los centros son "+c1.getDireccionCentro()+" // "+c2.getDireccionCentro());
		System.out.println("Carmen está matriculada en "+al3.getCentro().getDireccionCentro());
		System.out.println("En el examen de b2, Benito ha sacado un "+al2.getNota());
	}
}