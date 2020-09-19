package Tasks1909;

import java.util.Scanner;

public class PasswordsCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.next();
        String validPassword = "Password123";
        if (password.equals(validPassword)){
            System.out.println("Correct password");
                    }
                    else {
            System.out.println("Wrong password");
        }
    }
}
