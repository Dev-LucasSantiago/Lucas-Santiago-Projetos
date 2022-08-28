package ListaLigada;

public class No<T> {
		
	private T elemento;
	private No<T> proximo;
	
	//Construtor com proximo nulo
	public No(T elemento) {
		super();
		this.elemento = elemento;
		this.proximo = null;
	}
	
	
	//Contrutor com proximo
	public No(T elemento, No<T> proximo) {
		super();
		this.elemento = elemento;
		this.proximo = proximo;
	}


	//Getters and Setters (get e set)
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public No<T> getProximo() {
		return proximo;
	}
	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	//To String
	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proximo=" + proximo + "]";
	}
	
	
	
}
