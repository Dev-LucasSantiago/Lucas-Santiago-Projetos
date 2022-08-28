package PrimeiraQuestao;



public class ListaLigada<TYPE> {
    private Elemento<TYPE> primeiro;
    private Elemento<TYPE> ultimo;
    private int size;
    
    public ListaLigada() {
        this.size = 0;
    }
    
    public Elemento<TYPE> getPrimeiro() {
        return primeiro;
    }
    public void setPrimeiro(Elemento<TYPE> primeiro) {
        this.primeiro = primeiro;
    }
    
    public Elemento<TYPE> getUltimo() {
        return ultimo;
    }
    public void setUltimo(Elemento<TYPE> ultimo) {
        this.ultimo = ultimo;
    }
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    public void Adiciona(TYPE novoValor) {
        Elemento<TYPE> novoElemento = new Elemento<TYPE>(novoValor);
        if(this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.size++;
    }
    
    public void Remove(int j) {
        Elemento<TYPE> anterior = null;
        Elemento<TYPE> atual = this.primeiro;
        for(int i = 0; i < this.getSize(); i++) {
            if(atual.getValor().equals(j)) {
                if(this.size == 1) {
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                	anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.size--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    
    public Elemento<TYPE> get(int posicao) {
        Elemento<TYPE> atual = this.primeiro;
        for(int i = 0; i < posicao; i++) {
            if(atual.getProximo() != null) {
            	atual = atual.getProximo();
            }
        }
        return atual;
    }
}
