// 1. Search the target and return the element

//import java.util.*;
//
//public class LinearSearch {
//    public static void main(String[] args) {
//        int[] nums = {23,45,1,2,8,1,-3,16,-11,28};
//        int target = 45;
//        int ans = linearSearch(nums, target);
//        System.out.println("Target element found is: "+ans);
//    }
//
//    public static int linearSearch(int[] nums, int target){
//        if(nums.length==0){
//            return -1;
//        }
//
//        for(int element: nums){
//            if(element == target){
//                return element;
//            }
//        }
//
//        return Integer.MAX_VALUE;
//    }
//}


// 2. Search for the element in the array and return the index of the element

//import java.util.*;
//
//public class LinearSearch {
//    public static void main(String[] args) {
//        int[] nums = {23,45,1,2,8,1,-3,16,-11,28};
//        int target = 45;
//        int ans = linearSearch(nums, target);
//        System.out.println("Target element found at index: "+ans);
//    }
//
//    public static int linearSearch(int[] nums, int target){
//        if(nums.length==0){
//            return -1;
//        }
//
//        for(int i=0; i<nums.length; i++){
//            int element = nums[i];
//            if(element==target){
//                return i;
//            }
//        }
//        return -1;
//    }
//}


// 3. Search the target and return true or false

//import java.util.*;
//
//public class LinearSearch {
//    public static void main(String[] args) {
//        int[] nums = {23,45,1,2,8,1,-3,16,-11,28};
//        int target = 45;
//        boolean ans = linearSearch(nums, target);
//        System.out.println("Target element found: "+ans);
//    }
//
//    public static boolean linearSearch(int[] nums, int target){
//        if(nums.length==0){
//            return false;
//        }
//
//        for(int i=0; i<nums.length; i++){
//            int element = nums[i];
//            if(element==target){
//                return true;
//            }
//        }
//        return false;
//    }
//}

// 4. Search in range

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,1,-3,16,-11,28};
        int target = 45;
        int ans = linearSearch(nums, target, 1, 4);
        System.out.println("Target element found at index: "+ans);
    }

    public static int linearSearch(int[] nums, int target, int start, int end){
        if(nums.length==0){
            return -1;
        }

        for(int i=start; i<=end; i++){
            int element = nums[i];
            if(element==target){
                return i;
            }
        }
        return -1;
    }
}