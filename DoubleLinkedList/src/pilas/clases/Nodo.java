package pilas.clases;

public class Nodo {
    private Nodo siguiente;
    private Object info;

    public Nodo() {
    }

    public Nodo(Object info) {
        this.siguiente = null;
        this.info = info;
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
    
}
