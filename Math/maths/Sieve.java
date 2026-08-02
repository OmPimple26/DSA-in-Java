// Total Time Complexity - O(n * log(log(n))
// Space Complexity - O(n)

package maths;

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] isPrime = new boolean[n + 1];

        sieve(n, isPrime);

        System.out.println("Prime Numbers:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    static void sieve(int n, boolean[] isPrime) {

        // Assume all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Mark non-prime numbers
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}
