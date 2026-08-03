// Find the factors of a given number

package maths;

public class Factors {
    public static void main(String[] args) {
        int n = 40;
        factor1(n);  // By using Method 1
    }

    // Method 1
    public static void factor1(int n){
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
    }
}
