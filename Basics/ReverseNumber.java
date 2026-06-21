import java.util.*;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = reverse(num);
        System.out.println("Reversed number is "+ans);
    }

    public static int reverse(int n){
        int reversed = 0;

        while(n>0){
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n/=10;
        }

        return reversed;
    }
}
