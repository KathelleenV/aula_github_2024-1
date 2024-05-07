package banco;

import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner leitor = new Scanner(System.in);
		boolean menu = true;
		int cpf, numConta = 1, conta, conta2, opcao_menu;
        double valor, saldo;
		String nome;
		Banco b = new Banco();

		while(menu == true){
			System.out.println("\n|-----------------------------------|");
			System.out.println("|           MENU DO BANCO           |");
			System.out.println("|-----------------------------------|");
			System.out.println("| 1 - Criar conta                   |\r\n"
							 + "| 2 - Realizar deposito             |\r\n"
							 + "| 3 - Realizar saque                |\r\n"
                             + "| 4 - Realizar transferencia        |\r\n"
                             + "| 5 - Consultar saldo               |\r\n"
							 + "| 0 - Sair                          |\r\n"
							 + "|-----------------------------------|\r\n");
			System.out.print("Digite uma opcao: ");
			opcao_menu = leitor.nextInt();
			
			switch(opcao_menu){
				case 1:
					System.out.print("\nDigite o CPF: ");
                    cpf = leitor.nextInt();
                    System.out.print("\nDigite o nome: ");
					nome = leitor.next();
                    Pessoa p1 = new Pessoa(cpf, nome);
                    Conta c1 = new Conta(numConta, p1);
                    b.inserir(c1);
					System.out.println("\nConta criada, com sucesso! Seu numero de conta eh "+ numConta +"!");
                    numConta++;
					break;
				case 2:
					System.out.print("\nDigite o numero da conta: ");
                    conta = leitor.nextInt();
                    System.out.print("\nDigite o valor: ");
					valor = leitor.nextInt();
					break;
				case 3:
					System.out.print("\nDigite o numero da conta: ");
                    conta = leitor.nextInt();
                    System.out.print("\nDigite o valor: ");
					valor = leitor.nextInt();
					break;
				case 4:
					System.out.print("\nDigite o numero da conta atual: ");
                    conta = leitor.nextInt();
                    System.out.print("\nDigite o numero da conta para receber a transferencia: ");
                    conta2 = leitor.nextInt();
                    System.out.print("\nDigite o valor: ");
					valor = leitor.nextInt();
					break;
				case 5:
                    System.out.print("\nDigite o numero da conta: ");
                    conta = leitor.nextInt();
					break;
                case 0:
                    System.out.println("\nAplicacao Finalizada!\n");
                    menu = false;
                    break;
				default:
					System.out.println("\nEntrada invalida!");
					continue;
			}
		}
		leitor.close();
	}
}