public class ReverseString {
    public static void main(String[] args) {
//        String str = "Hello World";
//        StringBuilder reversed = new StringBuilder(str).reverse();
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reversed);

        String str = "Hello World";
        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+reversed);
    }
}