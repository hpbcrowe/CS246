package week01;

import java.util.Scanner;

import static week01.NSALoginController.hashUserPassword;
import static week01.NSALoginController.verifyPassword;

/*********************************************************************************
 * TEST CLASS
 * Holds main() and tests the user and NSALoginController
 *********************************************************************************/

public class Test {
    //Scanner used to accept user input
    private static final Scanner _scanner = new Scanner( System.in );

    public static void main(String[] args) {
        //Prompt user for a password so we can make a user
        System.out.print("Please enter your password:");
        //Put the user input into string
        String password = _scanner.nextLine();

        User user = new User(password);
        //hashUserPassword throws exceptions
        try
        {
        //Printing out private user variables to test before and after
        System.out.println(" User Password before hash");
        System.out.println(user.getPassword());
        System.out.println("Salt before hash");
        System.out.println(user.getSalt());
        System.out.println("Hashed Password before hash");
        System.out.println(user.getHashedPassword());

            NSALoginController.hashUserPassword(user);
        }
        catch (WeakPasswordException ex) {
            System.out.println("Password rejected:" + ex.getMessage());
            return;
        }
        catch (Exception ex) {
            System.out.println("Something went wrong.");
            return;
        }


        //Printing
        System.out.println("User Password after Hash method");
        System.out.println(user.getPassword());
        System.out.println("Salt after Hash");
        System.out.println(user.getSalt());
        System.out.println("Hash value after Hash");
        System.out.println(user.getHashedPassword());

        System.out.print("Enter your password: ");
        password = _scanner.next();
        user.setPassword(password);
        try {
            if( verifyPassword(user))
                System.out.println("Login Successful!");
            else
                System.out.println("Login Failed!");

        } catch (Exception e) {
           System.out.println("Something went wrong.");
        }

    }
}
