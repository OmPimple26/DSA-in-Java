// Clone is a method in the Object class used to make the exact copy of an object

// In Java, object cloning is the process of creating an exact copy of an existing object

// The java.lang.Object class provides a clone() method for this purpose


// 1. Shallow Copy (Default Cloning) ->

// When you invoke super.clone(), Java allocates space for a new object and copies the field values

// Primitive fields (like int, double) are copied by value

// Reference fields (like arrays or custom objects) are copied by reference. This means the original and the cloned object will point to the exact same inner object in memory


// 2. Deep Copy ->

// To make the cloned object completely isolated, you must override the clone() method to manually instantiate copies of all inner mutable reference objects


package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human om = new Human(22, "Om Pimple");
        // Human twin = new Human(om);

        Human twin = (Human)om.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(om.arr));
    }
}
