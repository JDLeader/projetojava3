package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Validação de permissão de acesso simples*/
		String login = JOptionPane.showInputDialog("Insira login");
		String senha = JOptionPane.showInputDialog("Insira sua senha");
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

			List<Aluno> alunos = new ArrayList<Aluno>();

			/* Lista onde que temos uma chave que identifica uma sequiencia de valores */
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			List<Aluno> alunosRecuperação = new ArrayList<Aluno>();
			List<Aluno> alunosReprovados = new ArrayList<Aluno>();

			for (int qtd = 0; qtd <= 5; qtd++) {

				String nome = JOptionPane.showInputDialog("Digite o nome do Aluno" + qtd + ": ");
				/*
				 * String idade = JOptionPane.showInputDialog("Idade"); String dataNascimento =
				 * JOptionPane.showInputDialog("Data de Nascimento"); String rg =
				 * JOptionPane.showInputDialog("RG: "); String cpf =
				 * JOptionPane.showInputDialog("CPF: "); String mae =
				 * JOptionPane.showInputDialog("Nome da Mãe: "); String pai =
				 * JOptionPane.showInputDialog("Nome do Pai: "); String serie =
				 * JOptionPane.showInputDialog("Qual a serie: "); String matricula =
				 * JOptionPane.showInputDialog("Matricula: "); String escola =
				 * JOptionPane.showInputDialog("Nome da Escola: ");
				 */

				Aluno aluno = new Aluno();

				/*
				 * Codigo não utilizado exemplo para inserção casos especiais Aluno alunoVip =
				 * new Aluno("João Daniel", "01/01/2011");
				 */

				/*
				 * aluno.setNome(nome); aluno.setIdade(Integer.valueOf(idade));
				 * aluno.setDataNascimento(dataNascimento); aluno.setRegistroGeral(rg);
				 * aluno.setNumeroCPF(cpf); aluno.setNomeMae(mae); aluno.setNomePai(pai);
				 * aluno.setSerieMatriculado(serie); aluno.setDataMatricula(matricula);
				 * aluno.setNomeEscola(escola);
				 */

				for (int i = 1; i <= 1; i++) {
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

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
			}

			System.out.println("Lista dos aprovados");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
			}

			System.out.println("Lista dos reprovados");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());
			}

			System.out.println("Lista de Recuperação");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(
						"Resultado = " + aluno.getAlunoAprovado2() + " com media de = " + aluno.getMediaNota());

				/* Trocando aluno na lista */

				/*
				 * for(int pos = 0; pos < alunos.size(); pos ++) {
				 * 
				 * Aluno alunoSub = alunos.get(pos);
				 * 
				 * if (alunoSub.getNome().equalsIgnoreCase("João")) { Aluno trocar = new
				 * Aluno(); trocar.setNome("Aluno foi trocado");
				 * 
				 * Disciplina disciplina = new Disciplina();
				 * disciplina.setDisciplina("Matematica"); disciplina.setNota(96);
				 * 
				 * trocar.getDisciplina().add(disciplina);
				 * 
				 * alunos.set(pos, trocar); alunoSub = alunos.get(pos);
				 * 
				 * }
				 * 
				 * System.out.println("Aluno = " + alunoSub.getNome());
				 * System.out.println("Media do Aluno = " + alunoSub.getMediaNota());
				 * System.out.println("resultado = "+ alunoSub.getAlunoAprovado2());
				 * 
				 * for(int posd = 0; posd < alunoSub.getDisciplina().size(); posd ++) {
				 * Disciplina disc = alunoSub.getDisciplina().get(posd);
				 * System.out.println("Materia = " + disc.getDisciplina() + "Nota = " +
				 * disc.getNota());
				 * 
				 * /*for (Disciplina disc : aluno.getDisciplina()) {
				 * System.out.println("Materia = " + disc.getDisciplina() + "Nota = " +
				 * disc.getNota());
				 * 
				 * }
				 */

				/* Percorrendo listas pelas posições */

				/*
				 * for(int pos = 0; pos < alunos.size(); pos ++) {
				 * 
				 * Aluno aluno = alunos.get(pos); System.out.println("Aluno = " +
				 * aluno.getNome()); System.out.println("Media do Aluno = "
				 * +aluno.getMediaNota()); System.out.println("resultado = "+
				 * aluno.getAlunoAprovado2());
				 * 
				 * for(int posd = 0; posd < aluno.getDisciplina().size(); posd ++) { Disciplina
				 * disc = aluno.getDisciplina().get(posd); System.out.println("Materia = " +
				 * disc.getDisciplina() + "Nota = " + disc.getNota());
				 * 
				 * /*for (Disciplina disc : aluno.getDisciplina()) {
				 * System.out.println("Materia = " + disc.getDisciplina() + "Nota = " +
				 * disc.getNota());
				 */

			}

		}
	}

}

/*
 * Remover Aluno da lista for (Aluno aluno2 : alunos) {
 * 
 * if (aluno2.getNome().equalsIgnoreCase("Joao")) { aluno2.remove(aluno2);
 * break; } else { System.out.println(aluno2); System.out.println("Idade = " +
 * aluno2.getIdade()); System.out.println("Data de Nascimento = " +
 * aluno2.getDataNascimento()); System.out.println("Média = " +
 * aluno2.getMediaNota()); System.out.println("Resultado = " +
 * (aluno2.getAlunoAprovado() ? "Aprovado" : "Reprovado")); System.out.println(
 * "-----------------------------------------------------------"); }
 * 
 * }
 * 
 * Localizar aluno
 */
/*
 * for (Aluno aluno2 : alunos) {
 * 
 * if (aluno2.getNome().equalsIgnoreCase("Joao")) { System.out.println(aluno2);
 * System.out.println("Idade = " + aluno2.getIdade());
 * System.out.println("Data de Nascimento = " + aluno2.getDataNascimento());
 * System.out.println("Média = " + aluno2.getMediaNota());
 * System.out.println("Resultado = " + (aluno2.getAlunoAprovado() ? "Aprovado" :
 * "Reprovado")); System.out.println(
 * "-----------------------------------------------------------"); break; }
 * 
 * }
 * 
 * for (Aluno aluno2 : alunos) { System.out.println("Alunos na lista");
 * System.out.println(aluno2.getNome()); System.out.println("Disciplinas: ");
 * 
 * for (Disciplina disciplina : aluno2.getDisciplina()) {
 * System.out.println(disciplina.getDisciplina()); }
 * 
 * }
 */
