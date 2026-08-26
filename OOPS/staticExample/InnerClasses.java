// Since static variables / static methods do not depend on objects, and since objects are created at runtime hence static variables / static methods are resolved at compile time

// System.out.println ->
// System = class
// out = variable
// println = method

package staticExample;

public class InnerClasses {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Om");
        Test b = new Test("Anushka");

//        System.out.println(a.name);
//        System.out.println(b.name);

        System.out.println(a);
        System.out.println(b);
    }
}