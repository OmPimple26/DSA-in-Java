import java.util.*;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int N = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(""+N+" is a prime number");
        }else{
            System.out.println(""+N+" is not a prime number");
        }
    }
}
