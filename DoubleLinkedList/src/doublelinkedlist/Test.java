package doublelinkedlist;

import java.util.Scanner;
import doublelinkedlist.clases.Auto;
import doublelinkedlist.clases.DoubleLinkedList;
import doublelinkedlist.clases.Nodo;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Auto auto = null;
        DoubleLinkedList list = new DoubleLinkedList();
        int opcion = 0, modelo, indice;
        String marca = "";
        Nodo found = null;
        do {
            System.out.println("");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar con posición");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Lista vacía");
            System.out.println("6. Tamaño de la lista");
            System.out.println("7. Eliminar inicio");
            System.out.println("8. Eliminar final");
            System.out.println("9. Eliminar con posición");
            System.out.println("10. Buscar");
            System.out.println("11. Obtener con posición");
            System.out.println("12. Remplazar con posición");
            System.out.println("13. Salir");
            System.out.println("Seleccionar...");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar al inicio");
                    System.out.println("Ingrese marca del auto");
                    marca = sc.next();
                    System.out.println("Ingrese modelo del auto");
                    modelo = sc.nextInt();
                    auto = new Auto(marca, modelo);
                    list.addFirst(auto);
                    break;
                case 2:
                    System.out.println("Agregar al inicio");
                    System.out.println("Ingrese marca del auto");
                    marca = sc.next();
                    System.out.println("Ingrese modelo del auto");
                    modelo = sc.nextInt();
                    auto = new Auto(marca, modelo);
                    list.addLast(auto);
                    break;
                case 3:
                    System.out.println("Agregar al inicio");
                    System.out.println("Ingrese marca del auto");
                    marca = sc.next();
                    System.out.println("Ingrese modelo del auto");
                    modelo = sc.nextInt();
                    auto = new Auto(marca, modelo);
                    System.out.println("Ingrese un índice");
                    indice = sc.nextInt();
                    list.add(indice, auto);
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    System.out.println("Vacía: " + list.isEmpty());
                    break;
                case 6:
                    System.out.println("Tamaño: " + list.size());
                    break;
                case 7:
                    System.out.println("Eliminar al inicio");
                    list.removeFirst();
                    break;
                case 8:
                    System.out.println("Eliminar al final");
                    list.removeLast();
                    break;
                case 9:
                    System.out.println("Eliminar con posición");
                    System.out.println("Ingrese un índice");
                    indice = sc.nextInt();
                    list.remove(indice);
                    break;
                case 10:
                    System.out.println("Buscar...");
                    System.out.println("Ingrese marca");
                    marca = sc.next();
                    found = list.search(marca);
                    if (found == null) {
                        System.out.println("Auto no encontrado");
                    } else {
                        System.out.println("Marca: " + ((Auto) found.getInfo()).getMarca());// <--
                        System.out.println("Modelo: " + ((Auto) found.getInfo()).getModelo());// <--
                    }
                    break;
                case 11:
                    System.out.println("Obtener");
                    System.out.println("Ingrese un índice");
                    indice = sc.nextInt();
                    found = list.get(indice);
                    if (found == null) {
                        System.out.println("Auto no encontrado");
                    } else {
                        System.out.println("Marca: " + ((Auto) found.getInfo()).getMarca());// <--
                        System.out.println("Modelo: " + ((Auto) found.getInfo()).getModelo());// <--
                    }
                    break;
                case 12:
                    System.out.println("Remplazar");
                    System.out.println("Agregar al inicio");
                    System.out.println("Ingrese marca del auto");
                    marca = sc.next();
                    System.out.println("Ingrese modelo del auto");
                    modelo = sc.nextInt();
                    auto = new Auto(marca, modelo);
                    System.out.println("Ingrese un índice");
                    indice = sc.nextInt();
                    list.set(indice, auto);
                    break;
                default:
                    System.out.println("Error!");
            }
        } while (opcion != 13);

    }
}
