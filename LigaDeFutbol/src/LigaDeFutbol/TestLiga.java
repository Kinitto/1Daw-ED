package LigaDeFutbol;

public class TestLiga {

	public static void main(String[] args) {
		
		Equipo a1 = new Equipo("Madrid", 40,2000);
		Equipo a2 = new Equipo("Barcelona", 80,1200);

		Futbolista f1 = new Futbolista("Pele", "Tomas", true,a2);
		Futbolista f2 = new Futbolista("Maradona", "Gomez", true,a2);
		Futbolista f3 = new Futbolista("Marcos", "Alcaide", false,a1);
		Futbolista f4 = new Futbolista("Santiago", "Fernandez", true,a1);

		System.out.println("el jugador " + f1.getNombre()+" " +f1.getApellido() +" juega en el "+a1.getNombre());
		System.out.println("el jugador " + f2.getNombre()+" " +f2.getApellido() +" juega en el "+a1.getNombre());
		System.out.println("el jugador " + f3.getNombre()+" " +f3.getApellido() +" juega en el "+a2.getNombre());
		System.out.println("el jugador " + f4.getNombre()+" " +f4.getApellido() +" juega en el "+a2.getNombre());

	}

}
