package es.studium.Pelicula;

public class TestPelicula 
{
	public static void main(String[] args) 
	{
		Pelicula p1 = new Pelicula();
		p1.setTitulo("El rey leon");
		p1.setAnio(2001);
		p1.setDuracion(180);
		
		Pelicula p2 = new Pelicula("Fast And Furious",2016,130);
		p2.getTitulo();
		p2.getAnio();
		p2.getDuracion();
		
		Pelicula p3 = new Pelicula("Jhon wick",1995,80);
		p3.getTitulo();
		p3.getAnio();
		p3.getDuracion();
		
		Pelicula p4 = new Pelicula("007",2007,180);
		p4.getTitulo();
		p4.getAnio();
		p4.getDuracion();
		
		Pelicula p5 = new Pelicula("hitman",2015,140);
		p5.getTitulo();
		p5.getAnio();
		p5.getDuracion();

		System.out.println("estas son las dos peliculas, "+p2.getTitulo()+ " y "+ p1.getTitulo());
	}
}
