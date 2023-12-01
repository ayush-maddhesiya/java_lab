// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class 1 (Method Overriding)
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class 2 (Method Overloading)
class Square extends Shape {
    // Method Overloading
    void draw(String color) {
        System.out.println("Drawing a square with color: " + color);
    }
}

// Another class for demonstrating Compile-time Polymorphism
class Calculator {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    // Method Overloading
    double add(double a, double b) {
        return a + b;
    }
}

public class polymorphismAkm {
    public static void main(String[] args) {
        // 1. Runtime Polymorphism (Method Overriding)
        Shape shape = new Circle();
        shape.draw(); // Calls the draw method of Circle class

        System.out.println();

        // 2. Compile-time Polymorphism (Method Overloading)
        Square square = new Square();
        square.draw(); // Calls the draw method of Square class without color
        square.draw("Red"); // Calls the draw method of Square class with color

        System.out.println();

        // 3. Compile-time Polymorphism (Method Overloading)
        Calculator calculator = new Calculator();
        System.out.println("Sum of integers: " + calculator.add(5, 7));
        System.out.println("Sum of doubles: " + calculator.add(3.5, 2.5));
    }
}
