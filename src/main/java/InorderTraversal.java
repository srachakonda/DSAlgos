import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sampathr on 22/12/16.
 */
public class InorderTraversal {
    private Node1 rootNode;

    public InorderTraversal() {
        addNode(rootNode, 45);
        addNode(rootNode, 25);
        addNode(rootNode, 75);
        addNode(rootNode, 15);
        addNode(rootNode, 35);
        System.out.println("\nIn-Order Traversal: ");
        inOrderTraversal(rootNode);
        System.out.println("\nIn-Order Traversal Check: ");
        inOrderTraversalNonRecursive(rootNode);

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

    public void inOrderTraversal(Node1 rootNode) {
        if (rootNode == null)
            return;
        inOrderTraversal(rootNode.getLeft());
        System.out.println(rootNode.getData() + " ");
        inOrderTraversal(rootNode.getRight());
    }

    public void inOrderTraversalNonRecursive(Node1 rootNode) {
//        ArrayList<Node1> node1 = new ArrayList<Node1>();
        if (rootNode == null)
            return;
        Stack s = new Stack();
        s.push(rootNode);
        while (!s.isEmpty()) {
            Node1 temp = (Node1) s.pop();
//            node1.add(temp);
            System.out.println(temp.getData() + " ");
            if (temp.getRight() != null) {
                s.push(temp.getRight());
            }
            if (temp.getLeft() != null)
                s.push(temp.getLeft());
//        Node1 tmp = s.pop();

        }
    }

    public static void main(String[] args) {
        new InorderTraversal();
    }
}
