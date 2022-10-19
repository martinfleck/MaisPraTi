
import java.io.Console;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import exception.SistemaException;
import menu.Menu;
import service.Service;
import util.Delay;

public class Principal {

	public static void main(String[] args)  throws InputMismatchException, SistemaException {

		int opcao1, opcao2;

		boolean continuaExecutando = true;

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Service serviceApp = new Service(sc);

		do {

			try {

				Menu.mensagem_BemVindo();

				opcao1 = sc.nextInt();
				sc.nextLine();

				switch (opcao1) {

				case 1: {
					Menu.mensagem_NovoCadastro();
					
					serviceApp.cadastraPessoa();
					Delay.aguarda(2000);
					break;
				}
				case 2: {
					Menu.mensagem_TelaDeDados();
					
					serviceApp.showPessoas();
					Delay.aguarda(2000);
					break;
				}
				case 3: {
					Menu.mensagem_TelaDeDados();
					
					serviceApp.showAlunos();
					Delay.aguarda(2000);
					break;
				}
				case 4: {
					Menu.mensagem_TelaDeDados();
					serviceApp.showPessoas();
					Menu.mensagem_EscolhaPeloID();
					opcao2 = sc.nextInt();
					sc.nextLine();
					
					int op = opcao2;
					
					serviceApp.atualizaCadastro(opcao2);
					Menu.mensagem_CadastroAtualizado();
					Delay.aguarda(2000);
					break;
				}
				case 5: {
					Menu.mensagem_TelaDeDados();
					serviceApp.showPessoas();
					Menu.mensagem_EscolhaPeloID();
					opcao2 = sc.nextInt();
					sc.nextLine();

					serviceApp.removePessoa(opcao2);
					Menu.mensagem_CadastroAtualizado();
					Delay.aguarda(2000);
					break;
				}
				case 6: {

					continuaExecutando = false;

					Menu.mensagem_Agradecimento();
					break;
				}
				default: {
					Menu.mensagem_OpcaoInvalida();
				}

				}

			} catch (SistemaException e) {

				System.out.println(e.getMessage());

			}catch (InputMismatchException e) {

				System.out.println("         Entrada invalida...");

			} finally {

				Delay.aguarda(2000);

			}

		} while (continuaExecutando);

	}
}
