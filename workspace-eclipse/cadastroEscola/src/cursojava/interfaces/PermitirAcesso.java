package cursojava.interfaces;

/* contrato de autenticação*/
public interface PermitirAcesso {
	
	/*apenas declaração*/
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
	

}
