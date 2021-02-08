package Modulo;

public class Azul {
	
		
	public Azul() {
		
	}	
	Bancodedados banco = new Bancodedados();
	
	public void BancoDadosAzul() {
				
		banco.NomeAzul();
		banco.IdadeAzul();
		banco.CPFazul();
		banco.TelefoneAzul();
		banco.EnderecoAzul();
		banco.EmpresaAzul();
		banco.RendaAzul();
	}	
	
	
	public void AlterarCadastros(String buscanome) {
		banco.AlterarCadastroAzul(buscanome);
	}
	
	public void RemoverCadastros(String buscanome) {
		
		banco.RemoverAzul(buscanome);
		
	}
	
	
	public void ImprimirAzul() {
		
		banco.ImprimirAzul();
	}
	
	public void Cadastro() {
		banco.CadastroNovoAzul();
	}
	
	}
	

			

