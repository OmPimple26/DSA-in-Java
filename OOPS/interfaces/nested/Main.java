// Nested interface can be declared as public, private or protected. But the top-level interface has to be declared public or the default one

package interfaces.nested;

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(5));
        System.out.println(obj.isOdd(6));
    }
}
