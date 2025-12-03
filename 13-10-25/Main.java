@FunctionalInterface
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Greeting greet = () -> { System.out.println("Hello ji"); };
        greet.sayHello();
    }
}
