// 1. Using Iterative Method-

//import java.util.*;
//
//public class Factorial {
//    public static void main(String[] args) {
//        int N = 5;
//        fact(N);
//    }
//
//    public static void fact(int N){
//        int factorial = 1;
//        for(int i=1; i<=N; i++){
//            factorial = factorial * i;
//        }
//
//        System.out.println("Factorial of "+N+" is: "+factorial);
//    }
//}

// 2. Using Recursive Method-

import java.util.*;

public class Factorial{
    public static void main(String[] args) {
        int N=5;
        int ans = calcFact(N);
        System.out.println(ans);
    }

    public static int calcFact(int n){
        if(n==0){
            return 1;
        }else{
            return n * calcFact(n-1);
        }
    }
}
