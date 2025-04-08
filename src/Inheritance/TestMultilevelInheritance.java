package Inheritance;

// Base class
class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("barking...");
    }
}

// Further derived class
class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }
}


public class TestMultilevelInheritance {
    public static void main(String[] args) {
        // Creating object of Animal class
        Animal a = new Animal();
        a.eat();

        // Creating object of Dog class
        Dog d = new Dog();
        d.bark();
        d.eat();  // Inherited from Animal

        // Creating object of BabyDog class
        BabyDog bd = new BabyDog();
        bd.weep();  // From BabyDog
        bd.bark();  // Inherited from Dog
        bd.eat();   // Inherited from Animal
    }
}
