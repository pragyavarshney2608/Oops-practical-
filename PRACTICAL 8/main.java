
class Product {
    String name;
    double price;
    int quantity;

    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product(String n) {
        name = n;
        price = 0;
        quantity = 0;
    }

    Product(String n, double p) {
        name = n;
        price = p;
        quantity = 1;
    }

    Product(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: Rs." + totalCost());
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Pen");
        Product p3 = new Product("Book", 100);
        Product p4 = new Product("Bag", 500, 2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Name Constructor:");
        p2.display();

        System.out.println("Name and Price Constructor:");
        p3.display();

        System.out.println("All Parameters Constructor:");
        p4.display();
    }
}

