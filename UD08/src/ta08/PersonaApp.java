package ta08;

public class PersonaApp {

	public static void main(String[] args) {

		// Persona1 -> Constructor por defecto
		Persona persona1 = new Persona();
		System.out.println(persona1.toString());

		// Persona2 -> Constructor con tres parametros
		Persona persona2 = new Persona("Marc", 21, "H");
		System.out.println(persona2.toString());

		// Persona3 -> Constructor con el g�nero erroneo
		Persona persona3 = new Persona("Arnau", 50, "J");
		System.out.println(persona3.toString());

		// Persona4 -> Constructor con todos los par�metros
		Persona persona4 = new Persona("Maria", 30, "12345678-A", "M", 60.5, 182);
		System.out.println(persona4.toString());
		
		// Intentamos modificar el g�nero de la Persona 4
		persona4.setSexo("H");
		System.out.println(persona4.toString());

	}

}
