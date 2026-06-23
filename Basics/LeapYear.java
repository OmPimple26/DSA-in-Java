public class LeapYear {
    public static void main(String[] args) {
        int year = 2016;

        boolean isLeap = false;

        if((year%4==0 && year%100!=0) || (year%400==0)){
            isLeap = true;
        }

        System.out.println(isLeap);
    }
}
