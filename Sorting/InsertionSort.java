// Insertion Sort - Used when array is almost/nearly sorted

// Why use Insertion Sort -

// i) Adaptive - Steps get reduced if array is sorted. No. of swaps reduced as compared to bubble sort.

// ii) Stable.

// iii) Used for smaller values of n - Used when array is partially sorted. It takes part in hybrid sorting algorithms.

// Time Complexity -
// Worst Case - O(n square)
// Best Case - O(n)

// Space Complexity - O(1)


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j= i+1; j>0; j--){
                if(arr[j-1]>arr[j]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
