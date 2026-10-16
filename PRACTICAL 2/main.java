
class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Single Inheritance
class Car extends Vehicle {
    void showCar() {
        System.out.println("Car Brand: " + brand);
    }
}

// Multilevel Inheritance
class Person {
    String name = "Rahul";
}

class Employee extends Person {
    int id = 101;
}

class Manager extends Employee {
    void showManager() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: Manager");
    }
}

// Hierarchical Inheritance
class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle: " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle: " + (4 * 6));
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Car c = new Car();
        c.showCar();
        c.start();

        System.out.println("\nMultilevel Inheritance:");
        Manager m = new Manager();
        m.showManager();

        System.out.println("\nHierarchical Inheritance:");
        Circle cir = new Circle();
        cir.display();
        cir.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}
