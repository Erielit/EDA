package pilas;

import pilas.clases.Stack;

public class Test {

    public static void main(String... args) {
        Stack pila = new Stack();
        pila.push("Mike");
        pila.push("Angel");
        pila.push("Moreno");
        pila.print();
        System.out.println("");
        Object info = pila.pop();
        if (info != null) {
            System.out.println(info.toString());
        }
        Object info2 = pila.search("asdasd");
        if (info2 != null) {
            System.out.println(info2.toString());
        } else {
            System.out.println("Nombre no econtrado");
        }
        System.out.println("");
        System.out.println("Tamaño:" + pila.size());
        System.out.println("Vacía:" + pila.isEmpty());
        System.out.println("Cima:" + pila.peek());
        pila.print();
    }

}
