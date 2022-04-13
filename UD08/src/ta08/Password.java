package ta08;

public class Password {

	// Constantes
	final private int LONGITUD = 8;

	// Atributos
	private int longitud;
	private String contraseña;

	// Constructor por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.contraseña = "";
	}

	// Constructor creando la password aleatoria con la longitud indicada.
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = passwordRandom(longitud);
	}

	/**
	 * Función para generar una contraseña aleatoria con la longitud
	 */
	public String passwordRandom(int longitud) {

		String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String contra = "";

		for (int i = 0; i < longitud; i++) {
			contra += banco.charAt((int) (Math.random() * 62));
		}

		return contra;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
