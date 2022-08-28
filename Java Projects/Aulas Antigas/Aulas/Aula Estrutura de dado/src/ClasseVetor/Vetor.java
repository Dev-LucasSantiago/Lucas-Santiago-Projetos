package ClasseVetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho; // controlar o tamanho do vetor
	
	public Vetor(int capacidade) {
		elementos = new String[capacidade];
		tamanho = 0;
	}
	
	public int tamanho() {
		return tamanho;
	}
	
	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new  IllegalArgumentException("Posição Inválida!");
		}
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
			
		}
		this.tamanho--;
	}

	@Override
	public String toString() {		
		StringBuilder s = new StringBuilder();
		s.append("[");		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}		
		s.append("]");		
		return s.toString();
	}

	public boolean adiciona(String elemento) {
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}
	
	
	
	public boolean adiciona(int posicao , String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new  IllegalArgumentException("Posição Inválida!");
		}
		this.aumentaCapacidade();
		// mover todos os elementos
		for(int i = this.tamanho-1; i >= posicao;i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length + 1];
			for(int i = 0; i< this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			elementos = elementosNovos;		
		}
	}
	
	/*public void adiciona(String elemento) throws Exception {
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
		}else {
			throw new Exception("Vetor já esta cheio, não é possível adicionar mais elementos");
		}
	}*/
	
	/*public void adiciona(String elemento) {
		for(int i = 0; i < elementos.length; i++) {
			if(elementos[i] == null) {
				elementos[i] = elemento;
				break;
			}
		}
	}*/
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new  IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao];
	}
	
	public int  busca(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
}
