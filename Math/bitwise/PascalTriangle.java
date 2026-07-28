//package bitwise;
//
//public class PascalTriangle {
//    public static void main(String[] args) {
//        int n = 5;
//        pascalTriangle(n);
//    }
//
//    public static void pascalTriangle(int n){
//        for(int i=0; i<n; i++){
//            int value = 1;
//
//            for(int j=0; j<=i; j++){
//                System.out.print(value+" ");
//                value = value * (i-j) / (j+1);
//            }
//            System.out.println();
//        }
//    }
//}


// Question: Print sum of all digits in nth row in a pascal traingle

package bitwise;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        int ans = sumOfRow(n);
        System.out.println(ans);
    }

    public static int sumOfRow(int n){
//        double sum = 1 * Math.pow(2, n - 1);
//        return sum;

        int sum = 1<<(n-1);
        return sum;
    }
}
