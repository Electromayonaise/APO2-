package model;

public class Node {

    private Node left;

    private Node right;

    private Integer key;

    public Node (Integer key) {
        this.key = key;
    }

    public Node getLeft () {
        return left;
    }

    public void setLeft (Node left) {
        this.left = left;
    }

    public Node getRight () {
        return right;
    }

    public void setRight (Node right) {
        this.right = right;
    }

    public Integer getKey () {
        return key;
    }

    public void setKey (Integer key) {
        this.key = key;
    }
    
    @Override
    public String toString(){
        return key + "";
    } 
    
}
