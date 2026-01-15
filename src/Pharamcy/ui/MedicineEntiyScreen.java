/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharamcy.ui;

import PharamcyLogic.Medicine;
import java.util.Scanner;

/**
 *
 * @author سندس
 */
 
     
/**
 *
 * @author سندس
 */
 
/*
 */
public class MedicineEntiyScreen {
 
 

    public Medicine getMedicine() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter medicine name: ");
        String name = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        Medicine m = new Medicine();
        m.setName(name);
        m.setPrice(price);
        m.setQuantity(quantity);

        return m;
    }
 
}
    
 

    
 