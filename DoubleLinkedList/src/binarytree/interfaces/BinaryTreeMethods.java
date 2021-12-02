package binarytree.interfaces;

import binarytree.clases.Node;

public interface BinaryTreeMethods {
    public void add(int key, Object value);
    public void remove(int key);
    public boolean isEmpty();
    public Node root();
    public void inOrder(Node root);
    public void preOrder(Node root);
    public void postOrder(Node root);
}
