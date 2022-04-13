package ta08;

import java.util.Arrays;

public class Electrodomestico {
	
	//Constantes
	final private String BLANCO = "blanco";
	final private String CONSUMO = "F";
	final private int PRECIO = 100;
	final private int PESO = 5;
	
	//Atributos
	private int precio_base;
	private String color;
	private String consumo_energetico;
	private int peso;
	
	//Constructor por defecto
	public Electrodomestico() {
		this.precio_base = PRECIO;
		this.color = BLANCO;
		this.consumo_energetico = CONSUMO;
		this.peso = PESO;
	}
	
	public Electrodomestico(int precio_base, int peso) {
		this.precio_base = precio_base;
		this.color = BLANCO;
		this.consumo_energetico = CONSUMO;
		this.peso = peso;
	}
	
	// Constructor verificando el color
	public Electrodomestico(int precio_base, String color, String consumo_energetico, int peso) {
		this.precio_base = precio_base;

		String color_lower = color.toLowerCase();
		String[] colors = { "blanco", "negro", "rojo", "azul", "gris" };

		if (Arrays.asList(colors).contains(color_lower)) {
			this.color = color;
		} else {
			this.color = BLANCO;
		}

		this.consumo_energetico = consumo_energetico;
		this.peso = peso;
	}

}
