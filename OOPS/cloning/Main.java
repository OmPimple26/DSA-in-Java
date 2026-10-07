// Clone is a method in the Object class used to make the exact copy of an object

package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human om = new Human(22, "Om Pimple");
        // Human twin = new Human(om);

        Human twin = (Human)om.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
