package ui;

import model.BST;

public class Tree {
    
    private BST tree;

    public Tree() {
        tree = new BST();
    }

    public static void main(String[]args){
        Tree m = new Tree();
        /*m.tree.add(50);
        m.tree.add(30);
        m.tree.add(70);
        m.tree.add(60);
        m.tree.add(80);
        m.tree.add(20);
        m.tree.add(10); */
        Integer[] array ={0,1,2,3,4,5,6,7,8,9,10,11,12};
        m.tree.addInGroup(array);
        System.out.println(m.tree.inOrder());
    }

     public void add(Integer key) {
        tree.add(key);
    }
}
