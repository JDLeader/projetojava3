package cursojava.interfaces;

/* contrato de autentica��o*/
public interface PermitirAcesso {
	
	/*apenas declara��o*/
	public boolean autenticar(String login, String senha);
	
	public boolean autenticar();
	

}
