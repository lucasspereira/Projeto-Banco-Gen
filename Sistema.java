package Modulo;

import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) throws InterruptedException { 
		
		//for(int i = 0; i<10;i++) {System.out.println();}//limpa
		
		Estudantes estudante = new Estudantes();
		estudante.BancoDadosEstudantes();
		Azul azul = new Azul();
		azul.BancoDadosAzul();
		Verde verde = new Verde();
		verde.BancoDadosVerde();
		Amarelo amarelo = new Amarelo();
		amarelo.BancoDadosAmarelo();
		Scanner leia = new Scanner (System.in);
		int op, op1, op2, op3, op4, op5, op6 = 0, op7, op15, login = 0;
		new Thread();
		String username = "Luis.Vagner",senha = "Adm01", nomeusuario,senhaconfere;
		
		System.out.println("Olá, bem-vindo de volta!");
		do{
		System.out.println("\nEntre com seu nome de usuário:");
		System.out.print("DIGITE: ");
		nomeusuario = leia.nextLine();
		System.out.println("\nEntre com sua senha:");
		System.out.print("DIGITE: ");
		senhaconfere = leia.nextLine();
		if (username.equals(nomeusuario)&&senha.equals(senhaconfere))
		{System.out.println("\nUsuário logado com sucesso!");login=1;}
		else {System.out.println("Usuário ou senha incorreta!\nTente novamente!"); }}while(login!=1);
		Thread.sleep(3000);
		
		//MENU PRINCIPAL
		do {
		System.out.println();
		System.out.println("    MENU PRINCIPAL");
		System.out.println("=======================");
		System.out.println("|  ESCOLHA UMA OPÇÃO: |");
		System.out.println("|  1) NOVO CLIENTE    |");
		System.out.println("|  2) CADASTROS       |");
		System.out.println("|  3) SAIR            |");
		System.out.println("=======================");
		System.out.print("DIGITE: ");
		op = leia.nextInt();
		
		switch(op){	
		//MENU NOVO CLIENTE
		case 1 :
		{
		do{System.out.println("\n|1 - PLANO ESTUDANTE | 2 - PLANO AZUL | 3 - PLANO VERDE    |\n|4 - PLANO AMARELO   | 9 - VOLTAR");
		System.out.print("DIGITE: ");
		op15 = leia.nextInt();
		switch(op15) {
		case 1 : 
			estudante.Cadastro();
			op15=9;break;
		
		case 2 :
			azul.Cadastro();
			op15=9;break;
			
		case 3 :
			verde.Cadastro();
			op15=9;break;
			
		case 4 :
			amarelo.Cadastro();
			op15=9;break;
			
		case 9 : op15=9;break;
		
		default:
		System.out.println("Opção inválida!");
		break;
			
		}
		}while(op15 != 9);break;
		}
		
		
			
			
		//MENU CADASTROS
		case 2 :
		{	
		
		//INICIO
		do{
		System.out.println("\n\t\t    MENU CADASTROS:\n|1 - VERIFICAR CADASTROS | 2 - VOLTAR PARA O MENU PRINCIPAL |");
		System.out.print("DIGITE: ");
		op2 = leia.nextInt();
		switch(op2) {
		
		//MENU VERIFICAR CADASTROS
		case 1:do{System.out.println("\n\t\t    VERIFICAR CADASTROS:\n|1 - VERIFICAR PLANO ESTUDANTE "
		+ "| 2 - VERIFICAR PLANO AZUL | 3 - VERIFICAR PLANO VERDE    |\n|4 - VERIFICAR PLANO AMARELO   |"
		+"   | 9 - VOLTAR AO MENU CADASTROS |");
		op3 = leia.nextInt();
		switch(op3) { 
		
		//MENU PLANO ESTUDANTE
		case 1:do{ System.out.println("\n\t\t   PLANO ESTUDANTE:\n|1 - VERIFICAR CADASTROS | 2 - EDITAR CADASTRO "
				+ "| 3 - REMOVER CADASTRO | 9 - VOLTAR");
		op4 = leia.nextInt();
		switch(op4) {
		case 1:do{estudante.ImprimirEstudantes();System.out.println("\n\t\t  1 - VOLTAR");op5 = leia.nextInt();}while(op5!=1);break;
		case 2: System.out.print("\nDigite o nome do cliente que deseja alterar:");leia.nextLine();estudante.AlterarCadastros(leia.nextLine());break;
		case 3: System.out.print("\nDigite o nome do cliente que deseja remover:");leia.nextLine();estudante.RemoverCadastros(leia.nextLine());break;
		case 9:System.out.println("\nCARREGANDO...");break;
		default:System.out.println("\nOPÇÃO INVÁLIDA!");break;
		}}while(op4!=4);break;//FIM MENU ESTUDANTE
		
		//MENU PLANO AZUL
		case 2:	do{System.out.println("\n\t\t   PLANO AZUL:\n|1 - VERIFICAR CADASTROS | 2 - EDITAR CADASTRO "
				+ "| 3 - REMOVER CADASTRO | 9 - VOLTAR");
		op6 = leia.nextInt();
		switch(op6) {
		case 1:do{azul.ImprimirAzul();System.out.println("\n\t\t  1 - VOLTAR");op7 = leia.nextInt();}while(op7!=1);break;
		case 2: System.out.print("\nDigite o nome do cliente que deseja alterar:");leia.nextLine();azul.AlterarCadastros(leia.nextLine());break;
		case 3: System.out.print("\nDigite o nome do cliente que deseja remover:");leia.nextLine();azul.RemoverCadastros(leia.nextLine());break;
		case 9:System.out.println("\nCARREGANDO...");break;
		default:System.out.println("\nOPÇÃO INVÁLIDA!");break;
		}}while(op6!=4);break;//FIM MENU PLANO AZUL
		
		case 3:	int op8, op9;
		
		//MENU PLANO VERDE	
			do{System.out.println("\n\t\t   PLANO VERDE:\n|1 - VERIFICAR CADASTROS | 2 - EDITAR CADASTRO "
				+ "| 3 - REMOVER CADASTRO | 9 - VOLTAR");
		op9 = leia.nextInt();
		switch(op9) {
		case 1:do{verde.ImprimirVerde();System.out.println("\n\t\t  1 - VOLTAR");op8 = leia.nextInt();}while(op8!=1);break;
		case 2: System.out.print("\nDigite o nome do cliente que deseja alterar:");leia.nextLine();verde.AlterarCadastros(leia.nextLine());break;
		case 3: System.out.print("\nDigite o nome do cliente que deseja remover:");leia.nextLine();verde.RemoverCadastros(leia.nextLine());break;
		case 9:System.out.println("\nCARREGANDO...");break;
		default:System.out.println("\nOPÇÃO INVÁLIDA!");break;
		}}while(op9!=9);break;//FIM MENU PLANO VERDE
		
		case 4: 
		
			int op10;
			//MENU PLANO VERDE	
			do{System.out.println("\n\t\t   PLANO VERDE:\n|1 - VERIFICAR CADASTROS | 2 - EDITAR CADASTRO "
				+ "| 3 - REMOVER CADASTRO | 9 - VOLTAR");
		op10 = leia.nextInt();
		switch(op10) {
		case 1:int op11;
			do{amarelo.ImprimirAmarelo();System.out.println("\n\t\t  1 - VOLTAR");op11 = leia.nextInt();}while(op11!=1);break;
		case 2: System.out.print("\nDigite o nome do cliente que deseja alterar:");leia.nextLine();amarelo.AlterarCadastros(leia.nextLine());break;
		case 3: System.out.print("\nDigite o nome do cliente que deseja remover:");leia.nextLine();amarelo.RemoverCadastros(leia.nextLine());break;
		case 9:System.out.println("\nCARREGANDO...");break;
		default:System.out.println("\nOPÇÃO INVÁLIDA!");break;
		}}while(op10!=4);break;//FIM MENU PLANO VERDE
		
		
		}}while(op3!=9);break;//FIM VERIFICAR CADASTROS
		
		
		
		
		
		
		// SAIR E OPÇÃO INVÁLIDA - MENU CADASTRO
		case 2:System.out.println("\nCARREGANDO...");break;
		default:System.out.println("\nOPÇÃO INVÁLIDA!");break;
		}}while(op2!=2);break;}//FIM DO MENU CADASTRO
			
			
			
			
		
		
		
		//SAIR E OPÇÃO INVÁLIDA - MENU PRINCIPAL
		case 3 :
		{System.out.println("\n****************************************************************************");
		System.out.println("\n\t\tATÉ A PRÓXIMA! ;)");break;}
		default :
		{System.out.println("\nOPÇÃO INVÁLIDA!");break;}}}while(op!=3);
	
	
	
	}

}