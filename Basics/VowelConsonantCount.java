import java.util.*;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for(char c: str.toCharArray()){
            if("aeiou".indexOf(c) != -1){
                vowels++;
            }else if(Character.isLetter(c)){
                consonants++;
            }
        }

        System.out.println("Vowels are: "+vowels+" and consonants are: "+consonants);
    }
}
