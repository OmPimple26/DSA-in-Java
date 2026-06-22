import java.util.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<Character,Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch: str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("First non repeated character: "+ch);
                return;
            }
        }
        System.out.println("No non repeated characters found");
    }
}
