package ta08;

public class ElectrodomesticoApp {

	public static void main(String[] args) {

		// Electrodomestico 1 -> Constructor por defecto
		Electrodomestico electrodomestico1 = new Electrodomestico();
		System.out.println("Electrodomestico 1: " + electrodomestico1.toString());

		// Electrodomestico 2 -> Constructor con dos parametros
		Electrodomestico electrodomestico2 = new Electrodomestico(50, 2);
		System.out.println("Electrodomestico 2: " + electrodomestico2.toString());

		// Electrodomestico 3 -> Constructor por defecto
		Electrodomestico electrodomestico3 = new Electrodomestico(75, "negro", "B", 7);
		System.out.println("Electrodomestico 3: " + electrodomestico3.toString());

		// Electrodomestico 4 -> Constructor con color y letra consumo equivocada
		Electrodomestico electrodomestico4 = new Electrodomestico(125, "rosa", "M", 9);
		System.out.println("Electrodomestico 4: " + electrodomestico4.toString());
		
		electrodomestico4.setColor("azul");
		electrodomestico4.setConsumo_energetico("D");
		
		System.out.println("Color y consumo modificado: "+electrodomestico4.toString());

	}

}
