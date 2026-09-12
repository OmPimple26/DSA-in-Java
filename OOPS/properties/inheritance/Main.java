// Inheritance in Java is a core Object-Oriented Programming (OOP) concept that allows one class to acquire the properties (fields) and behaviors (methods) of another class.

// When a reference to a subclass object is assigned to a superclass variable just like below example you will only be able to access only those parts of the objects that are defined in the superclass
// For e.g. Box box6 = new BoxWeight(2,3,4,8);

// Types of inheritance ->

// 1) Single Inheritance:
// One class extends another class. For e.g. BoxWeight class extends Box class

// 2) Multilevel Inheritance:
// One class can inherit from a derived class and that derived class can become a parent for another new class
// For e.g.    Box
//              |
//          BoxWeight
//              |
//           BoxPrice

// 3) Multiple Inheritance:
// When one class is extending more than one classes
// Java does not support multiple inheritance because if two or more parent classes have same variable or something property then child class will get confused which one to pick
// It is achieved with the help of interfaces

// 4) Hierarchical Inheritance:
// One class is inherited by many classes

// 5) Hybrid Inheritance:
// Combination of single and multiple inheritance
// Not present in java since multiple inheritance is not supported in java

package properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " " + box.w + " " + box.h);
//
//        Box box1 = new Box(4);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//
//        Box box2 = new Box(4.6, 7.9, 9.9);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//
//        Box box3 = new Box(box2);
//        System.out.println(box3.l + " " + box3.w + " " + box3.h);

//        BoxWeight box4 = new BoxWeight();
//        System.out.println(box4.l + " " + box4.w + " " + box4.h + " " + box4.weight);

//        BoxWeight box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.l + " " + box5.w + " " + box5.h + " " + box5.weight);

//        Here you can access l,w and h but you cannot access weight
//        Box box6 = new BoxWeight(2,3,4,8);
//        System.out.println(box6.l + " " + box6.w + " " + box6.h + " " + box6.weight);

//        there are many variables in both parent and child classes
//        you are given access to variables that are in the ref type i.e. BoxWeight
//        hence, you should have access to weight variable
//        this also means, that the ones you are trying to access should be initialised
//        but here, when the obj itself is of type parent class, how will you call the constructor of child class
//        this is why error
//        BoxWeight box7 = new Box(2,3,4);
//        System.out.println(box7.l + " " + box7.w + " " + box7.h + " " + box7.weight);

        BoxPrice box8 = new BoxPrice(5,8,200);
        System.out.println(box8.l + " " + box8.w + " " + box8.h + " " + box8.weight + " " + box8.cost);
    }
}
