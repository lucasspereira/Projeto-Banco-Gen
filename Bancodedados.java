package Modulo;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Bancodedados {
		
	//nome
	ArrayList<String> estudante = new ArrayList<>();
	ArrayList<String> azul = new ArrayList<>();
	ArrayList<String> verde = new ArrayList<>();
	ArrayList<String> amarelo = new ArrayList<>();
	//idade
	ArrayList<Integer> idadeest = new ArrayList<Integer>();
	ArrayList<Integer> idadeazul = new ArrayList<Integer>();
	ArrayList<Integer> idadeverde = new ArrayList<Integer>();
	ArrayList<Integer> idadeamarelo = new ArrayList<Integer>();
	//cpf
	ArrayList<String> cpfest = new ArrayList<String>();
	ArrayList<String> cpfazul = new ArrayList<String>();
	ArrayList<String> cpfverde = new ArrayList<String>();
	ArrayList<String> cpfamarelo = new ArrayList<String>();
	//telefone
	ArrayList<Integer> esttel = new ArrayList<Integer>();
	ArrayList<Integer> azultel = new ArrayList<Integer>();
	ArrayList<Integer> verdetel = new ArrayList<Integer>();
	ArrayList<Integer> amarelotel = new ArrayList<Integer>();
	//endereco
	ArrayList<String> estendereco = new ArrayList<>();
	ArrayList<String> azulendereco = new ArrayList<>();
	ArrayList<String> verdeendereco = new ArrayList<>();
	ArrayList<String> amareloendereco = new ArrayList<>();
	//empresa
	ArrayList<String> estempresa = new ArrayList<>();
	ArrayList<String> azulempresa = new ArrayList<>();
	ArrayList<String> verdeempresa = new ArrayList<>();
	ArrayList<String> amareloempresa = new ArrayList<>();
	//renda
	ArrayList<Double> rendaest = new ArrayList<Double>();
	ArrayList<Double> rendaazul = new ArrayList<Double>();
	ArrayList<Double> rendaverde = new ArrayList<Double>();
	ArrayList<Double> rendaamarelo = new ArrayList<Double>();
	
	public 	Bancodedados() {}
	
	Scanner leia = new Scanner(System.in);
	
	public void NomeEstudante() {
			
		estudante.add("Veixuceu Souza Lima");
		estudante.add("Roberta Aparecida Andrade");
		estudante.add("Jose Nain Alberto Torres");
		estudante.add("Suzano Neves");
		estudante.add("Almeida Correia");
		estudante.add("Lucia Neves Joana Borges");
		
	}
	public void NomeAzul() {
		
		azul.add("Beatriz Lima Souza Oliveira");
		azul.add("Lucas Silva Pereira");
		azul.add("Alexsandro Queiroz Assunção");
		azul.add("Mateus Peixoto Ciriaco Costa");
		azul.add("Gabriel Monteiro");
		azul.add("Alexandre Nogueira de Souza");
	
	}
	
	public void NomeVerde() {
		
		verde.add("Naingolan Muller");
		verde.add("Cristano Bolando");
		verde.add("Marta Silva");
		verde.add("Neymar Olindo");
		verde.add("Leon Resident");
		verde.add("Lenadro Carvalho");
		verde.add("Matheus Juvencio");
		verde.add("Victor Monteiro");
	}

	public void NomeAmarelo() {
		
		amarelo.add("Maria Silva Fernandes");
		amarelo.add("Muller Alberto");
		amarelo.add("Cristina Fatima Silva");
		amarelo.add("Dona Lucia");
		amarelo.add("Mario do Armario");
		amarelo.add("Leandro Silva");
		amarelo.add("Iago Matheus");
		amarelo.add("Leonardo Amancio");
		amarelo.add("Juana Silva");
		amarelo.add("Jessica Carvalho");
		amarelo.add("Alberto de Andrade");
	}
	
	
	public void AlterarCadastroEstudante(String busca) {
		int op;
		estudante.contains(busca);
		if(estudante.contains(busca)) {
		System.out.println("Cliente encontrado!");
		int x;
		x = estudante.indexOf(busca);
			
		System.out.println("\nCliente: "+estudante.get(x)+", Idade: "+idadeest.get(x)+", com o CPF nº: "+cpfest.get(x)+
				";\nTelefone: "+esttel.get(x)+", reside em: "+estendereco.get(x)+";\nAtualmente trabalha na: "
				+estempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaest.get(x))+".\n");		
		
		do {System.out.println("ATENÇÃO! AS INFORMAÇÕES DO CLIENTE: "+estudante.get(x)+" SERÃO TODAS SUBSTITUIDAS!");
		System.out.println("\nTEM CERTEZA DISSO?\n| 1 - SIM | 2 - NÃO |");
		op = leia.nextInt();
		switch(op) {
		case 1 : estudante.remove(x);idadeest.remove(x);cpfest.remove(x);
		esttel.remove(x);estendereco.remove(x);estempresa.remove(x);rendaest.remove(x);
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		leia.nextLine();estudante.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeest.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfest.add(leia.nextLine());
		System.out.print("\nTelefone: ");
		esttel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); estendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		estempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaest.add(leia.nextDouble());
		System.out.println("Cliente alterado!");op=2;break;
		case 2:}}while(op!=2);
		}
		else {
		System.out.println("Cliente não encontrado");
		}
	}
	public void AlterarCadastroAmarelo(String busca) { // AMARELO
		int op;
		amarelo.contains(busca);
		if(amarelo.contains(busca)) {
		System.out.println("Cliente encontrado!");
		int x;
		x = amarelo.indexOf(busca);
			
		System.out.println("\nCliente: "+amarelo.get(x)+", Idade: "+idadeamarelo.get(x)+", com o CPF nº: "+cpfamarelo.get(x)+
				";\nTelefone: "+amarelotel.get(x)+", reside em: "+amareloendereco.get(x)+";\nAtualmente trabalha na: "
				+amareloempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaamarelo.get(x))+".\n");		
		
		do {System.out.println("ATENÇÃO! AS INFORMAÇÕES DO CLIENTE: "+amarelo.get(x)+" SERÃO TODAS SUBSTITUIDAS!");
		System.out.println("\nTEM CERTEZA DISSO?\n| 1 - SIM | 2 - NÃO |");
		op = leia.nextInt();
		switch(op) {
		case 1 : amarelo.remove(x);idadeamarelo.remove(x);cpfamarelo.remove(x);
		amarelotel.remove(x);amareloendereco.remove(x);amareloempresa.remove(x);rendaamarelo.remove(x);
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		leia.nextLine();amarelo.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeamarelo.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfamarelo.add(leia.nextLine());
		System.out.print("\nTelefone: ");
		amarelotel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); amareloendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		amareloempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaamarelo.add(leia.nextDouble());
		System.out.println("Cliente alterado!");op=2;break;
		case 2:}}while(op!=2);
		}
		else {
		System.out.println("Cliente não encontrado");
		}
	}
	
	public void AlterarCadastroAzul(String busca) { // AZUL
		int op;
		azul.contains(busca);
		if(azul.contains(busca)) {
		System.out.println("Cliente encontrado!");
		int x;
		x = azul.indexOf(busca);
			
		System.out.println("\nCliente: "+azul.get(x)+", Idade: "+idadeazul.get(x)+", com o CPF nº: "+cpfazul.get(x)+
				";\nTelefone: "+azultel.get(x)+", reside em: "+azulendereco.get(x)+";\nAtualmente trabalha na: "
				+azulempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaazul.get(x))+".\n");		
		
		do {System.out.println("ATENÇÃO! AS INFORMAÇÕES DO CLIENTE: "+azul.get(x)+" SERÃO TODAS SUBSTITUIDAS!");
		System.out.println("\nTEM CERTEZA DISSO?\n| 1 - SIM | 2 - NÃO |");
		op = leia.nextInt();
		switch(op) {
		case 1 : azul.remove(x);idadeazul.remove(x);cpfazul.remove(x);
		azultel.remove(x);azulendereco.remove(x);azulempresa.remove(x);rendaazul.remove(x);
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		leia.nextLine();azul.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeazul.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfazul.add(leia.nextLine());
		System.out.print("\nTelefone: ");
		azultel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); azulendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		azulempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaest.add(leia.nextDouble());
		System.out.println("Cliente alterado!");op=2;break;
		case 2:}}while(op!=2);
		}
		else {
		System.out.println("Cliente não encontrado");
		}
	}
	public void AlterarCadastroVerde(String busca) { // VERDE
		int op;
		verde.contains(busca);
		if(verde.contains(busca)) {
		System.out.println("Cliente encontrado!");
		int x;
		x = verde.indexOf(busca);
			
		System.out.println("\nCliente: "+verde.get(x)+", Idade: "+idadeverde.get(x)+", com o CPF nº: "+cpfverde.get(x)+
				";\nTelefone: "+verdetel.get(x)+", reside em: "+verdeendereco.get(x)+";\nAtualmente trabalha na: "
				+verdeempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaverde.get(x))+".\n");		
		
		do {System.out.println("ATENÇÃO! AS INFORMAÇÕES DO CLIENTE: "+verde.get(x)+" SERÃO TODAS SUBSTITUIDAS!");
		System.out.println("\nTEM CERTEZA DISSO?\n| 1 - SIM | 2 - NÃO |");
		op = leia.nextInt();
		switch(op) {
		case 1 : verde.remove(x);idadeverde.remove(x);cpfverde.remove(x);
		verdetel.remove(x);verdeendereco.remove(x);verdeempresa.remove(x);rendaverde.remove(x);
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		leia.nextLine();verde.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeverde.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfverde.add(leia.nextLine());
		System.out.print("\nTelefone: ");
		verdetel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); verdeendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		verdeempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaverde.add(leia.nextDouble());
		System.out.println("Cliente alterado!");op=2;break;
		case 2:}}while(op!=2);
		}
		else {
		System.out.println("Cliente não encontrado");
		}
	}
	

	public void RemoverEstudante(String busca) {
		estudante.contains(busca);
		if(estudante.contains(busca)) {
		estudante.remove(busca);
		System.out.println("Cliente removido!");
		}
		else {System.out.println("Cliente não encontrado");
		}
		}
	
	public void RemoverAmarelo(String busca) {
		amarelo.contains(busca);
		if(amarelo.contains(busca)) {
		amarelo.remove(busca);
		System.out.println("Cliente removido!");
		}
		else {System.out.println("Cliente não encontrado");
		}
		}
	
	public void RemoverAzul(String busca) {
		
		azul.contains(busca);
		if(azul.contains(busca)) {
			azul.remove(busca);
		System.out.println("Cliente removido!");
		}
		else {System.out.println("Cliente não encontrado");
		}
		}
	
	public void RemoverVerde(String busca) {
		verde.contains(busca);
		if(verde.contains(busca)) {
		verde.remove(busca);
		System.out.println("Cliente removido!");
		}
		else {System.out.println("Cliente não encontrado");
		}
		}
	

	
	public void IdadeEstudante() {
		
		idadeest.add(16);
		idadeest.add(16);
		idadeest.add(18);
		idadeest.add(20);
		idadeest.add(17);
		idadeest.add(18);
		
	}
	
	public void IdadeAzul() {
		
		idadeazul.add(24);
		idadeazul.add(26);
		idadeazul.add(20);
		idadeazul.add(20);
		idadeazul.add(25);
		idadeazul.add(23);
		
	}

	public void IdadeVerde() {
		idadeverde.add(30);
		idadeverde.add(42);
		idadeverde.add(26);
		idadeverde.add(20);
		idadeverde.add(29);
		idadeverde.add(57);
		idadeverde.add(26);
		idadeverde.add(31);

	}
	
	public void IdadeAmarelo() {
		idadeamarelo.add(16);
		idadeamarelo.add(63);
		idadeamarelo.add(52);
		idadeamarelo.add(32);
		idadeamarelo.add(25);
		idadeamarelo.add(23);
		idadeamarelo.add(29);
		idadeamarelo.add(45);
		idadeamarelo.add(71);
		idadeamarelo.add(21);
		idadeamarelo.add(29);
	}
	
	public void CPFestudante() {
		
		cpfest.add("423.566.001-97");
		cpfest.add("531.047.760-83");
		cpfest.add("365.714.080-82");
		cpfest.add("924.525.270-17");
		cpfest.add("589.994.380-74");
		cpfest.add("261.703.050-45");
	}
	
	public void CPFazul() {
		
		cpfazul.add("659.554.310-98");
		cpfazul.add("032.585.540-48");
		cpfazul.add("685.389.620-35");
		cpfazul.add("228.544.900-37");
		cpfazul.add("645.837.090-30");
		cpfazul.add("874.934.050-69");
	}
	
	public void CPFverde() {
		
		cpfverde.add("561.692.730-97");
		cpfverde.add("659.030.140-97");
		cpfverde.add("568.543.820-68");
		cpfverde.add("418.940.470-52");
		cpfverde.add("967.519.200-32");
		cpfverde.add("845.404.250-48");
		cpfverde.add("605.990.910-88");
		cpfverde.add("367.572.610-06");
		
	}

	public void CPFamarelo() {

	
		cpfamarelo.add("203.578.340-20");
		cpfamarelo.add("701.765.900-72");
		cpfamarelo.add("882.281.230-19");
		cpfamarelo.add("436.752.140-01");
		cpfamarelo.add("608.193.820-43");
		cpfamarelo.add("558.545.230-43");
		cpfamarelo.add("481.233.330-05");
		cpfamarelo.add("631.056.070-05");
		cpfamarelo.add("458.131.090-30");
		cpfamarelo.add("013.300.780-47");
		cpfamarelo.add("007.175.830-58");
	}

	public void TelefoneEstudante() {
		
		esttel.add(493032623);
		esttel.add(414751710);
		esttel.add(559577710);
		esttel.add(795684940);
		esttel.add(882453800);
		esttel.add(145589660);
		
	}
	
	public void TelefoneAzul() {
		
		azultel.add(905154470);
		azultel.add(804962150);
		azultel.add(650794720);
		azultel.add(858227450);
		azultel.add(550063050);
		azultel.add(503135710);
	}

	public void TelefoneVerde() {
		
		verdetel.add(344366350);
		verdetel.add(582640210);
		verdetel.add(536859750);
		verdetel.add(848683810);
		verdetel.add(471440310);
		verdetel.add(104206740);
		verdetel.add(153023540);
		verdetel.add(445251290);
	
	}
	
	public void TelefoneAmarelo() {
		
		amarelotel.add(702102210);
		amarelotel.add(497026630);
		amarelotel.add(735735880);
		amarelotel.add(958979150);
		amarelotel.add(191454360);
		amarelotel.add(410431040);
		amarelotel.add(764918654);
		amarelotel.add(721134410);
		amarelotel.add(556608860);
		amarelotel.add(310586630);
		amarelotel.add(319192950);
		
	}
	
	public void EnderecoEstudante() {
		
		estendereco.add("Rua do Enfermeiro, Jardim Universidade I, Cianorte-PR");
		estendereco.add("Rua Barbosa Filho, Cidade Nova, Manaus-AM");
		estendereco.add("Rua Coqueiral, Altos da Serra I, Cuiabá-MT");
		estendereco.add("Rua Sabedoria, Ipiranga, Nova Iguaçu-RJ");
		estendereco.add("Quadra 1101 Sul Avenida LO 27, Plano Diretor Sul, Palmas-TO");
		estendereco.add("Travessa Ubirassanga, Campo Belo, São Paulo-SP");
		
	}

	public void EnderecoAzul() {
		
		azulendereco.add("Quadra 307 Norte Alameda 29, Plano Diretor Norte, Palmas-TO");
		azulendereco.add("Avenida Capitão Sílvio, Áreas Especiais 02, Ariquemes-RO");
		azulendereco.add("Rua Água Suja, Ferreira da Costa, Ferreira da Costa, Itumbiara-GO");
		azulendereco.add("Rua Marcílio Dias, Esperança, Ilhéus-BA");
		azulendereco.add("Passagem Vinte Oito Agosto, Quarenta Horas (Coqueiro), Ananindeua-PA");
		azulendereco.add("Rua Projetada 3, Jardim Universitário, Cuiabá-MT");
		
	}
	
	public void EnderecoVerde() {
		
		verdeendereco.add("Rua Ediberto Celestino de Oliveira, Jardim Água Boa, Dourados-MS");
		verdeendereco.add("Rua C, Soledade, Aracaju-SE");
		verdeendereco.add("Rua Pitua, Padre Miguel, Rio de Janeiro-RJ");
		verdeendereco.add("Rua Içá, Puraquequara, Manaus-AM");
		verdeendereco.add("Rua CJ-6, Jardim Tropical, Boa Vista-RR");
		verdeendereco.add("Rua São Paulo, Setor Oeste, Araguaína-TO");
		verdeendereco.add("Quadra QNP 15 Conjunto C, Ceilândia Norte (Ceilândia), Brasília-DF");
		verdeendereco.add("Rua Jorge Sardinha da Silva, Recanto da Sereia, Guarapari-ES");
	}
	
	public void EnderecoAmarelo() {
		
		amareloendereco.add("Rua C, Diácono João Luiz Pozzobon, Santa Maria-RS");
		amareloendereco.add("Praça Gumar Bedicks, Jardim Glória, Americana-SP");
		amareloendereco.add("Rua Nossa Senhora do Rosário, São Jorge, Itacoatiara-AM");
		amareloendereco.add("Rua Nove de Julho, Vila Ipiranga, Campo Grande-MS");
		amareloendereco.add("3ª Travessa Jardim do Éden, Planalto, Natal-RN");
		amareloendereco.add("Rua Abgail Mendes Kosouski, Alto Cascavel, Guarapuava-PR");
		amareloendereco.add("Rua Cuco, Jardim Colibrí, Campo Grande-MS");
		amareloendereco.add("Rua Vereador Nascimento Leão, Olho D'Água dos Cazuzinhos, Arapiraca-AL");
		amareloendereco.add("Rua Wendi Pinto, Clima Bom, Maceió-AL");
		amareloendereco.add("Rua Raquel de Queiroz, Nova Esperança, Porto Velho-RO");
		amareloendereco.add("Rua Conde de Porto Alegre, Vila Alba, Campo Grande-MS");
	}

	public void EmpresaEstudante() {
		
		estempresa.add("Débora e Eduarda Locações de Automóveis ME");
		estempresa.add("Arthur e Leonardo Advocacia ME");
		estempresa.add("N/A");
		estempresa.add("Alícia e Davi Casa Noturna ME");
		estempresa.add("N/A");
		estempresa.add("N/A");
	}
	
	public void EmpresaAzul() {
		
		azulempresa.add("Augusto e Davi Comercio de Bebidas ME");
		azulempresa.add("César e Betina Joalheria Ltda");
		azulempresa.add("Levi e Flávia Vidros ME");
		azulempresa.add("Kauê e Marli Advocacia ME");
		azulempresa.add("Andreia e Pietro Marketing Ltda");
		azulempresa.add("Anthony e Antonella Pizzaria Delivery Ltda");
		
	}
	
	public void EmpresaVerde() {
		
		verdeempresa.add("Benedito e Victor Marcenaria Ltda");
		verdeempresa.add("Esther e Antonio Consultoria Financeira Ltda");
		verdeempresa.add("Allana e Breno Marcenaria ME");
		verdeempresa.add("Gabrielly e Fabiana Advocacia Ltda");
		verdeempresa.add("Malu e Ester Advocacia ME");
		verdeempresa.add("Elza e Regina Doces & Salgados Ltda");
		verdeempresa.add("Raul e Victor Gráfica Ltda");
		verdeempresa.add("Amanda e Natália Pães e Doces Ltda");
		
	}
	
	public void EmpresaAmarelo() {
		
		amareloempresa.add("Felipe e Analu Corretores Associados Ltda");
		amareloempresa.add("Lavínia e Cristiane Alimentos Ltda");
		amareloempresa.add("Vitória e Kauê Informática ME");
		amareloempresa.add("Sérgio e Kaique Pães e Doces Ltda");
		amareloempresa.add("Samuel e Emanuel Contábil ME");
		amareloempresa.add("Mateus e Marcos Vinicius Financeira Ltda");
		amareloempresa.add("Nelson e Laura Fotografias Ltda");
		amareloempresa.add("Benjamin e Bruna Pizzaria Delivery Ltda");
		amareloempresa.add("Marcela e Thales Padaria Ltda");
		amareloempresa.add("Tatiane e Natália Padaria ME");
		amareloempresa.add("Valentina e Joaquim Casa Noturna Ltda");
		
	}
	
	public void RendaEstudante() {
		
		rendaest.add(1017.00);
		rendaest.add(1455.00);
		rendaest.add(0.0);
		rendaest.add(1182.00);
		rendaest.add(0.0);
		rendaest.add(0.0);
		
	}
	
	public void RendaAzul() {
		
		rendaazul.add(11735.00);
		rendaazul.add(10177.00);
		rendaazul.add(12277.00);
		rendaazul.add(11749.00);
		rendaazul.add(13080.00);
		rendaazul.add(12246.00);
		
	}
	
	public void RendaVerde() {
		
		rendaverde.add(7081.00);
		rendaverde.add(7525.00);
		rendaverde.add(5779.00);
		rendaverde.add(5637.00);
		rendaverde.add(6574.00);
		rendaverde.add(7854.00);
		rendaverde.add(7503.00);
		rendaverde.add(5374.00);
	}
	
	public void RendaAmarelo() {
		
		rendaamarelo.add(3466.00);
		rendaamarelo.add(2329.00);
		rendaamarelo.add(2645.00);
		rendaamarelo.add(3571.00);
		rendaamarelo.add(2277.00);
		rendaamarelo.add(2607.00);
		rendaamarelo.add(3100.00);
		rendaamarelo.add(1859.00);
		rendaamarelo.add(2332.00);
		rendaamarelo.add(2190.00);
		rendaamarelo.add(1978.00);
		
	}
	
	public void ImprimirEstudantes() {
		
		System.out.println("|Lista de Clientes (PLANO ESTUDANTE)|");
		
		for(int x=0;x<estudante.size();x++){
			
			System.out.println("Cliente: "+estudante.get(x)+", Idade: "+idadeest.get(x)+", com o CPF nº: "+cpfest.get(x)+
					";\nTelefone: "+esttel.get(x)+", reside em: "+estendereco.get(x)+";\nAtualmente trabalha na: "
					+estempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaest.get(x))+".\n");
			}
		}
	
	public String FormataMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}
	
	public void ImprimirAzul() {
		
		System.out.println("|Lista de Clientes (PLANO AZUL)|");
		
		for(int x=0;x<azul.size();x++){
			
			System.out.println("Cliente: "+azul.get(x)+", Idade: "+idadeazul.get(x)+", com o CPF nº: "+cpfazul.get(x)+
					";\nTelefone: "+azultel.get(x)+", reside em: "+azulendereco.get(x)+";\nAtualmente trabalha na: "
					+azulempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaazul.get(x))+".\n");
			}
		}
	
	public void ImprimirVerde() {
		
		System.out.println("|Lista de Clientes (PLANO VERDE)|");
		
		for(int x=0;x<verde.size();x++){
			
			System.out.println("Cliente: "+verde.get(x)+", Idade: "+idadeverde.get(x)+", com o CPF nº: "+cpfverde.get(x)+
					";\nTelefone: "+verdetel.get(x)+", reside em: "+verdeendereco.get(x)+";\nAtualmente trabalha na: "
					+verdeempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaverde.get(x))+".\n");
			}
		}

	public void ImprimirAmarelo() {
	
			System.out.println("|Lista de Clientes (PLANO AMARELO)|");
	
			for(int x=0;x<amarelo.size();x++){
		
		System.out.println("Cliente: "+amarelo.get(x)+", Idade: "+idadeamarelo.get(x)+", com o CPF nº: "+cpfamarelo.get(x)+
				";\nTelefone: "+amarelotel.get(x)+", reside em: "+amareloendereco.get(x)+";\nAtualmente trabalha na: "
				+amareloempresa.get(x)+", com renda de: "+this.FormataMoeda(rendaamarelo.get(x))+".\n");
		}
	}
	public void CadastroNovoEstudante () {
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		estudante.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeest.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfest.add(leia.nextLine());
		System.out.print("\nTelfone: ");
		esttel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); estendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		estempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaest.add(leia.nextDouble());
	}
	
	public void CadastroNovoAmarelo () {
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		amarelo.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeamarelo.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfamarelo.add(leia.nextLine());
		System.out.print("\nTelfone: ");
		amarelotel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); amareloendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		amareloempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaamarelo.add(leia.nextDouble());
}
	public void CadastroNovoVerde() {
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		verde.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeverde.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfverde.add(leia.nextLine());
		System.out.print("\nTelfone: ");
		verdetel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); verdeendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		verdeempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaverde.add(leia.nextDouble());
	}
	public void CadastroNovoAzul(){
		System.out.println("Entre com as novas informações de cadastro: ");
		System.out.print("\nNome: ");
		azul.add(leia.nextLine());
		System.out.print("\nIdade: ");
		idadeazul.add(leia.nextInt());
		System.out.print("\nCPF: ");
		leia.nextLine(); cpfazul.add(leia.nextLine());
		System.out.print("\nTelfone: ");
		azultel.add(leia.nextInt());
		System.out.print("\nEndereço: ");
		leia.nextLine(); azulendereco.add(leia.nextLine());
		System.out.print("\nEmpresa que trabalha (em caso de nenhuma digitar N/A): ");
		azulempresa.add(leia.nextLine());
		System.out.print("\nRenda (em caso de sem renda, digitar 0,00): ");
		rendaazul.add(leia.nextDouble());
	}
}
