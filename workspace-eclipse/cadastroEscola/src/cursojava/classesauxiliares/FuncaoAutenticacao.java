package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

/*contrato da inteface de PermitirAcesso e chamar o autenticação*/
public class FuncaoAutenticacao {
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
		
	}
	

}
