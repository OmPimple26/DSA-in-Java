package easy;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = productofdigits(1324);
        System.out.println(ans);
    }

    public static int productofdigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * productofdigits(n/10);
    }
}
