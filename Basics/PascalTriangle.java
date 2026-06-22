import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        printPascalTriangle(rows);
    }

    public static void printPascalTriangle(int rows){
        for(int i=0; i<rows; i++){
            // 1. Print leading spacing for centering
            for(int space=0; space < rows-i-1; space++){
                System.out.print(" ");
            }

            // 2. Calculate and print row values
            int value = 1;
            for(int j=0; j<=i; j++){
                System.out.print(value+" ");
                value = value * (i-j) / (j+1);
            }

            System.out.println();
        }
    }
}
