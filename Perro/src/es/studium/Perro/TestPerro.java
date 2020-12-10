package es.studium.Perro;

public class TestPerro 
{
	public static void main(String[] args) 
	{
		
		Perro p1 = new Perro();
		p1.setRaza("Labrador");
		p1.setColor("Marron");
		p1.setTamano("mediano");
		p1.setEdad(3);
		
		Perro p2 = new Perro("Doberman","mediano",5,"Marron");
		p2.getRaza();
		p2.getTamano();
		p2.getEdad();
		p2.getColor();
		
		Perro p3 = new Perro("mastin","grande",3,"Marron");
		p3.getRaza();
		p3.getTamano();
		p3.getEdad();
		p3.getColor();
		
		System.out.println(p2.getRaza());
		
		
	}
}