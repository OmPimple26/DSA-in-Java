// Notes:

//String Comparison and Object Identity
//
//1) Two main ways to compare strings:
//i) == operator: Checks if two reference variables point to the same object in memory.
//ii) .equals() method: Checks if the values/contents of the strings are equal regardless of whether they are the same object.
//
//2) Creating strings with new String("om") explicitly creates distinct objects, even if the value is same, bypassing the string pool. Thus, == returns false but .equals() returns true.
//
// Comparison Method	             Checks For	                         Result When Same Value, Different Objects
//        ==	                  Reference equality	                    true only if pointers are identical
//     .equals()	              Value/content equality	                true if string contents match


public class StringComparison {
    public static void main(String[] args) {
        String a = "Om";
        String b = "Om";
        String c = a;

        System.out.println(c==a); // true

        System.out.println(a==b); // true

        // -----------------------------------------------------------

        String name1 = new String("Om");
        String name2 = new String("Om");

        System.out.println(name1==name2); // false

        System.out.println(name1.equals(name2)); //true
    }
}
