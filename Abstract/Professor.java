package Abstract;
// Professor cont�m tudo que existe em Funcionario
public class Professor extends Funcionario {
	// vari�veis privadas da claase
	private int cargaHoraria;
	private double valorDaHora;
	
	// Nota��o de Sobreescrita
	@Override
	public double calculaSalario() { return (cargaHoraria*valorDaHora); }
	
	// getters e setters
	public void setCargaHoraria (int cargaHoraria) { this.cargaHoraria = cargaHoraria; }
	public void setValorDaHora (double valorDaHora) { this.valorDaHora = valorDaHora; }
	public int getCargaHoraria () { return cargaHoraria; }
	public double getValorDaHora () { return valorDaHora; }
}
