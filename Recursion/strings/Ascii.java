package strings;

public class Ascii {
    public static void main(String[] args) {
        char ch = 'a';

        while(ch != 'z'){
            System.out.println((char)(ch + 1));
            ch++;
        }
    }
}