package ta08;

public class Serie {

	final private int NUM_TEMP = 3;
	final private boolean ENTREGADO = false;

	private String titulo;
	private int numero_temporada;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.numero_temporada = NUM_TEMP;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numero_temporada = NUM_TEMP;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numero_temporada, String genero, String creador) {
		this.titulo = titulo;
		this.numero_temporada = numero_temporada;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

}
