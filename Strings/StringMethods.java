import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Om Pimple";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('m'));
        System.out.println("    Om     ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
