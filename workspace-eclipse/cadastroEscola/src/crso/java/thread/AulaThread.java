package crso.java.thread;

import javax.swing.JOptionPane;



public class AulaThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*thread processando em paralelo 1 */
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		

		/*thread processando em paralelo 2 */
		Thread threadNFCE = new Thread(threan2);
		threadNFCE.start();
		
		
		System.out.println("Fim do teste de Thread");
		/*Exemplo de fluxo do sistema*/
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");

	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
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
	};
	
	private static Runnable threan2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		
			/*processamento paralelo*/
			for(int pos = 0; pos < 10; pos++) {
							
				/* Executar envio com tempo de parada*/
				System.out.println("Executando segunda rotina");
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}/*Um segundo para cada linha*/
			}

			
		}
	};
		
	}


