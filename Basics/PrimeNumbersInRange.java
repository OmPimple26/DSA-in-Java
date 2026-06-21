import java.util.*;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        for (int i=start; i<=end; i++){
            boolean isPrime = true;

            if(i<=1){
                isPrime = false;
            }else{
                for(int j=2; j<=Math.sqrt(i); j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
            }

            if(isPrime){
                System.out.print(i+" ");
            }
        }
    }
}
