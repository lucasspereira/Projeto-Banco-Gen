package Modulo;

import java.util.Scanner;

public class Estudantes {
	
		
	public Estudantes() {
		
	}	
	
	Scanner leia = new Scanner(System.in);
	
	Bancodedados banco = new Bancodedados();
	
	public void BancoDadosEstudantes() {
				
		banco.NomeEstudante();
		banco.IdadeEstudante();
		banco.CPFestudante();
		banco.TelefoneEstudante();
		banco.EnderecoEstudante();
		banco.EmpresaEstudante();
		banco.RendaEstudante();
		
		
	}
	
	public void AlterarCadastros(String buscanome) {
		
		
		banco.AlterarCadastroEstudante(buscanome);
		
	}
	
	public void RemoverCadastros(String buscanome) {
		
		
		banco.RemoverEstudante(buscanome);
		
	}
	
	public void ImprimirEstudantes() {
		
		banco.ImprimirEstudantes();
	}
	
	public void Cadastro() {
		banco.CadastroNovoEstudante();
	}
			
	
	}
	

			

