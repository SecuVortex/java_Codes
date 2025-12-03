import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.length() + b.length());

        if (a.compareTo(b) > 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        a = a.substring(0,1).toUpperCase() + a.substring(1);
        b = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(a + " " + b);
    }
}