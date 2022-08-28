package Quartaquestao;

public class ListaLigada<TYPE> {
    private Elemento<TYPE> first;
    private Elemento<TYPE> last;
    private int size;
    
    public ListaLigada() {
        this.size = 0;
    }
    
    public Elemento<TYPE> getFirst() {
        return first;
    }
    public void setFirst(Elemento<TYPE> first) {
        this.first = first;
    }
    
    public Elemento<TYPE> getLast() {
        return last;
    }
    public void setLast(Elemento<TYPE> last) {
        this.last = last;
    }
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    
    public void add(TYPE newValue) {
        Elemento<TYPE> newElement = new Elemento<TYPE>(newValue);
        if(this.first == null && this.last == null) {
            this.first = newElement;
            this.last = newElement;
        } else {
            this.last.setNext(newElement);
            this.last = newElement;
        }
        this.size++;
    }
    
    public void remove(Elemento<TYPE> searchValue) {
        Elemento<TYPE> past = null;
        Elemento<TYPE> actual = this.first;
        for(int i = 0; i < this.getSize(); i++) {
            if(actual.getValue() != null) {
                if(this.size == 1) {
                    this.first = null;
                    this.last = null;
                } else if (actual == first) {
                    this.first = actual.getNext();
                    actual.setNext(null);
                } else if (actual == last) {
                    this.last = past;
                    past.setNext(null);
                } else {
                    past.setNext(actual.getNext());
                    actual = null;
                }
                this.size--;
                break;
            }
            past = actual;
            actual = actual.getNext();
        }
    }
    
    public Elemento<TYPE> get(int position) {
        Elemento<TYPE> actual = this.first;
        for(int i = 0; i < position; i++) {
            if(actual.getNext() != null) {
                actual = actual.getNext();
            }
        }
        return actual;
    }
}
