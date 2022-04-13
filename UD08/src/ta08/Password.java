package ta08;

public class Password {
	
	// Constantes
	final private int LONGITUD = 8;
	
	// Atributos
	private int longitud;
	private String contraseña;
	
	//Constructor por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.contraseña = "";
	}
	
	// Constructor creando la password aleatoria con la longitud indicada.
	public Password(int longitud) {
		this.longitud = longitud;

		String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

		/**
		 * Función para generar una contraseña aleatoria con la longitud
		 */
		for (int i = 0; i < longitud; i++) {
			this.contraseña += banco.charAt((int) (Math.random() * (62 - 1)) + 1);
		}

	}

}
