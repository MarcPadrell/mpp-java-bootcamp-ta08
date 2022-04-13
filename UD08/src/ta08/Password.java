package ta08;

public class Password {

	// Constantes
	final private int LONGITUD = 8;

	// Atributos
	private int longitud;
	private String contrase�a;

	// Constructor por defecto
	public Password() {
		this.longitud = LONGITUD;
		this.contrase�a = "";
	}

	// Constructor creando la password aleatoria con la longitud indicada.
	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = passwordRandom(longitud);
	}

	/**
	 * Funci�n para generar una contrase�a aleatoria con la longitud
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

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}

}
