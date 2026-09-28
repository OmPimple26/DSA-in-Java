import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] arr){
        int count = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                count++;
            }
        }
    }
}
