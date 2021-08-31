package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno!");
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

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Dados");
		disciplina3.setNota(97);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java");
		disciplina4.setNota(80);
		
		aluno.getDisciplina().add(disciplina1);
		aluno.getDisciplina().add(disciplina2);
		aluno.getDisciplina().add(disciplina3);
		aluno.getDisciplina().add(disciplina4);
		

		System.out.println("Nome = " + aluno.getNome());
		System.out.println("Idade = " + aluno.getIdade());
		System.out.println("Data de Nascimento = " + aluno.getDataNascimento());
		System.out.println("Média = " + aluno.getMediaNota());
		System.out.println("Resultado = " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));

	}

}
