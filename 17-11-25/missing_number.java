

// find missing numbers from a range given number from 1 to 10 with some missing  number using hashset 
// accept a paragraph and  display all unique word

import java.util.HashSet;

public class missing_number {
    public static void main(String[] args) {
        int[] givenNumbers = {1, 2, 4, 6, 7, 9};
        HashSet<Integer> numberSet = new HashSet<>();
        for (int num : givenNumbers) {
            numberSet.add(num);
        }
        System.out.println("Missing numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (!numberSet.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
