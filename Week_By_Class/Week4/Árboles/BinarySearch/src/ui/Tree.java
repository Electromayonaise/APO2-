package ui;

import model.BST;

public class Tree {
    
    private BST tree;

    public Tree() {
        tree = new BST();
    }

    public static void main(String[]args){
        Tree m = new Tree();
        m.tree.add("50");
        m.tree.add("30");
        m.tree.add("70");
        m.tree.add("60");
        m.tree.add("80");
        m.tree.add("20");
        m.tree.add("10");

        System.out.println(m.tree.inOrder());
    }

     public void add(String key) {
        tree.add(key);
    }
}
