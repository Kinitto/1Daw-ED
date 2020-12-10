package es.studium.Geometria;

public class Geomtria {

	private static final double PI = 3.14;

	public static void main(String[] args) {

		final int RADIO = 13;
		
		
		perimetro(RADIO);

		superficie(RADIO);
	}

	private static void superficie(final int RADIO) {
		double numero3 = PI * RADIO * RADIO;
		System.out.println("El perimetro del circulo es " + numero3);
	}

	private static void perimetro(final int RADIO) {
		double numero2 = 2 * PI * RADIO;
		System.out.println("El perimetro del circulo es " + numero2);
	}

}
