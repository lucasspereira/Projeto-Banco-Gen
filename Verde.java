package Modulo;

public class Verde {
	
		
	public Verde() {
		
	}	
	
Bancodedados banco = new Bancodedados();
	
	public void BancoDadosVerde() {
				
		banco.NomeVerde();
		banco.IdadeVerde();
		banco.CPFverde();
		banco.TelefoneVerde();
		banco.EnderecoVerde();
		banco.EmpresaVerde();
		banco.RendaVerde();
	}	
	
	
	public void AlterarCadastros(String buscanome) {
		banco.AlterarCadastroVerde(buscanome);
	}
	
	public void RemoverCadastros(String buscanome) {
		
		banco.RemoverVerde(buscanome);
		
	}
	
	
	public void ImprimirVerde() {
		
		banco.ImprimirVerde();
	}
	
	public void Cadastro() {
		banco.CadastroNovoVerde();
	}
			
	
	}
	

			

