// Class is a named group of properties and functions
// If we have to create our own datatype, then we create it using classes

// Class is a blueprint for creating an object / Class is a template of an object
// Object is an instance of a class

// Class = Logical Construct
// Object = Physical Reality (Occupies space in memory)

// Properties of an object-
// i) State - Value from its datatype
// ii) Identity - Each object is different from other object
// iii) Behaviour - Effect of datatype operations

// Reference variables are stored in stack memory and objects are stored in heap memory and these reference variables present in the stack memory points to the objects in the heap memory

// Variables inside the object are called instance variables -> Declared outside the method but inside the class
// Variables that define an object are called reference variables
// e.g. In student1.age, student1 is reference variable while age is an instance variable

// new keyword = Dynamic Memory Allocation

// For e.g.
// Student student1 = new Student();
// Student student1 -> Occurs at Compile Time
// new Student() -> Occurs at Run Time

// Constructor defines what happens when an object will be created
// A constructor in Java is a special block of code used to initialize a newly created object.
// Constructor is special function, that runs when you create an object and it allocates some variables


package introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // Store 5 roll nos
        int[] numbers = new int[5];

        // Store 5 names
        String[] names = new String[5];

        // Data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

          // just declaring
//        Student kunal;
//        System.out.println(Arrays.toString(students));
//        kunal = new Student();

//        Student om = new Student();
//        Student soham = new Student();

//        om.rno = 33;
//        om.name = "Om Pimple";
//        om.marks = 72.70f;

//        System.out.println(om.rno);
//        System.out.println(om.name);
//        System.out.println(om.marks);

//        om.greeting();
//
//        om.changeName("Omii");
//        om.greeting();

//        Student om = new Student(15, "Om Pimple", 88.5f);
//        System.out.println(om.rno);
//        System.out.println(om.name);
//        System.out.println(om.marks);
//
//        Student anushka = new Student(om);
//        System.out.println(anushka.rno);
//        System.out.println(anushka.name);
//        System.out.println(anushka.marks);

//        Student shrushti = new Student();
//        System.out.println(shrushti.rno);
//        System.out.println(shrushti.name);
//        System.out.println(shrushti.marks);

//        Student one = new Student();
//        Student two = one;
//
//        one.name = "Something something";
//        System.out.println(two.name);
    }

    // Create a class for every single student
    static class Student{
        int rno;
        String name;
        float marks;
//        float marks = 80;

        // We need a way to add the values of the above properties object by object
        // We need one word to access every object -> That word is 'this'

        void greeting(){
//            System.out.println("Hello, my name is "+name);
            System.out.println("Hello, my name is "+this.name);
        }

        void changeName(String newName){
            name = newName;
        }

//        Student(){
//            this.rno = 22;
//            this.name = "Om Pimple";
//            this.marks = 88.5f;
//        }

        Student(){
            // This is how you call a constructor from another constructor
            // Internally: new Student(20,"default person", 100.0f);
            this(20,"default person", 100.0f);
        }

        // For e.g. Student arpit = new Student(17, "Arpit", 89.7f);
        // Here this will be replaced with arpit
        Student(int rno, String name, float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

        Student(Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
    }
}