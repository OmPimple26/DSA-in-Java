package arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(findIndex(arr, 4, 0));
//        System.out.println(findIndexLast(arr, 4, arr.length-1));
//        findAllIndex(arr, 4 ,0);
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex1(arr, 4, 0, list);
        System.out.println(ans);
        System.out.println(list);
    }

    public static boolean find(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }

    public static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
    }

    public static int findIndexLast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr, target, index-1);
        }
    }

    public static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }

    public static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex1(arr, target, index+1, list);
    }
}
