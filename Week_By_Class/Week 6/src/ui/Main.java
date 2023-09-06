package ui;

import model.CircularLinkedList;
import model.Node;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CircularLinkedList circular = new CircularLinkedList();

        circular.addNode(new Node("0"));
        circular.addNode(new Node("1"));
        circular.addNode(new Node("2"));
        circular.addNode(new Node("3"));
        circular.addNode(new Node("4"));
        circular.addNode(new Node("5"));

        circular.delete("10");

        System.out.println("this line has been executed after the exception");
    }

    public void readLine(){
        try{
            String line = sc.nextLine();
            System.out.println(line);
        } catch(InputMismatchException ime){
            System.out.println("You must type a number");
            ime.printStackTrace(); // print the stack trace, the error message and the line where the error was thrown
        }
    }

    /*
     * Difference between runtime and own exceptions: 
     * 1. Runtime exceptions are not checked by the compiler, so you don't have to use the throws keyword
     * 2. Runtime exceptions are not meant to be handled, they are meant to be avoided
     * 3. Runtime exceptions are meant to be thrown when the user does something wrong
     * 4. Own exceptions need a class that extends Exception
     */

    /*
     * Difference between exceptions that extend Exception and those that extend RuntimeException:
     * 1. Exceptions that extend Exception are checked by the compiler, so you have to use the throws keyword
     * 2. Exceptions that extend Exception are meant to be handled
     * 3. Exceptions that extend Exception are meant to be thrown when the programmer does something wrong
     * 4. Exceptions that extend RuntimeException are not checked by the compiler, so you don't have to use the throws keyword
     * 5. Exceptions that extend RuntimeException are not meant to be handled, they are meant to be avoided
     * 6. Exceptions that extend RuntimeException are meant to be thrown when the user does something wrong
     */

    public void div(){
        try{
            System.out.println("Type the first number");
            int num1 = sc.nextInt();
            System.out.println("Type the second number");
            int num2 = sc.nextInt();
            int result = num1/num2;
            System.out.println("The result is: " + result);
        } catch(InputMismatchException ime){
            System.out.println("You must type a number");
            ime.printStackTrace(); // print the stack trace, the error message and the line where the error was thrown
        } catch(ArithmeticException ae){
            System.out.println("You can't divide by zero");
        }
        /* The form can also be 
            * catch(InputMismatchException | ArithmeticException e){
                if (e instanceof InputMismatchException){
                    System.out.println("You must type a number");
                } else {
                    System.out.println("You can't divide by zero");
                }
                e.printStackTrace();
         * 
         */

    }


}
