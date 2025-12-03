class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    String name;
    int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public void buyProduct(int quantity) throws OutOStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Sorry, not enough stock! You asked for " + quantity + " but we only have " + stock + ".");
        } else {
            stock = stock - quantity;
            System.out.println("Order done! You bought " + quantity + " " + name + ". Stock left: " + stock);
        }
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 10);
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("How many " + product.name + " do you want to buy? ");
        int quantity = scanner.nextInt();
        
        try {
            product.buyProduct(quantity);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
}
