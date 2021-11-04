package doublelinkedlist.interfaces;

import doublelinkedlist.clases.Nodo;

public interface DoubleLinkedListMethods {
    public void add(int posicion, Object info);
    public void addFirst(Object info);
    public void addLast(Object informacion);
    public void remove(int posicion);
    public void removeFirst();
    public void removeLast();
    public int size();
    public boolean isEmpty();
    public Nodo iteratorFirst();
    public Nodo iteratorLast();
    public Nodo search(String buscar);
    public Nodo get(int posicion);
    public void set(int posicion, Object informacion);
    public void print();
}
