package com.java.deveen;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(10);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(22);
        tree.insert(32);

//        tree.inOrderTraverse();
//        System.out.println(tree.get(10));
        System.out.println(tree.min());
    }
}
