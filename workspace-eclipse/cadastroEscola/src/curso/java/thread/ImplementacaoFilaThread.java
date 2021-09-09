package curso.java.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilathread) {
		pilha_fila.add(objetoFilathread);
	}

	@Override
	public void run() {
		System.out.println("-------------------");
		System.out.println("Fila rodando");


		while (true) {

			synchronized (pilha_fila) {/* bloquear acesso a lista por outros processos */

				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { /* enquanto tiver dados na lista vai processar */

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();

					/* processar notas fiscais ou lista de PDF's ou Envio de emails */

					System.out.println("------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
