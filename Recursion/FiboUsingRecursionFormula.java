public class FiboUsingRecursionFormula {
    public static void main(String[] args) {
//        int ans = calcFibo(6);
//        System.out.println(ans);

//        for(int i=0; i<=10; i++){
//            System.out.println(calcFibo(i));
//        }

        int answer = fiboFormula(50);
        System.out.println(answer);
    }

    public static int fiboFormula(int n){
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

//    public static int calcFibo(int n){
//        if(n==0){
//            return 0;
//        }
//
//        if(n==1){
//            return 1;
//        }
//
//        return calcFibo(n-1) + calcFibo(n-2);
//    }
}
