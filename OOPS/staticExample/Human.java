// Properties that are not directly related to the object are known as static variables. They are common to all the objects of the class

// Static variable - When a member is declared static it can be accessed before any of the object of the class is being created and without referencing to that object

// Both variables as well as methods/functions can be declared as static

// Static variables are not dependent on objects, They belong to the class and not to the objects

// Static method can access only static data and not non-static data

// Point to be noted -> We cannot have non-static method inside static method but we can have static method inside non-static method

package staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

//        Human.message();
    }

    static void message(){
        System.out.println("Hello Message");
//        System.out.println(this.age); // Can't use this over here
    }
}
