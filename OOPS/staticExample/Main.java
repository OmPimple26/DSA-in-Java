// Properties that are not directly related to the object are known as static variables. They are common to all the objects of the class

// Static variable - When a member is declared static it can be accessed before any of the object of the class is being created and without referencing to that object

// Both variables as well as methods/functions can be declared as static

// Static variables are not dependent on objects, They belong to the class and not to the objects

// Static method can access only static data and not non-static data

// Point to be noted -> We cannot have non-static method inside static method but we can have static method inside non-static method

package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human om = new Human(22, "Om Pimple", 20000, false);
//        Human anushka = new Human(21, "Anushka", 15000, true);
//        Human vaidehi = new Human(23, "Vaidehi", 22000, false);

//        System.out.println(om.name);

//        System.out.println(om.population);
//        System.out.println(anushka.population);
//        System.out.println(vaidehi.population);

//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

//        greeting();

//        fun();

        Main funn = new Main();
        funn.fun2();
    }

    // This is not dependent on objects
    static void fun(){
//        greeting(); // You can't use this because it requires an instance but the function you are using it in does not depend on instances

        // You cannot access non static stuff without referencing their instances in a static context
        // Hence here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    // We know that something which is not static, belongs to an object
    void greeting(){
//        fun();
        System.out.println("Hello World");
    }
}
