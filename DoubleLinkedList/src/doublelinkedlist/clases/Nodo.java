package doublelinkedlist.clases;

public class Nodo {
    private Object info;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(Object info) {
        this.info = info;
        this.siguiente = null;
        this.anterior = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Nodo siguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo anterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
