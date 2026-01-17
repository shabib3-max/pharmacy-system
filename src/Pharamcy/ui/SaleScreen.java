/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharamcy.ui;

import PharamcyLogic.Sale;
import java.util.Scanner;

/**
 *
 * @author سندس
 */
public class SaleScreen {
   
 
 
    public Sale getSale() { //   

        Scanner input = new Scanner(System.in);

        System.out.print("Enter medicine name: ");
        String name = input.nextLine();

        System.out.print("Enter quantity sold: ");
        int qty = input.nextInt();

        System.out.print("Enter total price: ");
        double price = input.nextDouble();

        Sale s = new Sale();
        s.setMedicineName(name);
        s.setQuantity(qty);
        s.setTotalPrice(price);

        return s;
    }
}

 
