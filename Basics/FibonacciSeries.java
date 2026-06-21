// 1. Using Iterative Method-

//import java.util.*;
//
//public class FibonacciSeries {
//    public static void main(String[] args) {
//        int N = 10;
//        fibonacci(N);
//    }
//
//    public static void fibonacci(int N){
//        int n1 = 0;
//        int n2 = 1;
//
//        for(int i=0; i<N; i++){
//            System.out.print(n1 + " ");
//
//            // swap
//            int n3 = n1+n2;
//            n1=n2;
//            n2=n3;
//        }
//    }
//}

// -------------------------------------------------------------------------------------------------------------

// 2. Using Recursion Method-

import java.util.*;

public class FibonacciSeries{
    public static void main(String[] args) {
        int N = 10;
        for(int i=0; i<N; i++){
            System.out.println(calcFib(i));
        }
    }

    public static int calcFib(int n){
        if(n<=1){
            return n;
        }else{
            return calcFib(n-1) + calcFib(n-2);
        }
    }
}