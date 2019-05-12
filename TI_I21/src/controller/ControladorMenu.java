package controller;

import java.util.Scanner;

import model.Cliente;

public class ControladorMenu {
	static Scanner entrada = new Scanner (System.in);
	static boolean repetir = true;
	
	public static void menuPrincipal(){
		int opccao;
		
		System.out.print("=====  BEM-VINDO à Loja CHOO ======\n");
		do{
				System.out.println("1.  Clientes\n2.  Produtos\n3.  Inventários\n4.  Vendas\n5.  Relatórios\n6.  Sair"); 
				System.out.println("-----------------------------");
				System.out.print("Seleccione a Operação Desejada: ");
				
					opccao = entrada.nextInt();
				
		
		System.out.println("-----------------------------");
		switch (opccao) {
		case 1:
			//boolean repetir= true;
			do{
				System.out.println("\n=========  CLIENTES ========= ");
				menuCliente();			
			}while(repetir);
			repetir = true;
			break;
		case 6:
			repetir = false;
			System.out.println("Obrigado, Adeus!");
			break;

		default:
			break;
		}
	}while (repetir);

	}
	public static void menuCliente (){
		String tempID;
		int opccao;
		System.out.println("   1.1.  Criar Cliente\n   1.2.  Actualizar Cliente\n   1.3.  Remover Cliente\n   1.4.  Imprimir Cliente\n   1.5.  Sair ");
		System.out.println("-----------------------------");
		System.out.print("Seleccione a opção: ");
		opccao = entrada.nextInt();
		System.out.println("-----------------------------");
		
		switch (opccao) {
		case 1:
			System.out.print("Insira o seu codigo de BI: ");
			tempID = entrada.next();
			System.out.print("Insira o Nome : ");
			String tempNome = entrada.next();
			System.out.print("Insira o email: ");
			String tempEmail = entrada.next();
			System.out.print("Insira o codigo postal: ");
			int tempCodigoPostal = entrada.nextInt();
			System.out.print("Insira a Data Nascimento (dd.mm.yyyy): ");
			String tempDataNascimento = entrada.next();
			
			Cliente.criarCliente(tempID, tempNome,tempEmail, tempCodigoPostal, tempDataNascimento);		
			break;
		case 2:
			System.out.println("-------LISTA DOS CLIENTES-------");
			ControladorCliente.visualizarCliente();
			System.out.println(" ");
			System.out.print("Insira o Nome do Cliente que pretenda atualizar: ");
			tempID = entrada.next();
			ControladorCliente.AtualizarCliente(tempID);
			break;
		case 3:
			System.out.println("-------LISTA DOS CLIENTES-------");
			ControladorCliente.visualizarCliente();
			System.out.println(" ");
			System.out.print("Insira o Nome do Cliente que pretenda remover: ");
			tempID = entrada.next();
			ControladorCliente.removerCliente(tempID);
			break;
		case 4:
			Cliente.visualizarCliente();
			break;
		case 5:
			repetir = false;
			break;

		default:
			System.out.println("Opcao invalida papito, tente novamente");
			menuCliente();
			break;
		}
	}
	
	public static void menuAtualizarCliente(Cliente cliente) {
		System.out.println("\nO que deseja actualizar?");
		System.out.println("1. Nome");
		System.out.println("2. Nuit");
		System.out.println("3. E-mail");
		System.out.println("4. Codigo postal");
		int key =  entrada.nextInt();
		
		switch (key) {
		case 1:
			System.out.println("\nIntroduza o novo nome:");
			String nome =  entrada.next();
			cliente.setNome(nome);
			System.out.println("O nome do cliente foi trocado com sucesso!");
			break;
		case 2:
			System.out.println("\nIntroduza o novo nuit:");
			int nuit =  entrada.nextInt();
			//cliente.setNuit(nuit);
			System.out.println("O nuit do cliente foi trocado com sucesso!");
			break;
		case 3:
			System.out.println("\nIntroduza o novo email:");
			String email =  entrada.next();
			cliente.setEmail(email);
			System.out.println("O email do cliente foi trocado com sucesso!");
			break;
		case 4:
			System.out.println("\nIntroduza o novo codigo postal");
			int cod_postal =  entrada.nextInt();
			cliente.setCodigoPostal(cod_postal);
			System.out.println("O codigo postal do cliente numero foi trocado com sucesso!");
			break;
		default:
			System.out.println("Escolha inválida! Por favor, insira os dados novamente.");
			menuAtualizarCliente(cliente);
		}
	}

		/*

* A título de exemplo segue abaixo o menu amigável:
1.	Clientes
2.	Produtos
3.	Inventarios
4.	Vendas
5.	Relatorios
6.	...

Quando a opção 1 for escolhida, deve aparecer um sub-menu:
1.1	Criar Cliente
1.2	Actualizar Cliente
1.3	Remover Cliente
1.4	...

E assim por diante.
*/
}

