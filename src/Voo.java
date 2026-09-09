public abstract class Voo implements aut {

	private String Num;

	private String Aeronave;

	private String Companhia;

	private double Combustivel;

	private String Origem;

	private String Destino;

	private int documentação;

	public abstract double calcularCusto();

	public double calcularCombustivel(){return-1;};

	public abstract boolean autorização();

	public abstract String pendencia();

	public String getTipo() {
		return null;
	}

	public void exibirResumo() {

	}


	/**
	 * @see aut#autorizacao()
	 */
	public boolean autorizacao() {
		return false;
	}

	

}
