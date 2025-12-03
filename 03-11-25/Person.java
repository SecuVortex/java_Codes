class Person {
    public void Role() {
        System.out.println("Person role.");
    }
}

class Father extends Person {
    @Override
    public void Role() {
        System.out.println("Father ");
    }
}

class Husband extends Person {
    @Override
    public void Role() {
        System.out.println("Husband ");
    }
}

class Employee extends Person {
    @Override
    public void Role() {
        System.out.println("Employewe");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Person person1 = new Father();
        Person person2 = new Husband();
        Person person3 = new Employee();

        person1.Role();
        person2.Role();
        person3.Role();
    }
}