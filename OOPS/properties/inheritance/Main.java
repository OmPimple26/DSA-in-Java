// Inheritance in Java is a core Object-Oriented Programming (OOP) concept that allows one class to acquire the properties (fields) and behaviors (methods) of another class.

package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);

        Box box1 = new Box(4);
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Box box2 = new Box(4.6, 7.9, 9.9);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        Box box3 = new Box(box2);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
    }
}