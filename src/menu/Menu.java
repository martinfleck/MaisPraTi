package menu;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Menu {

	public static void mensagem_BemVindo() {
		
		Calendar c = Calendar.getInstance();
		Locale brasil = new Locale("pt", "BR");
		DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
		System.out.println("___________________________________________________________________");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Hoje: " + f2.format(c.getTime())                           );
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Bem vido ao nosso Portal: Escolha uma opcao...            ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         (1) Realizar um novo cadastro                             ");
		System.out.println("         (2) Mostrar todas as pessoas cadastradas                  ");
		System.out.println("         (3) Mostrar todos os alunos cadastrados                   ");
		System.out.println("         (4) Atualizar dados de alguem                             ");
		System.out.println("         (5) Remover alguem                                        ");
		System.out.println("         (6) Encerrar programa                                     ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_NovoCadastro() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                  Realizando um novo Cadastro ...                        ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_TelaDeDados() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("                  Todos os dados Cadastrais                        ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_EscolhaPeloID() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Escolha a pessoa ou o aluno informando o seu id...        ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_OpcaoInvalida() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Opcao nao valida! Tente novamente...                      ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_AtualizarOque() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         O que deseja atualizar?                                   ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         (1) Nome                                                  ");
		System.out.println("         (2) Telefone                                              ");
		System.out.println("         (3) Data de Nascimento                                    ");
		System.out.println("         (4) Nota Final                                            ");
		System.out.println("         (5) Sair                                                  ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_InformeNome() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Informe o nome correto ...                                ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_InformeTelefone() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Informe o numero de telefone ...                          ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_DataNascimento() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("         Informe a data de nascimento (XX/XX/XXXX) ...             ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_SabeQualEaNota() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("  Voce sabe informar sua nota final?   (1) Sim, (2) Nao            ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_QualANota() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("              Informe sua nota final...                            ");
		System.out.println("-------------------------------------------------------------------");
	}

	public static void mensagem_CadastroRealizado() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("              Cadastro realizado com sucesso!                      ");
		System.out.println("-------------------------------------------------------------------");
	}
	public static void mensagem_CadastroAtualizado() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("              Cadastro atualizado com sucesso!                     ");
		System.out.println("-------------------------------------------------------------------");
	}
	public static void mensagem_Agradecimento() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("              Agradecemos por sua contribuicao!                    ");
		System.out.println("                        Volte Sempre!                              ");
		System.out.println("                                                                   ");
		System.out.println("                      Sistema encerrado!                           ");
		System.out.println("-------------------------------------------------------------------");
	}
	public static void mensagem_digiteANota() {
		System.out.println("-------------------------------------------------------------------");
		System.out.println("              Digite a nota final!                                 ");
		System.out.println("-------------------------------------------------------------------");
	}
}
