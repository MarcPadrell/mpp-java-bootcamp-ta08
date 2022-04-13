package ta08;

public class PasswordApp {

	public static void main(String[] args) {

		// Password1 -> Constructor por defecto
		Password password1 = new Password();
		System.out.println(password1.toString());

		// Password2 -> Constructor con contraseña aleatoria
		Password password2 = new Password(10);
		System.out.println(password2.toString());

	}

}
