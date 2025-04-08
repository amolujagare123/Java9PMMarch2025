package Inheritance;

// Base class
class Animal2 {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// First level subclass
class Mammal extends Animal2 {
    void walk() {
        System.out.println("Mammal is walking...");
    }
}

// Another subclass of Animal
class Reptile extends Animal2 {
    void crawl() {
        System.out.println("Reptile is crawling...");
    }
}

// Subclass of Mammal
class Tiger extends Mammal {
    void roar() {
        System.out.println("Tiger is roaring...");
    }
}

// Main class to test the inheritance
public class HybridInheritanceExample {
    public static void main(String[] args) {
        // Tiger has access to methods from Tiger, Mammal, and Animal
        Tiger t = new Tiger();
        t.roar();
        t.walk();   // From Mammal
        t.eat();    // From Animal

        // Reptile has access to its own method and from Animal
        Reptile r = new Reptile();
        r.crawl();
        r.eat();
    }
}
