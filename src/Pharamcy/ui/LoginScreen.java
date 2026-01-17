 
package Pharamcy.ui;

import PharamcyLogic.User;
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author سندس
 * حع
 */
  public class LoginScreen {

    public User login() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ID: "); // هان بندخب id 
        int id = input.nextInt();

        System.out.print("Enter Password: ");//  هان بندحل password 
        int password = input.nextInt();
        input.nextLine();  
        System.out.print("Enter Name: ");//  هان  name  
        String name = input.nextLine();

        System.out.print("Enter Role (Admin / Pharmacist): ");
        String role = input.nextLine();

        User user = new User();
        user.setId(id);
        user.setPassword(password);
        user.setName(name);
        user.setRole(role);

        System.out.println("Login successful");
        return user;
    }
}
