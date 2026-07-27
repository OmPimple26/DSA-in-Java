// Solution:
//    0000 1010  // Binary Representation of 10
//  | 0000 0100  // Left shift 1 by (i-1) i.e. (3-1) = 2
//  ------------
//    0000 0100  // 3rd bit is set to 1

package bitwise;

public class setBit {
    public static void main(String[] args) {
        int num = 10;
        int i = 3;

        int ans = setBit(num, i);
        System.out.println(ans);
    }

    public static int setBit(int num, int i){
        // Create a mask

        int mask = 1<<(i-1);

        // Set the bit mask
        return num | mask;
    }
}
