package Kalamanchi.LinkedLists.Trees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by sampathr on 3/8/17.
 */
public class PreOrderTraversal {

    public static ArrayList<Integer> preOrderTraversal(BinaryNode root) {
        Stack<BinaryNode> stack = new Stack<BinaryNode>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryNode tmp = stack.pop();
            result.add(tmp.data);
            if (tmp.right != null)
                stack.push(tmp.right);
            else if (tmp.left != null) {
                stack.push(tmp.left);
            }
        }
        return result;
    }


    public static void preOrderRecursion(BinaryNode root) {
        if (root != null) {
            System.out.print(root.data);
            System.out.print(" ");
            preOrderRecursion(root.left);
            preOrderRecursion(root.right);
        }
    }

    public static void main(String args[]) {
        preOrderTraversal(null);
        preOrderRecursion(null);
    }

}
