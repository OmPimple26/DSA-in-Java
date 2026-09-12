// Subclass won't be able to access those members of the parent class that have been declared private
// Any member declared as private can be accessed only within the same file and not in any other file
// Child class can access extra variables that are present in the parent class but if the object is directly created of parent class it will not be able to access the child properties
// It is the type of the reference variable and not the type of the object that determines what members can be accessed

// When a reference to a subclass object is assigned to a superclass variable just like below example you will only be able to access only those parts of the objects that are defined in the superclass

// Whenever a subclass (For e.g.BoxWeight) needs to refer to the superclass (For e.g.Box) from which it is derived, for that you can use the super keyword

// Super keyword is used to call the superclass constructor

package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);  // Call the parent class constructor
        // Used to initialize values present in the parent class
        this.weight = weight;

//        System.out.println(super.weight);
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}