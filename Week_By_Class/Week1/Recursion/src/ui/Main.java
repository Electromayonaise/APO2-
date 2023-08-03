package ui;

import model.Recursion;

public class Main {
    public static void main(String[] args) {

            Recursion recursion = new Recursion();

            System.out.println("Factorial : " + recursion.factorial(5));

            System.out.println("Fibonacci : " + recursion.fibonacci(14));
    }

}


