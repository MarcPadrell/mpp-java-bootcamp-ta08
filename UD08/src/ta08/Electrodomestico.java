package ta08;

import java.util.Arrays;

public class Electrodomestico {

	// Constantes
	final private String BLANCO = "blanco";
	final private String CONSUMO = "F";
	final private int PRECIO = 100;
	final private int PESO = 5;

	// Atributos
	private int precio_base;
	private String color;
	private String consumo_energetico;
	private int peso;

	// Constructor por defecto
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
		this.color = color(color);
		this.consumo_energetico = letrasConsumo(consumo_energetico);
		this.peso = peso;
	}
	
	/**
	 * Funion para verificar que la letra del consumo energetico es correcta
	 * @param a
	 * @return
	 */
	public String letrasConsumo(String a) {

		String[] lletres = { "A", "B", "C", "D", "E", "F" };

		if (Arrays.asList(lletres).contains(a)) {
			return a;
		} else {
			return CONSUMO;
		}

	}
	
	/**
	 * Funcion para verificar si el color intoducido es correcto, si no lo es se pondra el Blanco
	 * @param c
	 * @return
	 */
	public String color(String c) {
		
		String color_lower = c.toLowerCase();
		String[] colors = { "blanco", "negro", "rojo", "azul", "gris" };

		if (Arrays.asList(colors).contains(color_lower)) {
			return color_lower;
		} else {
			return BLANCO;
		}
	}

	public int getPrecio_base() {
		return precio_base;
	}

	public void setPrecio_base(int precio_base) {
		this.precio_base = precio_base;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color(color);
	}

	public String getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(String consumo_energetico) {
		this.consumo_energetico = letrasConsumo(consumo_energetico);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
	
	

}
