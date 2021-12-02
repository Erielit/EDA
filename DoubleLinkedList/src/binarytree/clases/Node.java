package binarytree.clases;

public class Node {

    int key;
    Object data;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int key, Object data) {
        this.key = key;
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void add(int key, Object data) {
        if (key < this.key) {
            if (this.left == null) {
                this.left = new Node(key, data);
            } else {
                this.left.add(key, data);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(key, data);
            } else {
                this.right.add(key, data);
            }
        }
    }

}
