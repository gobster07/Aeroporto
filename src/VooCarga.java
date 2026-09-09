public class VooCarga extends Voo {

	private String Num;

	private String Aeronave;

	private String Companhia;

	private double Peso;

	private double CapacidadeCarga;

	private double Combustivel;

	private boolean situaçãoInsp;

	public double calcularCusto() {
		return 0;
	}

	public double calcularCombustivel() {
		return 0;
	}

	@Override
	public boolean autorização() {
		return false;
	}

	@Override
	public String pendencia() {
		return null;
	}

}
