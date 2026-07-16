// Pattern 5:

//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
//  * * * *
//  * * *
//  * *
//  *

public class Pattern5 {
    public static void main(String[] args) {
        int n=5;
        pattern5(n);
    }

    public static void pattern5(int n){
        for(int row=0; row<2*n; row++){
            int totalColsinRow = row>n? 2*n-row : row;
            for(int col=0; col<totalColsinRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
