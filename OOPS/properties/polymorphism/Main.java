// Polymorphism:
// Poly -> Many
// Morphism -> Ways of representation

// It is an act of representing the same thing in multiple ways

package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        Shapes circle1 = new Circle();
        Shapes square1 = new Square();

        shape.area();
        circle.area();
        square.area();

        circle1.area();
        square1.area();
    }
}
