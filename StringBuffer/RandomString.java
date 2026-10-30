import java.util.Random;

public class RandomString {
    public static String generate(int size){
        StringBuffer sb = new StringBuffer(size);

        Random random = new Random();

        for(int i=0; i<size; i++){
            int randomChar = 97 + (int)(random.nextFloat() * 26);
            sb.append((char)(randomChar));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(RandomString.generate(5));

        String ans = RandomString.generate(5);
        System.out.println(ans);
    }
}
