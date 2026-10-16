
class Vehicle {
    void showVehicle() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void showCar() {
        System.out.println("This is a car");
    }
}

class Person {
    void showPerson() {
        System.out.println("Person class");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("Employee class");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("Manager class");
    }
}

class Shape {
    void showShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void showCircle() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    void showRectangle() {
        System.out.println("This is a rectangle");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.showVehicle();
        c.showCar();

        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        Circle ci = new Circle();
        ci.showShape();
        ci.showCircle();

        Rectangle r = new Rectangle();
        r.showShape();
        r.showRectangle();
    }
}

