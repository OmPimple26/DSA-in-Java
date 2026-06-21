import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        int temp = num;

        while(temp>0){
            int rem = temp%10;
            sum += Math.pow(rem,3);
            temp/=10;
        }

        if(sum==num){
            System.out.println(""+num+" is an armstrong number");
        }else{
            System.out.println(""+num+" is not an armstrong number");
        }
    }
}
