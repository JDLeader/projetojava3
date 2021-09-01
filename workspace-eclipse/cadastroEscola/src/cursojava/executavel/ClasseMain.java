package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 0; qtd <= 1; qtd++) {

			String nome = JOptionPane.showInputDialog("Digite o nome do Aluno" +qtd+": ");
			String idade = JOptionPane.showInputDialog("Idade");
			String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento");
			String rg = JOptionPane.showInputDialog("RG: ");
			String cpf = JOptionPane.showInputDialog("CPF: ");
			String mae = JOptionPane.showInputDialog("Nome da Mãe: ");
			String pai = JOptionPane.showInputDialog("Nome do Pai: ");
			String serie = JOptionPane.showInputDialog("Qual a serie: ");
			String matricula = JOptionPane.showInputDialog("Matricula: ");
			String escola = JOptionPane.showInputDialog("Nome da Escola: ");

			Aluno aluno = new Aluno();

			/*
			 * Codigo não utilizado exemplo para inserção casos especiais Aluno alunoVip =
			 * new Aluno("João Daniel", "01/01/2011");
			 */

			aluno.setNome(nome);
			aluno.setIdade(Integer.valueOf(idade));
			aluno.setDataNascimento(dataNascimento);
			aluno.setRegistroGeral(rg);
			aluno.setNumeroCPF(cpf);
			aluno.setNomeMae(mae);
			aluno.setNomePai(pai);
			aluno.setSerieMatriculado(serie);
			aluno.setDataMatricula(matricula);
			aluno.setNomeEscola(escola);

			for (int i = 1; i <= 4; i++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Disciplina " + i + ": ");
				String notaDisciplina = JOptionPane.showInputDialog("Nota " + i + ": ");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplina().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Daseja remover alguma disciplina? ");
			int posicao = 1;

			if (escolha == 0) {/* sim = a Zero */

				int continuarRemover = 0;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4 ?");
					aluno.getDisciplina().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover? ");
				}
			}
			
			alunos.add(aluno);

		}
		
		for (Aluno aluno2 : alunos) {
			System.out.println(aluno2);
			System.out.println("Idade = " + aluno2.getIdade());
			System.out.println("Data de Nascimento = " + aluno2.getDataNascimento());
			System.out.println("Média = " + aluno2.getMediaNota());
			System.out.println("Resultado = " + (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			System.out.println("-----------------------------------------------------------");

		}
		
		
	}

}
