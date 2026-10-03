// Abstraction means hiding the unnecessary details and showing only the valuable information

// Abstraction focuses on the external stuff while encapsulation focuses on the internal working

// Abstraction deals with design level stuff while encapsulation deal with implementation level stuff

// Abstraction is the process of gaining information while encapsulation is the process of containing the information

// Abstract methods don't have implementation provided in the parent class hence the child class must override them and write their own implementation in their respective classes
// Example of abstract method -
// abstract void career (String name);

// Any class that contains one or more abstract methods must also be declared as abstract

// You can't create objects of an abstract class

// You can't create abstract constructors

// Static methods cannot be overridden. Hence, we can't create abstract static methods

// But we can create static methods in abstract classes

// Abstract classes can contain normal methods too

// We can't have abstract class to be as final because we want abstract class to be inherited

// But abstract classes still does not solve the problem of multiple inheritance

// From Java 8, it can also contain default methods

// Variables declared in the abstract classes can be both final and non-final

// Abstract class can provide the implementation of interface but interface can't provide the implementation of abstract class

// Abstract class can extend only one java class it cannot perform multiple inheritance

// Members of the java abstract class can be of any type For.eg. public, private, protected, default

// A class can implement more than one interfaces but on the other hand a class can inherit only single super class / abstract class


package abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(28);
        daughter.career();

//        Parent mom = new Parent(45);

        Parent girl = new Daughter(26);
        girl.career();

        Parent.hello();
    }
}
