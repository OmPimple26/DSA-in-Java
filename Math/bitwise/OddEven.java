// Note: Last bit of binary number is also known as less significant bit

// Question - Check whether number is even or odd

package bitwise;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isOdd(50));
    }

    public static boolean isOdd(int n){
        if((n & 1) == 1){
            return true;
        }else{
            return false;
        }
    }
}
