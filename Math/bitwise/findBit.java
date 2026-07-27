// Solution:
//  0000 1110  // Binary Representation of 14
//& 0000 0100  // Left shift 1 by (i-1) i.e. (3-1) = 2
//------------
//  0000 0100  // 3rd bit is 1

package bitwise;

public class findBit {
    public static void main(String[] args) {
        int num = 14;
        int i = 3;

        int ans = findIthBit(num,i);
        System.out.println(ans);
    }

    public static int findIthBit(int num, int i){
        // Create a mask
        int mask = 1<<(i-1);

        // AND operation
        if((num & mask) == 0){
            return 0;
        }else{
            return 1;
        }
    }
}
