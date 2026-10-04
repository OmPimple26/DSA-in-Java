// An interface in Java is a reference type that acts as a blueprint or contract for a class. It specifies what a class must do, but not how it does it, by grouping related method signatures without body definitions.

// Interfaces contains abstract functions. By default, the functions are public and abstract in the interface. By default, the variables are static and final in interfaces.

// Interfaces can only have abstract methods unlike abstract classes which can have both abstract methods as well as non-abstract methods

// Variables declared in the interfaces are by default final because final variables are always needed to be initialized with the help of constructor

// Abstract class can provide the implementation of interface but interface can't provide the implementation of abstract class

// Interfaces are implemented using 'implements' keyword and we can implement multiple inheritance through interfaces

// Interface can also extend another java interface

// Members of the java interface are public by default

// A class can implement more than one interfaces but on the other hand a class can inherit only single super class/abstract class

// In interfaces, we don't have instance variables. The variables are always final and static

// Two classes that are unrelated to each other can also implement the same interface

// We should be careful not to use interfaces casually in performance critical code since it decides which method to call at runtime

// Interfaces can also contain static and default methods


package interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//
//        car.start();
//        car.stop();
//        car.acc();
//        car.brake();


//        Engine car1 = new Car();
//        car1.a;                    // Cannot access this
//        car1.start();
//        car1.stop();
//        car1.acc();
//        car1.brake();              // Cannot access this


//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar car2 = new NiceCar();

        car2.start();
        car2.startMusic();
        car2.upgradeEngine();
        car2.start();
    }
}
