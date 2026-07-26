// Question: Find the Single Unique Element (All other elements appear twice)

package bitwise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindUnique {
    public static void main(String[] args) {
//        int[] nums = {4, 1, 2, 1, 2};
        int[] nums = {2, 3, 3, 4, 2, 6, 4};
        int ans = findUnique(nums);
        System.out.println(ans);
    }


    // Method 1 -> Using Sorting
//    public static int findUnique(int[] nums){
//        Arrays.sort(nums);
//
//        for(int i=0; i<nums.length-1; i+=2){
//            if(nums[i] != nums[i+1]){
//                return nums[i];
//            }
//        }
//        return nums[nums.length-1];
//    }


    // Method 2 -> Using HashMap
//    public static int findUnique(int[] nums){
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int num: nums){
//            if(map.containsKey(num)){
//                map.put(num, map.get(num)+1);
//            }else{
//                map.put(num,1);
//            }
//        }
//
//        for(int key:map.keySet()){
//            if(map.get(key)==1){
//                return key;
//            }
//        }
//        return -1;
//    }


    // Method 3 -> Using Bitwise X-OR
    public static int findUnique(int[] nums){
        int unique = 0;

        for(int num: nums){
            unique ^= num;
        }

        return unique;
    }
}