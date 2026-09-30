// If you are trying to access a protected variable outside the package, then only subclass can access it but base class cannot access it

package access;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal Kushwaha");
//        int n = obj.num;  // Can be accessed for protected num but not for private num

        System.out.println(obj instanceof Object);
    }
}
