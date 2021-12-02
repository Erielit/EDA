package binarytree.clases;

import binarytree.interfaces.BinaryTreeMethods;

public class BinaryTree implements BinaryTreeMethods {

    Node root;

    @Override
    public void add(int key, Object value) {
        if (this.isEmpty()) {
            this.root = new Node(key, value);
        } else {
            this.root.add(key, value);
        }
    }

    @Override
    public void remove(int key) {
        this.remove(this.root, key);
    }

    public Node remove(Node current, int key) {
        if (current == null) {
            return null;
        }
        if (key == current.getKey()) {
            //Primer caso, no tiene nodos hijos (Node -> Nodo Hoja)
            if (current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            //Segundo caso, tiene un solo hijo (L o R)
            if (current.getRight() == null) {
                return current.getLeft();
            }
            if (current.getLeft() == null) {
                return current.getRight();
            }
            //Tercer caso, tiene dos hijos
            int smallest = findSmallest(current.getRight());
            current.setKey(smallest);
            current.setRight(remove(current.getRight(), smallest));
            return current;
        }
        if (key < current.getKey()) {
            current.setLeft(remove(current.getLeft(), key));
            return current;
        }
        current.setRight(remove(current.getRight(), key));
        return current;
    }

    public int findSmallest(Node current) {
        return current.getLeft() == null
                ? current.getKey()
                : findSmallest(current.getLeft());
    }

    @Override
    public boolean isEmpty() {
        return this.root == null;
    }

    @Override
    public Node root() {
        return this.root;
    }

    @Override
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print("[" + root.key + "," + root.data + "]-->");
            inOrder(root.right);
        }
    }

    @Override
    public void preOrder(Node root) {
        if (root != null) {
            System.out.print("[" + root.key + "," + root.data + "]-->");
            inOrder(root.left);
            inOrder(root.right);
        }
    }

    @Override
    public void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print("[" + root.key + "," + root.data + "]-->");

        }
    }
}
