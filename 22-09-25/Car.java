import java.util.Scanner;

public class Car {
    private String brand;
    private String model;
    
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }
    
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model    );
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        
        Car car = new Car(brand, model);
        car.display();
        
        scanner.close();
    }
}