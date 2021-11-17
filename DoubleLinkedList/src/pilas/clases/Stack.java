package pilas.clases;

import pilas.interfaces.StackMethods;

public class Stack implements StackMethods {

    Nodo top;
    int size;

    @Override
    public void push(Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.isEmpty()) {
            this.top = nuevo;
        } else {
            nuevo.setSiguiente(this.top);
            this.top = nuevo;
        }
        this.size++;
    }

    @Override
    public Object pop() {
        if (this.isEmpty()) {
            System.out.println("Pila vacía");
            return null;
        } else {
            Nodo aux = this.top;
            this.top = this.top.siguiente();
            this.size--;
            return aux.getInfo();
        }
    }

    @Override
    public Object search(String param) {
        if (!this.isEmpty()) {
            Nodo aux = this.iterator();
            do {
                if (aux.getInfo().toString().equals(param)) {
                    return aux.getInfo();
                }
                aux = aux.siguiente();
            } while (aux != null);
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Nodo aux = this.iterator();
        while (aux != null) {
            aux = aux.siguiente();
            cont++;
        }
        // return this.size;
        return cont;
    }

    @Override
    public Nodo iterator() {
        return this.top;
    }

    @Override
    public void print() {
        if (this.isEmpty()) {
            System.out.println("Pila vacía");
        } else {
            Nodo aux = this.iterator();
            do {
                System.out.println("[" + aux.getInfo().toString()
                        + "," + aux + "]");
                aux = aux.siguiente();
            } while (aux != null);

        }
    }

    @Override
    public Object peek() {
        return this.top.getInfo();
    }

}
