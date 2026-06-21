import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        System.out.println("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        calcSecLargest(arr);
    }

    public static void calcSecLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }else if (arr[i]>second && arr[i]!=first){
                second = arr[i];
            }
        }

        System.out.println("Second largest number is "+second);
    }
}
