/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PMS;

import Pharamcy.ui.LoginScreen;
import Pharamcy.ui.MedicineEntiyScreen;
import Pharamcy.ui.SaleScreen;
import Pharamcy.ui.SupplyScreen;
import PharamcyLogic.AIfacade;
import PharamcyLogic.Medicine;
import PharamcyLogic.Sale;
import PharamcyLogic.Supply;
import PharamcyLogic.User;
import java.util.Scanner;

/**
 *
 * @author سندس
 */
public class PMS {
    
  
 

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        AIfacade facade = new AIfacade();

        System.out.println("Pharmacy Management System ");
        System.out.println("1. Add Medicine");
        System.out.println("2. Supply Medicine");
        System.out.println("3. Sale Medicine");
        System.out.println("4. Add User");
        System.out.print("Choose: ");

        int choice = input.nextInt();
        input.nextLine();

        try {
            switch (choice) {

                case 1: // Medicine
             MedicineEntiyScreen  ms  =new  MedicineEntiyScreen    ();
                    Medicine m = ms.getMedicine();
                    facade.addMedicine(m);
                    System.out.println("Medicine saved");
                    break;

                case 2: // Supply
                    SupplyScreen ss = new SupplyScreen();
                    Supply sup = ss.getSupply();
                    facade.addSupply(sup);
                    System.out.println("Supply saved");
                    break;

                case 3: 
                    
    SaleScreen salesScreen = new SaleScreen();
    Sale sale = salesScreen.getSale();
    facade.addSale(sale);
    System.out.println("Sale saved");
    break;     

                case 4:  
                    LoginScreen us = new LoginScreen();
                    User u = us.login();
                    facade.addUser(u);
                    System.out.println("User saved ✔");
                    break;

                default:
                    System.out.println("Wrong choice!");
            }

        } catch (Exception e) {
            System.out.println("Error occurred!");
        }
    }
}

    
    
 
