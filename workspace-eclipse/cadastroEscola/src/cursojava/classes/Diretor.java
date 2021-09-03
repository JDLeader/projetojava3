package cursojava.classes;

public class Diretor extends Pessoa{
	
	private String registroEducacao;
	private String tempoDirecacao;
	private String titulacao;
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecacao() {
		return tempoDirecacao;
	}
	public void setTempoDirecacao(String tempoDirecacao) {
		this.tempoDirecacao = tempoDirecacao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecacao=" + tempoDirecacao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 3500.68;
	}
	
	
	
	
	

}
