package Hash;

public class Hash {
	int operador;		//Atributo Operador
	Lista[] vetor;		//Vetor de Listas
	
	Hash(int operador){							//Construtor iniciando com um operador
		this.operador = operador;				//Inicializa o Operador
		vetor = new Lista[operador];			//Inicializa o vetor de Listas
		for(int i = 0; i < operador; i++) {		//Para cada posição do vetor
			vetor[i] = new Lista();				//Inicializa a lista daquela posição do vetor
		}
	}
	
	void inserir(Contato contato) {					//Método para inserir um contato
		int chave =  contato.codigo % operador;		//Posição = resto / operador
		vetor[chave].Inserir(contato);				//Insere o contato naquela lista
	}
	
	Contato buscar(int codigo) {						//
		return vetor[codigo % operador].buscar(codigo);	//
	}
	
	public String toString() {
		String out = "";
		for(int i = 0; i < operador;i++) {
			out += ""+i+": ";
			out += vetor[i % operador]+"\n";
		}
		return out;
	}
}
