//import java.util.*;
//
//public class LargestElementInArray {
//    public static void main(String[] args) {
//        int[] arr = {5,3,4,7,9};
//        int largest = arr[0];
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
//        }
//        System.out.println(largest);
//    }
//}


import java.util.*;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,3,4,7,9};
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
