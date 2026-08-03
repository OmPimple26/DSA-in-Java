// Find the factors of a given number

package maths;

public class Factors {
    public static void main(String[] args) {
        int n = 40;
//        factor1(n);  // By using Method 1
        factor2(n);  // By using Method 2
    }

    // Method 1
    // Time Complexity - O(n)
    public static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }

    // Method 2
    // Time Complexity - O(sqrt(n))
    public static void factor2(int n){
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if (n / i == i) {
                    System.out.print(i+" ");
                }else{
                    System.out.print(i + " " + n/i+ " ");
                }
            }
        }
    }
}
