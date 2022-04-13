package ta08;

public class Persona {

	// Constante
	final private String SEXO = "H";

	// Atributos
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private int altura;

	// Constructor por defecto
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO;
		this.peso = 0.0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = genero(sexo);
		this.peso = 0.0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String dni, String sexo, double peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = genero(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	/**
	 * Funcion para verificar que el sexo introducido es "H" o "M".
	 * @param sexo
	 * @return
	 */
	public String genero(String sexo) {
		if (sexo.equals("H") || sexo.equals("M")) {
			return sexo;
		} else {
			return SEXO;
		}
	}
	
	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = genero(sexo);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
}
