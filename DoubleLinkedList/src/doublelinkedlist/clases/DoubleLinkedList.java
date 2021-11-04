package doublelinkedlist.clases;

import doublelinkedlist.interfaces.DoubleLinkedListMethods;

public class DoubleLinkedList implements DoubleLinkedListMethods {

    Nodo origen;
    Nodo end;
    int length;

    @Override
    public void add(int posicion, Object info) {
        Nodo nuevo = new Nodo(info);
        if (posicion == 0) {
            this.addFirst(info);
        } else if (posicion == this.length) {
            this.addLast(info);
        } else if (posicion > 0 && posicion < this.length) {
            int count = 1;
            Nodo aux = this.iteratorFirst(); // Nodo anterior <- nuevo
            while (count != posicion) {
                aux = aux.siguiente();
                count++;
            }
            Nodo despues = aux.siguiente();
            aux.setSiguiente(nuevo);
            nuevo.setSiguiente(despues);
            nuevo.setAnterior(aux);
            despues.setAnterior(nuevo);
            this.length++;
        }
    }

    @Override
    public void addFirst(Object info) {
        Nodo nuevo = new Nodo(info);
        if (this.length == 0) {
            this.origen = nuevo;
            this.end = nuevo;
        } else {
            Nodo aux = this.iteratorFirst();
            aux.setAnterior(nuevo);
            nuevo.setSiguiente(aux);
            this.origen = nuevo;
        }
        this.length++;
    }

    @Override
    public void addLast(Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (this.length == 0) {
            this.origen = nuevo;
            this.end = nuevo;
        } else {
            Nodo aux = this.iteratorLast();
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            this.end = nuevo;
        }
        this.length++;
    }

    @Override
    public void remove(int posicion) {
        if (posicion == 0) {
            this.removeFirst();
        } else if (posicion == this.length - 1) {
            this.removeLast();
        } else if (posicion > 0 && posicion < this.length) {
            Nodo aux = this.iteratorFirst();
            int count = 0;
            while (count != posicion) {
                aux = aux.siguiente();
                count++;
            }//aux -> Nodo eliminar
            aux.anterior().setSiguiente(aux.siguiente());
            aux.siguiente().setAnterior(aux.anterior());
            aux = null;
            this.length--;
        }
    }

    @Override
    public void removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            Nodo aux = this.iteratorFirst();
            this.origen = aux.siguiente();
            aux.setSiguiente(null);
            aux = null;
            this.length--;
        }
    }

    @Override
    public void removeLast() {
        if (this.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            if (this.length == 1) {
                this.removeFirst();
            } else {
                Nodo aux = this.iteratorLast();
                this.end = aux.anterior();
                this.end.setSiguiente(null);
                aux = null;
                this.length--;
            }
        }
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.origen == null;
    }

    @Override
    public Nodo iteratorFirst() {
        return this.origen;
    }

    @Override
    public Nodo iteratorLast() {
        return this.end;
    }

    @Override
    public Nodo search(String buscar) {
        Nodo found = null;
        Nodo aux = this.iteratorFirst();
        do {
            if (aux.getInfo().toString().contains(buscar)) {
                found = aux;
                break;
            }
            aux = aux.siguiente();
        } while (aux != null);
        return found;
    }

    @Override
    public Nodo get(int posicion) {
        Nodo found = null;
        Nodo aux = this.iteratorFirst();
        int count = 0;
        do {
            if (posicion > -1 && posicion < this.length && count == posicion) {
                found = aux;
                break;
            }
            count++;
            aux = aux.siguiente();
        } while (aux != null);
        return found;
    }

    @Override
    public void set(int posicion, Object informacion) {
        Nodo nuevo = new Nodo(informacion);
        if (this.isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            if (posicion == 0) {
                Nodo aux = this.iteratorFirst();
                nuevo.setSiguiente(aux.siguiente());
                if (aux.siguiente() != null) {
                    aux.siguiente().setAnterior(nuevo);
                }
                this.origen = nuevo;
                aux.setSiguiente(null);
                aux = null;
            } else if (posicion > 0 && posicion < this.length) {
                Nodo aux = this.iteratorFirst();
                int count = 0;
                while (count != posicion) {
                    aux = aux.siguiente();
                    count++;
                }
                nuevo.setAnterior(aux.anterior());
                nuevo.setSiguiente(aux.siguiente());
                aux.anterior().setSiguiente(nuevo);
                if (aux.siguiente() != null) {
                    aux.siguiente().setAnterior(nuevo);
                }
                aux.setAnterior(null);
                aux.setSiguiente(null);
                aux = null;
            }
        }
    }

    @Override
    public void print() {
        if (!this.isEmpty()) {
            Nodo aux = this.origen;
            do {
                System.out.println("[" + aux.getInfo().toString() + ", " + aux + "]-->");
                aux = aux.siguiente();
            } while (aux != null);
        } else {
            System.out.println("La lista está vacía");
        }
    }

}
