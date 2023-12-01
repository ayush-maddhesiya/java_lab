// Interface
interface Shape {
    void draw();
}

// Class implementing the interface
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Another class implementing the interface
class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class interfaceAkm {
    public static void main(String[] args) {
        // Creating objects of classes implementing the interface
        Shape circle = new Circle();
        Shape square = new Square();

        // Calling the draw method through the interface reference
        circle.draw(); // Draws a circle
        square.draw(); // Draws a square
    }
}
