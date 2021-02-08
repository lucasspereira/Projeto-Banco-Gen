package Modulo;

public class Amarelo {
	
		
	public Amarelo() {
		
	}	
	
Bancodedados banco = new Bancodedados();
	
	public void BancoDadosAmarelo() {
				
		banco.NomeAmarelo();
		banco.IdadeAmarelo();
		banco.CPFamarelo();
		banco.TelefoneAmarelo();
		banco.EnderecoAmarelo();
		banco.EmpresaAmarelo();
		banco.RendaAmarelo();
	}	
	
	
	public void AlterarCadastros(String buscanome) {
		
		banco.AlterarCadastroAmarelo(buscanome);
	}
	
	public void RemoverCadastros(String buscanome) {
		
		banco.RemoverAmarelo(buscanome);
		
	}
	
	
	public void ImprimirAmarelo() {
		
		banco.ImprimirAmarelo();
	}	
	
	public void Cadastro() {
		banco.CadastroNovoAmarelo();
	}
			
	
	}
	

			

