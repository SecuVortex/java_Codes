import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title, String author, double price) {
        if (title == null || author == null || price <= 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price + " only🥲");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        double price = scanner.nextDouble();
        
        Book book = new Book(title, author, price);
        book.displayDetails();
        
        scanner.close();
    }
}