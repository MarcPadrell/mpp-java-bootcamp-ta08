package ta08;

public class Serie {

	// Constantes
	final private int NUM_TEMP = 3;
	final private boolean ENTREGADO = false;

	// Atributos
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumero_temporada() {
		return numero_temporada;
	}

	public void setNumero_temporada(int numero_temporada) {
		this.numero_temporada = numero_temporada;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numero_temporada=" + numero_temporada + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
