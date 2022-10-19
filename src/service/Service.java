package service;

import java.util.List;
import java.util.Scanner;

import exception.SistemaException;
import menu.Menu;
import model.Aluno;
import model.Pessoa;
import repository.Repository;
import util.Delay;

public class Service {

	Scanner sc;
	Repository<Pessoa> repository;

	public Service(Scanner sc) {
		this.sc = sc;
		repository = new Repository<>();
		seedingRepository();
	}

	public void salvaCliente(Pessoa pessoa) {
		repository.salvar(pessoa);
	}

	public void removePessoa(Integer id) {
		repository.remover(id);
	}

	public Pessoa atualizaCadastro(Integer id) throws SistemaException {
		boolean continuaCadastro = true;
		int opcao;
		double nota = 0;
		String nome;
		String telefone;
		String dataNascimento;
		Pessoa pessoa = repository.buscarPorId(id);

		if (pessoa == null) {
			throw new SistemaException("         Pessoa não encontrada!");
		}

		do {
			Menu.mensagem_AtualizarOque();
			opcao = sc.nextInt();
			sc.nextLine();

			if (opcao == 1) {
				Menu.mensagem_InformeNome();
				nome = sc.nextLine();
				pessoa.setNome(nome);
			} else if (opcao == 2) {
				Menu.mensagem_InformeTelefone();
				telefone = sc.nextLine();
				pessoa.setTelefone(telefone);
			} else if (opcao == 3) {
				Menu.mensagem_DataNascimento();
				dataNascimento = sc.nextLine();
				pessoa.setDataNascimento(dataNascimento);
			} else if (opcao == 4) {
				if (pessoa.getClass() == Aluno.class) {
					Menu.mensagem_digiteANota();
					nota = sc.nextDouble();// ---------------------------------------------------------
					Aluno aluno = (Aluno) pessoa;
					aluno.setNotaFinalCurso(nota);
					Delay.aguarda(2000);
				} else {
					throw new SistemaException("         Essa Pessoa nao e aluno!");
				}
			} else if (opcao == 5) {
				continuaCadastro = false;
			} else {
				Menu.mensagem_OpcaoInvalida();
			}

		} while (continuaCadastro);

		repository.salvar(pessoa);

		return pessoa;
	}

	public Pessoa cadastraPessoa() {
		String nome;
		String telefone;
		String dataNascimento;
		Pessoa pessoa = null;

		Menu.mensagem_InformeNome();
		nome = sc.nextLine();

		Menu.mensagem_InformeTelefone();
		telefone = sc.nextLine();

		Menu.mensagem_DataNascimento();
		dataNascimento = sc.nextLine();

		Menu.mensagem_SabeQualEaNota();

		int opcao = sc.nextInt();
		sc.nextLine();

		if (opcao == 1) {
			Menu.mensagem_QualANota();
			double notaFinal = sc.nextDouble();
			pessoa = new Aluno(nome, telefone, dataNascimento, notaFinal);
		} else {
			pessoa = new Pessoa(nome, telefone, dataNascimento);
		}

		repository.salvar(pessoa);

		Menu.mensagem_CadastroRealizado();

		return pessoa;

	}

	public void showPessoas() {
		List<Pessoa> lista = repository.buscarTodos();
		lista.forEach(pessoa -> System.out.println(pessoa.toString()));

	}

	public void showAlunos() {
		List<Pessoa> lista = repository.buscarAlunos();
		lista.forEach(pessoa -> System.out.println(pessoa.toString()));
	}

	/*
	 * Povoando o bancao de dados
	 */
	private void seedingRepository() {
		Pessoa pessoa1 = new Pessoa("Martin Fleck", "51997839206", "11/01/1968");
		Pessoa pessoa2 = new Pessoa("Carlos Fleck", "11997839206", "11/06/1970");
		Pessoa pessoa3 = new Pessoa("Andre Fleck", "71997839206", "07/04/1976");
		Pessoa pessoa4 = new Pessoa("Bernardo Fleck", "21997839206", "02/06/2007");
		Pessoa pessoa5 = new Pessoa("Gabriela Fleck", "41997839206", "05/09/2011");
		Pessoa pessoa6 = new Pessoa("Nicolas Fleck", "54997444356", "02/06/2007");
		Aluno aluno1 = new Aluno("Barak Obama", "51997762008", "24/11/1945", 9.0);
		Aluno aluno2 = new Aluno("Albert Einstein", "51997009228", "02/03/1870", 7.5);
		Aluno aluno3 = new Aluno("Rutger Hauer", "51997983762", "24/04/1959", 8.0);
		Aluno aluno4 = new Aluno("Robert Redford", "51997835776", "24/04/1959", 8.0);
		repository.salvar(aluno1);
		repository.salvar(aluno4);
		repository.salvar(pessoa2);
		repository.salvar(pessoa1);
		repository.salvar(aluno2);
		repository.salvar(pessoa3);
		repository.salvar(pessoa4);
		repository.salvar(aluno3);
		repository.salvar(pessoa6);
		repository.salvar(pessoa5);

	}

}
