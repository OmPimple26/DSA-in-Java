// Packages are containers for classes
// Packages are folders that allows you to create compartment for classes

package packages.a;

import static packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Hello world");
        message();
    }
}
