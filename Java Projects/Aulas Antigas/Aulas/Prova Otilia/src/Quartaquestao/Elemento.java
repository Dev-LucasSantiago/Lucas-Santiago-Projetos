package Quartaquestao;

public class Elemento<TYPE> {
    private TYPE value;
    private Elemento<TYPE> next;
    private Elemento<TYPE> previous;

    public Elemento(TYPE newValue) {
        this.value = newValue;
    }

    public TYPE getValue() {
        return value;
    }
    public void setValue(TYPE value) {
        this.value = value;
    }

    public Elemento<TYPE> getNext() {
        return next;
    }
    public void setNext(Elemento<TYPE> next) {
        this.next = next;
    }

    public Elemento<TYPE> getPrevious() {
        return previous;
    }
    public void setPrevious(Elemento<TYPE> previous) {
        this.previous = previous;
    }
    
}