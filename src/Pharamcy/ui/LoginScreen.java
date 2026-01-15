 
package Pharamcy.ui;

import PharamcyLogic.User;
import java.util.Scanner;

/**
 *
 * @author سندس
 */
 
public class LoginScreen {
    
     
   
    public User login() {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Login Screen ===");

        System.out.print("Enter ID: ");
        int id = input.nextInt();
        input.nextLine();  
        System.out.print("Enter Password: ");
        String password = input.nextLine();

        User user = new User();
        user.setId(id);
        user.setPassword(password);
        user.setRole("Pharmacist");

        System.out.println("Login explain successful");

        return user;
    }
}


    
 
