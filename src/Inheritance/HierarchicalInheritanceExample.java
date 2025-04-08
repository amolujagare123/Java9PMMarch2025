package Inheritance;

// Base class
class Bird {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

// First subclass
class Sparrow extends Bird {
    void sparrowColor() {
        System.out.println("Sparrow is brown.");
    }
}

// Second subclass
class Crow extends Bird {
    void crowColor() {
        System.out.println("Crow is black.");
    }
}

// Main class to run the program
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        // Bird object
        Bird b = new Bird();
        b.fly();

        // Sparrow object
        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();  // Inherited from Bird

        // Crow object
        Crow c = new Crow();
        c.crowColor();
        c.fly();  // Inherited from Bird
    }
}

