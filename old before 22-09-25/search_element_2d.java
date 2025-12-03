import java.util.Scanner;

public class search_element_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Element found at row " + i + ", column " + j);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
