import java.util.Queue;
import java.util.LinkedList;

/**
 * Created by sampathr on 16/12/16.
 */
public class BTTraversal {
    private Node1 rootNode;

    public static void main(String args[]) {
        new BTTraversal();
    }

    public BTTraversal() {
        addNode(rootNode, 45);
        addNode(rootNode, 25);
        addNode(rootNode, 75);
        addNode(rootNode, 15);
        addNode(rootNode, 35);
        System.out.println("Pre-Order Traversal: " );
        preOrderTraversal(rootNode);
        System.out.println("\nIn-Order Traversal: " );
        inOrderTraversal(rootNode);
        System.out.println("\nPost-Order Traversal: " );
        postOrderTraversal(rootNode);
        System.out.println("\nBreadth First Traversal/ Level Order Traversal: " );
        levelOrderTraversal(rootNode);
    }

    public void addNode(Node1 rootNode, int data) {
        if (rootNode == null) {
            Node1 temp1 = new Node1(data);
            this.rootNode = temp1;
        } else {
            addNodeInPlace(rootNode, data);
        }
    }

    public void addNodeInPlace(Node1 rootNode, int data) {
        if (data > rootNode.getData()) {
            if (rootNode.getRight() == null) {
                Node1 temp1 = new Node1(data);
                rootNode.setRight(temp1);
            } else {
                addNode(rootNode.getRight(), data);
            }
        } else if (data < rootNode.getData()) {
            if (rootNode.getLeft() == null) {
                Node1 temp1 = new Node1(data);
                rootNode.setLeft(temp1);
            } else {
                addNode(rootNode.getLeft(), data);
            }
        }
    }

    public void preOrderTraversal(Node1 rootNode){
        if(rootNode == null){
            return;
        }
        System.out.print(rootNode.getData() + " ");
        preOrderTraversal(rootNode.getLeft());
        preOrderTraversal(rootNode.getRight());
    }

    public void inOrderTraversal(Node1 rootNode){
        if(rootNode == null){
            return;
        }
        inOrderTraversal(rootNode.getLeft());
        System.out.print(rootNode.getData() + " ");
        inOrderTraversal(rootNode.getRight());
    }

    public void postOrderTraversal(Node1 rootNode){
        if(rootNode == null){
            return;
        }
        postOrderTraversal(rootNode.getLeft());
        postOrderTraversal(rootNode.getRight());
        System.out.print(rootNode.getData() + " ");
    }

    public void levelOrderTraversal(Node1 rootNode){

        if (rootNode == null)
            return;

        Queue<Node1> queue = new LinkedList<Node1>();
        queue.add(rootNode);

        while (! queue.isEmpty()){
            Node1 obj = queue.poll();
            System.out.print(obj.getData() + " ");
            if(obj.getLeft()!=null)
                queue.add(obj.getLeft());
            if (obj.getRight()!= null)
                queue.add(obj.getRight());
        }
    }
}

