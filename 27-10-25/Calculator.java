import java.util.Scanner;

public class Calculator<T extends Number> {
    public final double calculate(T... numbers) {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator<Double> calc = new Calculator<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers separated by space:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        Double[] nums = new Double[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Double.parseDouble(parts[i]);
        }
        double result = calc.calculate(nums);
        System.out.println("Sum: " + result);
    }
}
