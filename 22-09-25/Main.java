import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if(value == 6 || value == 10) {
            System.out.println("Even");
        } else if(value == 3 || value == 7) {
            System.out.println("Not Even");
        } else {
            System.out.println("Unknown");
        }
    }
}