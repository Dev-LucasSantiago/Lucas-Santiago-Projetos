package Hash;

public class Contato {
	int codigo; 		// Código do contato
	String nome; 		//Nome do contato
	String telefone; 	// Telefone do contato
	
	//Construtor com prarâmetros - inicializa os atributos
	public Contato(int codigo, String nome, String telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "("+codigo+","+nome+")";
	}
	
	
}
