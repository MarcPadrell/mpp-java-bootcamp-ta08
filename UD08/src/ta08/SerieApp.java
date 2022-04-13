package ta08;

public class SerieApp {

	public static void main(String[] args) {

		// Serie1 -> Constructor por defecto
		Serie serie1 = new Serie();
		System.out.println(serie1.toString());

		// Serie2 -> Constructor con dos parametros
		Serie serie2 = new Serie("Piratas del Caribe", "Eduard Palacios");
		System.out.println(serie2.toString());
		
		// Serie3 -> Constructor con todos los atributos menos entregado
		Serie serie3 = new Serie("Futbol 11", 2, "Diversión", "Marc Padrell");
		System.out.println(serie3.toString());

	}

}
