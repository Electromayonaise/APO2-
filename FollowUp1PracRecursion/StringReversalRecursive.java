package FollowUpPractice.FollowUp1PracRecursion;

// Create a method called reverse that recieves a string and returns the string in reverse order, the method must return a string.
public class StringReversalRecursive {

    public static String reverse(String str, int index) {
        if (index == str.length() - 1) {
            return str.charAt(index) + "";
        }
        return reverse(str, index + 1) + str.charAt(index);
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("The reverse is: " + (reverse(str, 0)));
    }

}
