
class Demo {
    Demo() {
        System.out.println("Object is created.");
    }

    void use() {
        System.out.println("Object is being used.");
    }
}

public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.use();

        d = null;

        System.out.println("Reference removed.");
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}

