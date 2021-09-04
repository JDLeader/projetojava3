package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {

	public static void main(String[] args) {

		
		
		
		String[] valores = new String[4];
		
		valores[0] = "João";
		valores[1] = "90";
		valores[2] = "Curso";
		valores[3] = "Teste";
		
		for (int pos = 0; pos < valores.length; pos++) {
			System.out.println(+pos+ " -- " + valores[pos]);
		}
		
		
		
		
		
		
		
		/*
		/* Array pode ser de todos os tipos de dados 

		String posicoes = JOptionPane.showInputDialog("Quantas posições o array deve ter? ");

		double[] notas = new double[Integer.parseInt(posicoes)];

		for(int pos = 0; pos <notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posição? " +(pos + 1));
			notas[pos] = Double.valueOf(valor);
		}
		
		for (int i = 0; i < notas.length; i++) {
			

			System.out.println(+ (i + 1) + " " + notas[i]);
		}*/
	}

}
