package model;

public class UserController {

    private User head;


    private User tail;


    public UserController() {
    }

    public void addFirst(User user) {
        // List is empty 
        if (this.head == null) {
            this.head = user;
            this.tail = user;
        // add to first position
        } else {
            user.setNext(this.head); 
            // updates the head 
            this.head = user;
        }
    }

    public void addLast(User user) {
        // List is empty 
        if (this.head == null) {
            this.head = user;
            this.tail = user;
        // add to last position
        } else {
            this.tail.setNext(user);
            this.tail = user;
        }
    }

    public String print( User current){
        String msg = "";
        if(head == null){
            msg = "Empty List";
        }else if(current.getNext() == null){
            msg += "" + current.getId();
        }else{
            msg += current.getId() + " " + print(current.getNext());
        }
        return msg;
    }

    public User getHead() {
        return head;
    }

    public User getTail() {
        return tail;
    }
    



}