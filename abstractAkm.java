// Abstract class
abstract class Shape {
    // Abstract method (to be implemented by derived classes)
    abstract void draw();

    // Concrete method (common for all derived classes)
    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Derived class 1
class Circle extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2
class Square extends Shape {
    // Implementing the abstract method
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class abstractAkm {
    public static void main(String[] args) {
        // Creating objects of derived classes
        Shape circle = new Circle();
        Shape square = new Square();

        // Calling abstract method (polymorphism)
        circle.draw(); // Calls the draw method of Circle class
        square.draw(); // Calls the draw method of Square class

        // Calling concrete method
        circle.displayInfo(); // Calls the displayInfo method of Shape class
        square.displayInfo(); // Calls the displayInfo method of Shape class
    }
}
