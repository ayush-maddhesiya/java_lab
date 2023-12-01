// Base class (Parent class)
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

// Derived class 1 (Child class)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Derived class 2 (Child class)
class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying.");
    }
}

// Derived class 3 (Multilevel Inheritance)
class Sparrow extends Bird {
    void chirp() {
        System.out.println("Sparrow is chirping.");
    }
}

public class inheritanceAkm {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method from Animal class
        myDog.sleep(); // Inherited method from Animal class
        myDog.bark(); // Method specific to Dog class

        System.out.println();

        // Creating an object of Bird class
        Bird myBird = new Bird();
        myBird.eat(); // Inherited method from Animal class
        myBird.sleep(); // Inherited method from Animal class
        myBird.fly(); // Method specific to Bird class

        System.out.println();

        // Creating an object of Sparrow class (Multilevel Inheritance)
        Sparrow mySparrow = new Sparrow();
        mySparrow.eat(); // Inherited method from Animal class
        mySparrow.sleep(); // Inherited method from Animal class
        mySparrow.fly(); // Inherited method from Bird class
        mySparrow.chirp(); // Method specific to Sparrow class
    }
}
