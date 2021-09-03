package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;
import principio.responsabilidade.TesteConta;

public class TestandoClassesFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("João Daniel");
		aluno.setIdade(20);

		Diretor diretor = new Diretor();
		diretor.setRegistroEducacao("01171");
		diretor.setNome("Eu");
		diretor.setIdade(50);

		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setNome("Ele");
		secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);

		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.mensagemMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());

		System.out.println("Salario do estagiario de TI = " + aluno.salario());
		System.out.println("Salario do Diretor= " + diretor.salario());
		System.out.println("Salario do secretario = " + secretario.salario());

		/*
		 * Pessoa pessoa = new Aluno();
		 * pessoa = secretario;
		 */

		teste(aluno);
		teste(diretor);
		teste(secretario);

	}

	public static void teste(Pessoa pessoa) {
		System.out.println("-------------------------------------------------");
		System.out.println("Esse cara é top = " + pessoa.getNome() + " salario de = " + pessoa.salario());
	}
}
