package Kalamanchi.LinkedLists.Trees;

/**
 * Created by sampathr on 3/8/17.
 */
public class BinaryNode {
    public int data;
    public BinaryNode left;
    public BinaryNode right;

    public BinaryNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
