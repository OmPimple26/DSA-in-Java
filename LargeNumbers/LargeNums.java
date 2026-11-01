// Storing large integers ->

// i) Big Integer:

//    Object Class
//        |->java.lang.Number
//                 |->java.math.BigInteger
//                           |->Extends Number class, implements Comparable interface <Big Integer>

// Range: -2 raise to the power of Integer.MAX_VALUE  to  +2 raise to the power of Integer.MAX_VALUE
//                  (exclusive)                                     (exclusive)

// ---------------------------------------------------------------------------------------------------------

// ii) Big Decimal:

// Float and Double (Primitive datatypes) are floating point numbers

// They are stored as a binary representation of a fraction and a power/exponent while other datatypes such as integers are fixed point numbers. This is why they give some error upto (10 raise to power -19)

// But BigDecimal gives the exact answer

//    Object Class
//        |->java.lang.Number
//                 |->java.math.BigDecimal
//                           |->Extends Number class, implements Comparable interface <Big Decimal>

// Range: It contains a random precision int unscaled value and a 32-bit int scale

// If the number is greater than 0, then Scale = no. of digits to right of decimal point
// else unscale value = 10 raise to power of -Scale


import java.math.BigInteger;

public class LargeNums {
    public static void main(String[] args) {
        BD();
    }

    public static void BD(){
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans);
    }

    public static void BI(){
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(3456789);  // Converting int/long to BI
        int c = B.intValue(); // Convert BI to int
        BigInteger C = new BigInteger("2335678663464757587474764");
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

        // Subtraction
        BigInteger sub = C.subtract(X);
        System.out.println(sub);

        // Division
        BigInteger d = C.divide(X);
        System.out.println(d);

        // Remainder
        BigInteger rem = C.remainder(X);
        System.out.println(rem);

        // Comparison
        if (X.compareTo(C) < 0) {
            System.out.println("Yes");
        }
    }
}
