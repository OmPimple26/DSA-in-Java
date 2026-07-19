public class FibonacciUsingRecursion {
    public static void main(String[] args) {
//        int ans = fiboseries(5);
//        System.out.println(ans);

        for(int i=0; i<=10; i++){
//            System.out.println("Fibonacci series for "+i+" is: "+fiboseries(i));
            System.out.println(fiboseries(i));
        }
    }

    public static int fiboseries(int n){
//        if(n==0){
//            return 0;
//        }
//
//        if(n==1){
//            return 1;
//        }

        if(n<2){
            return n;
        }

        return fiboseries(n-1) + fiboseries(n-2);
    }
}
