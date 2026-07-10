// Bubble Sort - Also called as Sinking Sort / Exchange Sort

// Stable Sort

// Time Complexity -
// Best Case - O(n)
// Worst Case - O(n square)

// Space Complexity - O(1)

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
//        int arr[] = {1,2,3,4,5};
//        int arr[] = {5,4,3,2,1};
        int arr[] = {3,1,5,4,2};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        boolean swapped;

        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }
}
