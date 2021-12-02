package binarytree;

import binarytree.clases.BinaryTree;

public class Test {

    public static void main(String[] args) {
        // [55, 10, 15, 67, 102, 89, 4, 20, 48]
        BinaryTree tree = new BinaryTree();
        tree.add(55, "Naranja");
        tree.add(10, "Mandarina");
        tree.add(15, "Sandía");
        tree.add(67, "Manzana");
        tree.add(102, "Pera");
        tree.add(89, "Platano");
        tree.add(4, "Fresa");
        tree.add(20, "Guayaba");
        tree.add(48, "Nanche");
        tree.add(60, "Moraazul");
        tree.add(56, "Algo");
        System.out.println("\n-------------------------");
        tree.preOrder(tree.root());
        //tree.preOrder(tree.root());
        //tree.postOrder(tree.root());
        System.out.println("\n-------------------------");
        tree.remove(55);
        System.out.println("\n-------------------------");
        tree.preOrder(tree.root());
    }

}
