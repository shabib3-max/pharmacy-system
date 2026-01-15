/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharamcy.ui;

import java.util.Scanner;

/**
 *
 * @author سندس
 */
 

import java.util.Scanner;
import PharamcyLogic.Supply;
 
 
 public class SupplyScreen {
    public Supply getSupply() {

        Scanner input = new Scanner(System.in);

        System.out.println(" Supply Medicine Screen");

        System.out.print("Enter Medicine Name: ");
        String medicineName = input.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();
        input.nextLine();  

        System.out.print("Enter Supplier Name: ");
        String supplierName = input.nextLine();

       
        Supply supply = new Supply();
        supply.setMedicineName(medicineName);
        supply.setQuantity(quantity);
        supply.setSupplierName(supplierName);

       
      return supply;
    }
}

     

 
