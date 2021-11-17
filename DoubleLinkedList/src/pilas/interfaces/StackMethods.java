package pilas.interfaces;

import pilas.clases.Nodo;

public interface StackMethods {
    public void push(Object info);
    public Object pop();
    public Object peek();
    public Object search(String param);
    public boolean isEmpty();
    public int size();
    public Nodo iterator();
    public void print();
}
