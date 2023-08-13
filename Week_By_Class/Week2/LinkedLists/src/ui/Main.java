// En listas no doblemente enlasadas, el nodo solo conoce al siguiente nodo y no al anterior

package ui;

import model.*;

public class Main {


    
    public static void main(String[] args){

        UserController userController = new UserController();

        User user1 = new User("1");

        userController.addFirst(user1);

        System.out.println(userController.getHead().getId());

        User user2 = new User("2");

        userController.addFirst(user2);

        System.out.println(userController.getHead().getId());
    }
}