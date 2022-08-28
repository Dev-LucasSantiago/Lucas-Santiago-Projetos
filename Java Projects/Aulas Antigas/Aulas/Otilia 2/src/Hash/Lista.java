package Hash;

public class Lista {
	No inicio;		//Ponteiro para o inicio da lista
	int tamanho;	//Tamanho da lista
	
	public void Inserir(Contato info) {	//Método para inserir o inicio
		No no = new No();				//Cria um nó
		no.info = info;					//Atribui informação ao nó
		no.proximo = inicio;			//O ponteiro próximo do nó inserido para o inicio
		inicio = no;					//O inicio passa a ser o novo nó
		tamanho++;						//Acrescenta mais um ao tamanho da Lista
	}
	
	public Contato buscar(int codigo) {		//Método buscar pelo código
		No no = inicio;						//Vai para o incio da lista
		while(no != null) {					//Enquanto o nó não for nulo
			if(no.info.codigo == codigo) {	//Se o código for igual ao parâmetro passado
				return no.info;				//Retorna na informação do tipo código
			}
			no = no.proximo;				//Vai para o próximo nó
		}
		return null;
	}
	
	public String toString() {		//Sobrescreve o método toString	
		String out = "";			//Cria uma String vazia para retorno
		No no = inicio;				//Vai para o início da Lista
		while(no != null) {			//Enquanto o nó for diferente de nulo
			out += no.info + " ";	//Adiciona a String a informação
			no = no.proximo;		//Vai para o próximo nó
		}
		return out;					//Retorna a String
	}
}
