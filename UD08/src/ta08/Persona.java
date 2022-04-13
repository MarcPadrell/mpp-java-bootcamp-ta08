package ta08;

public class Persona {

	final private String SEXO = "H";
	
	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private double peso;
	private int altura;

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
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String dni, String sexo, double peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

}
