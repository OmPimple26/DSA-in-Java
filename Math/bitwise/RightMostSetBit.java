// Solution:
// 0000 1100 -> 12 in binary

package bitwise;

public class RightMostSetBit {
    public static void main(String[] args) {
        int num = 12;

        int ans = findRightMostSetBit(num);
        System.out.println(ans);
    }

    public static int findRightMostSetBit(int num){
        int position = 1;

        while((num&1)==0){
            num = num >> 1;
            position++;
        }
        return position;
    }
}
