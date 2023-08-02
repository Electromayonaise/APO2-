package FollowUpPractice.FollowUp1PracRecursion;

// Given a entry array and a number, return the position of the number in the array. If there 
// is more than one coincidence, return the first one. If there is no coincidence, return -1.
public class ArrayElementPos {
    
    public static int elementPos(int[] arr, int num, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == num) {
            return index;
        }
        return elementPos(arr, num, index + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 15, 8, 19, 21, 40, -4, 10};
        System.out.println("The position is: " + (elementPos(arr, 19, 0)));
    }
}
