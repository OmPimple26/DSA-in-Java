// Wrapper class - Convert primitive into object
// final keyword - Prevents content from being modified
// Always initialize final variables while declaring it
// Immutablity i.e. You cannot change the value only holds true for primitive datatypes while for non-primitive datatype for e.g. Integer, 00we can make the change in the value but we cannot resassign it
// Right before the object is freed from the memory, java calls the garbage collector and finalize method
// Garbage Collection (GC) in Java is an automated process managed by the Java Virtual Machine (JVM) to reclaim heap memory by deleting unused and unreachable objects.

package introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        Integer num = new Integer(45);
//        Integer num = 45;
//
//        Integer a = 10;
//        Integer b = 20;
//
//        swap(a,b);
//        System.out.println(a+" "+b);

//        final int bonus = 2;
//        bonus = 3;

//        final A om = new A("Om Pimple");
//        om.name = "Other name";

        // When a non-primitive is final, you cannot reassign it
//        om = new A("new object");

//        A obj = new A("Om");
//        System.out.println(obj.name);

        A obj;
        for(int i=0; i<1000000; i++){
            obj = new A("Random name");
        }
    }

    public static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    final int num = 10;
    String name;

    A(String name){
//        System.out.println("Object created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}