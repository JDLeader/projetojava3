package crso.java.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*processamento paralelo*/
		for(int pos = 0; pos < 10; pos++) {
						
			/* Executar envio com tempo de parada*/
			System.out.println("Executando rotina");
			
			Thread.sleep(1000);/*Um segundo para cada linha*/
		}
		
		
		System.out.println("Fim do teste de Thread");
		/*Exemplo de fluxo do sistema*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

}
