import java.util.*;

public class FindMinMax {
    public static void main(String[] args) {
        int[] arr = {23, 12, 45, 76, 89};

        findMin(arr);
        findMax(arr);
    }

    public static void findMin(int[] arr){
        if(arr.length == 0){
            System.out.println("Array is empty");
        }

        int min = arr[0];
//        int min = Integer.MAX_VALUE;

        for(int num: arr){
            if(num<min){
                min = num;
            }
        }

        System.out.println("Minimum element is: "+min);
    }

    public static void findMax(int[] arr){
        if(arr.length == 0){
            System.out.println("Array is empty");
        }

        int max = arr[0];
//        int max = Integer.MIN_VALUE;

        for(int num: arr){
            if(num>max){
                max = num;
            }
        }

        System.out.println("Maximum element is: "+max);
    }
}
