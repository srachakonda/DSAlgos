/**
 * Created by sampathr on 16/12/16.
 */
public class Node1 {
    private int data;
    private Node1 left;
    private Node1 right;

    public Node1(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node1 getLeft() {
        return left;
    }

    public void setLeft(Node1 left) {
        this.left = left;
    }

    public Node1 getRight() {
        return right;
    }

    public void setRight(Node1 right) {
        this.right = right;
    }
}
