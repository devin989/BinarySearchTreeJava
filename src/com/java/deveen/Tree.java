package com.java.deveen;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null)
            return root.get(value);
        return null;
    }
    // deleting
    // case 1: delete node is a leaf node
    // case 2: delete node has a only 1 child
    // case 3: delete node has a 2 child

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {

        if (subtreeRoot == null)
            return subtreeRoot;//check null and return null

        if (value < subtreeRoot.getData())
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));

        else if (value > subtreeRoot.getData())
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));

        else {  // value = subtreeRoot.getData()
            //case 1 & 2

            if (subtreeRoot.getLeftChild() == null)
                return subtreeRoot.getRightChild();
            else if (subtreeRoot.getRightChild() == null)
                return subtreeRoot.getLeftChild();

            // case 3 : node with 2 children
            // replace value with smallest value from right sub tree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // delete the node smallest value from right sub tree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }


    public int min() {
        if (root == null)
            return Integer.MIN_VALUE;
        else
            return root.min();
    }

    public int max() {
        if (root == null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }

    public void inOrderTraverse() {
        if (root != null)
            root.inOrderTraverse();
    }
}
