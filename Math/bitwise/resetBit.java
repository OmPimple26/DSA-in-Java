// Solution:

// 0000 0100  // Left shift 1 by (i-1) i.e. (3-1) = 2 -> Mask value
// Negation of mask -> 1111 1011

//    0000 1110  // Binary Representation of 14
//  & 1111 1011  // Negation of mask
//  ------------
//    0000 1010  // 3rd bit is reset to 0

package bitwise;

public class resetBit {
    public static void main(String[] args) {
        int num = 14;
        int i = 3;
        int ans = reset(num, i);
        System.out.println(ans);
    }

    public static int reset(int num, int i){
        int mask = 1 << (i-1);

        return num & (~mask);
    }
}
