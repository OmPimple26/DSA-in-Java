// Storing large integers ->

// i) Big Integer:

//    Object Class
//        |->java.lang.Number
//                 |->java.math.BigInteger
//                           |->Extends Number class, implements Comparable interface <Big Integer>

// Range: -2 raise to the power of Integer.MAX_VALUE  to  +2 raise to the power of Integer.MAX_VALUE
//                  (exclusive)                                     (exclusive)


import java.math.BigInteger;

public class LargeNums {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3456789);  // Converting int/long to BI
        int c = B.intValue(); // Convert BI to int
        BigInteger C = new BigInteger("23356786634647");
        BigInteger X = new BigInteger("72267364734834");
        System.out.println(C);

        // Constants
        BigInteger D = BigInteger.ZERO;
        BigInteger E = BigInteger.ONE;
        BigInteger F = BigInteger.TWO;
        BigInteger G = BigInteger.TEN;

        // Addition
        BigInteger s = A.add(B);
        System.out.println(s);

        BigInteger sum = C.add(X);
        System.out.println(sum);

        // Multiplication
        BigInteger m = C.multiply(X);
        System.out.println(m);
    }
}
