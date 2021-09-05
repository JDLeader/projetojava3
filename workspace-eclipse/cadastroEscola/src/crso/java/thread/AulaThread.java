package crso.java.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*thread processando em paralelo*/
		new Thread() {
			public void run() {

				/*processamento paralelo*/
				for(int pos = 0; pos < 10; pos++) {
								
					/* Executar envio com tempo de parada*/
					System.out.println("Executando rotina");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}/*Um segundo para cada linha*/
				}

				
			}
		}.start();/*Ligando a Thread paralelamente*/
		
			
		
		System.out.println("Fim do teste de Thread");
		/*Exemplo de fluxo do sistema*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}

}
