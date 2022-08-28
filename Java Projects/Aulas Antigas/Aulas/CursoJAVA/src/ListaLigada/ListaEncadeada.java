package ListaLigada;

public class ListaEncadeada<T> {
	
	private No<T> inicio;
	private No<T>proximo;
	private int tamanho = 0;
	
	public void adiciona(T elemento) {
		No<T> celula = new No<T>(elemento);
		if(this.inicio == null && this.proximo == null) {
			this.inicio = celula;
			this.proximo = celula;
		}else {
			this.proximo.setProximo(celula);
			this.proximo = celula;
		}
		this.tamanho ++;
	}
	
	public No<T> getProximo() {
		return proximo;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}
	
	
}
