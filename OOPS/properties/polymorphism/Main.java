// Polymorphism:
// Poly -> Many
// Morphism -> Ways of representation

// It is an act of representing the same thing in multiple ways

// Types of Polymorphism:
// 1) Compile Time / Static Polymorphism ->
// Achieved via method overloading

// Method overloading -> When a class has multiple methods with the same name but the number and types, arguments, return types, ordering can be different
// For e.g. Multiple Constructors
// A a = new A();
// A a2 = new A(3,4);

// Java decides which constructor or method to call at compile time hence it is knoen as compile time polymorphism

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
