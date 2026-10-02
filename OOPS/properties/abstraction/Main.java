// Abstraction means hiding the unnecessary details and showing only the valuable information

// Abstraction focuses on the external stuff while encapsulation focuses on the internal working

// Abstraction deals with design level stuff while encapsulation deal with implementation level stuff

// Abstraction is the process of gaining information while encapsulation is the process of containing the information

// Abstract methods don't have implementation provided in the parent class hence the child class must override them and write their own implementation in their respective classes
// Example of abstract method -
// abstract void career (String name);

// Any class that contains one or more abstract methods must also be declared as abstract



//package properties.abstraction;
//
//public class Main {
//    public static void main(String[] args) {
//
//    }
//}



package properties.abstraction;

public abstract class Main {
    abstract void career (String name);

    public static void main(String[] args) {

    }
}
