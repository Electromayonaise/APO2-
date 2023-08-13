package model;

public class User {

    private String id;
    private User next;

    public String getId() {
        return id;
    }

    public User(String id) {
        this.id = id;
    }


    @Override
    
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                '}';
    }

    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }

}