// For 'class to interface' we use 'implements' keyword while for 'interface to interface' we use 'extends' keyword

// Default methods are a feature introduced in Java 8 that allow you to add non-abstract methods with a predefined body inside an interface. You declare them by using the default keyword.

// Prior to Java 8, interfaces could only contain abstract methods (signatures without a body). This created a major issue: if you wanted to add a new method to an existing public interface, every single class implementing that interface would break until they provided an implementation for the new method.

// Default methods solve this by providing backward compatibility. They allow Java libraries to evolve and introduce new capabilities—like the forEach method added to the Collection interface—without breaking legacy code.

// The access modifiers for the overridden methods should be same or better than the parent methods

// Interfaces can also contain static and default methods


package interfaces.extendDemo2;

public class Main implements A,B{
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();

        Car myCar = new Car();
        myCar.clean();        // Output: Car is being washed.
        myCar.startEngine();  // Output: Engine started. Ready to go!
    }
}
