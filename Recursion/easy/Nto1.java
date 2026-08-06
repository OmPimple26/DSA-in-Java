package easy;

public class Nto1 {
    public static void main(String[] args) {
//        fun(5);
        funRev(5);
    }

    // Method 1 - Print n to 1
    public static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }

    // Method 2 - Print 1 to n
    public static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}