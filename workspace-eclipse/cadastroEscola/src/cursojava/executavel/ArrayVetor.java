package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {

		double[] notas = {8.8,9.9,7.5,7.0};
		double[] notasLogica = {7.1,5.7,9.6,7.8};
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("João");
		aluno.setNomeEscola("JDEV");
		
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java: ");
		disciplina.setNota(notas);
		
		aluno.getDisciplina().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica: ");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplina().add(disciplina2);
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do Aluno: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d: arrayAlunos[pos].getDisciplina()) {
				System.out.println("Disciplina: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					System.out.println("Nota: " + posnota + " = " + d.getNota()[posnota]);
					
				}
			}
			
		}
		
		
		/*codigo para descobrir maior e menor nota
		/*System.out.println("Nome do Aluno = " + aluno.getNome() + " - Inscrito no Curso: " + aluno.getNomeEscola());
		System.out.println("\n ----- Disciplinas-----");
		
		for(Disciplina d : aluno.getDisciplina()) {
			
			System.out.println("\n" + d.getDisciplina());
						
			double notaMax = 0.0;
			double notaMin = 0.0;
			
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " igual = " + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
					notaMin = d.getNota()[pos];
					
				}else {
					if(d.getNota()[pos] > notaMax)  {
						notaMax = d.getNota()[pos];
					}else {
						
					if(d.getNota()[pos] < notaMin){ 
						notaMin = d.getNota()[pos];
				}
					}
					
				
			}
			}
				System.out.println("A maior nota da disciplina = " + d.getDisciplina() + " é de valor : " + notaMax);
				System.out.println("A menor nota da disciplina = " + d.getDisciplina() + " é de valor : " + notaMin);
			
			}
		
		/*
		
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



