
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        int a = s.nextInt();
        if (a <= 0) {
            System.out.println("Too Cold for outdoor");
        } else {
            System.out.println("Safe for outdoor");
        }
        s.close();
    }
}