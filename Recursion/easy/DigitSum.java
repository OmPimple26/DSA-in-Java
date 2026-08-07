package easy;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sumofdigits(1324);
        System.out.println(ans);
    }

    public static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sumofdigits(n/10);
    }
}
