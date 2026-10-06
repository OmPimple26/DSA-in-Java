// Exception represents conditions that a reasonable application might want to catch and handle. These are typically caused by the program's code or external factors like missing files or invalid user input.
// e.g. NullPointerException, IOException, ArithmeticException.

// Error represents serious problems that a reasonable application should not try to catch. These are critical system-level or JVM-level failures that are usually fatal and irrecoverable.
// e.g. OutOfMemoryError, StackOverflowError.


// 1. Checked Exceptions: Checked by the compiler at compile-time. The program will not compile unless you explicitly handle them using a try-catch block or declare them in the method signature using the throws keyword.
// • Examples: FileNotFoundException (trying to read a missing file), SQLException (database errors).

// 2. Unchecked Exceptions (Runtime Exceptions): Not checked at compile-time. They typically occur due to programming flaws or logical mistakes.
// • Examples: NullPointerException (acting on a null object), ArrayIndexOutOfBoundsException (accessing an invalid array index).


// • OutOfMemoryError: Thrown when the JVM runs out of heap memory because the application allocated too many objects.
// • StackOverflowError: Thrown when a thread's call stack runs out of memory, usually due to infinite recursion.


// try-catch -> Used for exception handling
// throws -> Used to declare exceptions
// throw -> Used to explicitly throw an exception
// finally -> Always executes even if exception occurs or not


package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            // int c = a/b;
            divide(a, b);

            // Just for mimicking
            // throw new Exception("Just for fun");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("normal exception");
        }finally{
            System.out.println("This will always execute");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }

        return  a / b;
    }
}
