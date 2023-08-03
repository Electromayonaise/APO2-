package FollowUpPractice.FollowUp1PracRecursion;

// There is a backpack with a capacity of 500g, your objective is to fill the backpack to it's exact capacity
// You have the following items: a. Lunch box - 250g b. Computer - 200g c. Notebook -100g d. Apple 50g e. Pencil 25g 
// f. pen 25g g. Pencil sharpener 25g h. Eraser 25g. Analize in what way a recursive algorithm can help you solve this problem.
public class BackpackCapacity {
    
    public static boolean fillBackpack(int[] objects, int capacity, int index) {
        
        if (capacity == 500) {
            return true;
        }

        if (index == objects.length) {
            return false;
        }

        // Take the current object if it doesn't exceed the weight limit
        if (capacity + objects[index] <= 500) {
            if (fillBackpack(objects, capacity + objects[index], index + 1)) {
                return true;
            }
        }

        // Don't take the current object
        if (fillBackpack(objects, capacity, index + 1)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] objects = { 250, 200, 100, 50, 25, 25, 25, 25 };
        boolean result = fillBackpack(objects, 0, 0);

        if (result) {
            System.out.println("The backpack can be filled with exactly 500g.");
        } else {
            System.out.println("There is no combination of objects that fill the backpack with exactly 500g.");
        }
    }

}
