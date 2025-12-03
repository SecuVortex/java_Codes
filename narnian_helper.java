import java.util.Scanner;
public class narnian_helper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        String alphabet = sc.next();
        if (alphabet.toLowerCase().equals("a") || alphabet.toLowerCase().equals("e") || 
            alphabet.toLowerCase().equals("i") || alphabet.toLowerCase().equals("o") || 
            alphabet.toLowerCase().equals("u")) {
            System.out.println("It's a vowel");
        } else if (alphabet.matches("[a-zA-Z]")) {
            System.out.println("It's a conosonant");
        } else {
            System.out.println("Invalid input");
        }
        sc.close();
    }
}