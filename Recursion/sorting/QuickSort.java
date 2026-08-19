// Notes -
// i) Not stable
// ii) In place sorting algorithm - That's why it is preferred for arrays instead of Merge Sort. Merge Sort takes extra O(N) space
// iii) Merge Sort is better in linked lists due to memory allocation -> non-continuous

// Worst Case Time Complexity - O(N square)
// Best Case Time Complexity - O(NlogN)

package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr);
    }

    public static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, high);
    }
}
