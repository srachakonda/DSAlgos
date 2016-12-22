/**
 * Created by sampathr on 22/12/16.
 */

class AVLNode {
    int key;
    AVLNode left;
    AVLNode right;
    int height;

    AVLNode(int value) {
        key = value;
        left = null;
        right = null;
        height = 1;
    }
}

class AVLTree1 {
    AVLNode root;

    int height(AVLNode root) {
        if (root == null)
            return 0;

        return root.height;
    }

    int findHeight() {
        return height(root);
    }

    int findHeightFrom(int value) {
        AVLNode node = search(root, value);
        if (node == null)
            return -1;

        return node.height;
    }

    AVLNode search(AVLNode root, int value) {
        if (root == null)
            return null;
        else {
            if (value == root.key)
                return root;
            else if (value < root.key)
                return search(root.left, value);
            else
                return search(root.right, value);
        }
    }

    boolean find(int value) {
        AVLNode node = search(root, value);

        if (node == null)
            return false;

        return true;
    }

    int max(int one, int two) {
        return (one > two) ? one : two;
    }

    AVLNode rightRotate(AVLNode root) {
        AVLNode rootLeftChild = root.left;
        root.left = rootLeftChild.right;
        rootLeftChild.right = root;

        root.height = max(height(root.left), height(root.right)) + 1;
        rootLeftChild.height = max(height(rootLeftChild.left), height(rootLeftChild.right)) + 1;

        return rootLeftChild;
    }

    AVLNode leftRotate(AVLNode root) {
        AVLNode rootRightChild = root.right;
        root.right = rootRightChild.left;
        rootRightChild.left = root;

        root.height = max(height(root.left), height(root.right)) + 1;
        rootRightChild.height = max(height(rootRightChild.left), height(rootRightChild.right)) + 1;

        return rootRightChild;
    }

    AVLNode insertNode(AVLNode root, int value) {
        if (root == null)
            root = new AVLNode(value);
        else {
            if (value < root.key)
                root.left = insertNode(root.left, value);
            else
                root.right = insertNode(root.right, value);
        }

        root.height = max(height(root.left), height(root.right)) + 1;

        int balanceFactor = height(root.left) - height(root.right);

        if (balanceFactor > 1) {
            // either left-left case or left-right case
            if (value < root.left.key) {
                // left-left case
                root = rightRotate(root);
            } else {
                // left-right case
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }
        } else if (balanceFactor < -1) {
            // either right-right case or right-left case
            if (value > root.right.key) {
                // right-right case
                root = leftRotate(root);
            } else {
                // right-left case
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        }

        return root;
    }

    void insert(int value) {
        root = insertNode(root, value);
    }

    void inorder(AVLNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    void inorderTraversal() {
        inorder(root);
        System.out.println();
    }

    void preorder(AVLNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void preorderTraversal() {
        preorder(root);
        System.out.println();
    }
}

public class AVLTreeExample {
    public static void main(String[] args) {
        AVLTree1 avl = new AVLTree1();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(25);

        System.out.print("Inorder Traversal : ");
        avl.inorderTraversal();
        System.out.print("Preorder Traversal : ");
        avl.preorderTraversal();
        System.out.println("Searching for 10 : " + avl.find(10));
        System.out.println("Searching for 11 : " + avl.find(11));
        System.out.println("Searching for 20 : " + avl.find(20));
        System.out.println("Height of the tree : " + avl.findHeight());
        System.out.println("Finding height from 10 : " + avl.findHeightFrom(10));
        System.out.println("Finding height from 20 : " + avl.findHeightFrom(20));
        System.out.println("Finding height from 25 : " + avl.findHeightFrom(25));
    }
}