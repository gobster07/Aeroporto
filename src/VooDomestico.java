public abstract class VooDomestico extends Voo {

	private String Num;

	private String Aeronave;

	private String Companhia;

	private double Combustivel;

	private String Origem;

	private String Destino;

	private int documentação;

	public double calcularCusto() {
		return 0;
	}

	public double calcularCombustivel() {
		return 0;
	}

	public boolean autorização() {
		return false;
	}

	public String pendencia() {
		return null;
	}

	public String getTipo() {
		return null;
	}

	public void exibirResumo() {

	}

}
