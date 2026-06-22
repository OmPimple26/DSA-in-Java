import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator(+,-,*,/,%): ");
        char operator = sc.next().charAt(0);

        int result;

        switch(operator){
            case '+': result = num1 + num2;
                      break;

            case '-': result = num1 - num2;
                      break;

            case '*': result = num1 * num2;
                break;

            case '/': result = num1 / num2;
                break;

            case '%': result = num1 % num2;
                break;

            default: throw new IllegalArgumentException("Invalid operation");
        }

        System.out.println("Result: "+result);
    }
}
