package model;

public class Node {

    // implementation of double linked list

    private Node next;
    private Node previous;
    private int data;


    public Node(int data){
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious(){
        return previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data){
        this.data = data;
    }
    
}
