package ta08;

public class Password {

	final private int LONGITUD = 8;

	private int longitud;
	private String contrase�a;

	public Password() {
		this.longitud = LONGITUD;
		this.contrase�a = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;

		String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

		/**
		 * Funci�n para generar una contrase�a aleatoria con la longitud
		 */
		for (int i = 0; i < longitud; i++) {
			this.contrase�a += banco.charAt((int) (Math.random() * (62 - 1)) + 1);
		}

	}

}
