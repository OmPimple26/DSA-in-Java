// Wrapper class - Convert primitive into object
// final keyword - Prevents content from being modified
// Always initialize final variables while declaring it
// Immutablity i.e. You cannot change the value only holds true for primitive datatypes while for non-primitive datatype for e.g. Integer, 00we can make the change in the value but we cannot resassign it

package introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        Integer num = new Integer(45);
        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a+" "+b);

        final int bonus = 2;
//        bonus = 3;
    }

    public static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
