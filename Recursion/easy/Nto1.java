package easy;

public class Nto1 {
    public static void main(String[] args) {
//        fun(5);
//        funRev(5);
//        funRevPart2(1);
//        funBoth(5);
        concept(5);
    }

    // Concept
    public static void concept(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
//        concept(n--);
        concept(--n);
//        n-- vs --n
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

//    public static void funRevPart2(int n){
//        if(n==5){
//            System.out.println(5);
//            return;
//        }
//        System.out.println(n);
//        funRevPart2(n+1);
//    }

    // Method 3 - Print n to 1 and then 1 to n
    public static void funBoth(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}