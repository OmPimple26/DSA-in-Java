package maths;

public class GCD_LCM {
    public static void main(String[] args) {
        int ans = gcd(4,8);
        System.out.println(ans);

        int result = lcm(4,8);
        System.out.println(result);
    }

//    Method 1
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }

//     Method 2
//    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }

    public static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}