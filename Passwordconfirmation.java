import java.util.Scanner;
public class Passwordconfirmation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter password");
        String password1 = sc.nextLine();

        System.out.println("Re-enter password");
        String password2 = sc.nextLine();

        if(password1.equals(password2)){
            System.out.println("Password confirmed");
        } else {
            System.out.println("Passwords do not match");
        }

        sc.close();
    }
}