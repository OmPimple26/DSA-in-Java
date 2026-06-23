import java.util.*;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.print("Enter password: ");
        String pass = sc.next();

        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Successful");
        }else{
            System.out.println("Invalid username or password");
        }
    }
}
