// Pattern 6:

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        pattern6(n);
    }

    public static void pattern6(int n){
        for(int row=0; row<2*n; row++){
            int totalColsinRow = row>n? 2*n-row : row;

            int noOfSpaces = n - totalColsinRow;

            for(int s=0; s<noOfSpaces; s++){
                System.out.print(" ");
            }

            for(int col=0; col<totalColsinRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
