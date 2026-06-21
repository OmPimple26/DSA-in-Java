import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reversed = "";

        for(int i=str.length()-1; i>=0; i--){
            reversed = reversed + str.charAt(i);
        }

        if(str.equals(reversed)){
            System.out.println(""+str+" is a palindrome string");
        }else{
            System.out.println(""+str+" is not a palindrome string");
        }
    }
}
