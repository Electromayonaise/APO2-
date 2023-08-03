package FollowUpPractice.FollowUp1PracRecursion;

// Create from the past array sum method a new prom method that allows you to calculate the avarage of the array\
//, the method must return a double.

public class ArrayAvarage {
    
    public static double avarage(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + avarage(arr, index + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 5};
        System.out.println("The avarage is: " + (avarage(arr, 0) / arr.length));
    }
}