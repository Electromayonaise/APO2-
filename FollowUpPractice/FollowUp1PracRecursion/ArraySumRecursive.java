
package FollowUpPractice.FollowUp1PracRecursion;

// Create a method called sum that recieves an arrey of ints and returns the sum of the elements in the array, the method must return an int.
public class ArraySumRecursive {
    
    public static int sum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + sum(arr, index + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 5};
        System.out.println("The sum is: " + (sum(arr, 0)));
    }
}
