/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PharamcyLogic;

/**
 *
 * @author سندس
 */
 
 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.file.Files.exists;

/**
 *
 * @author سندس
 */
public class AIfacade {


 
    public void addUser(User u) throws IOException {
        File file = new File("user.txt");
        file.createNewFile();

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("ID: " + u.getId() + "\n");
            writer.write("Name: " + u.getName() + "\n");
            writer.write("Password: " + u.getPassword() + "\n");
            writer.write("Role: " + u.getRole() + "\n");
            writer.write("---------------------\n");
        }
    }
 
    public void addMedicine(Medicine m) throws IOException {
        File file = new File("medicine.txt");
        file.createNewFile();

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Medicine: " + m.getName() + "\n");
            writer.write("Price: " + m.getPrice() + "\n");
            writer.write("Quantity: " + m.getQuantity() + "\n");
            writer.write("---------------------\n");
        }
    }
    
 
 
    public void addSupply(Supply s)throws IOException {
        File file = new File("supply.txt  ");
        file.createNewFile();

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(" Medicine:" + s.getMedicineName() + "\n");
            writer.write( " Quantity:"  + s.getQuantity() + "\n");
            writer.write(" Supplier : " +  s.getSupplierName() + "\n")  ;
            writer.write("---------------------\n");
        }
    }
 
 public void addSale(Sale sale) throws IOException {

    File file = new File("sale.txt");
    file.createNewFile();

    try (FileWriter writer = new FileWriter(file, true)) {
        writer.write("Medicine: " + sale.getMedicineName() + "\n");
        writer.write("Quantity Sold: " + sale.getQuantity() + "\n");
        writer.write("Total Price: " + sale.getTotalPrice() + "\n");
        writer.write("--------------------------\n");
    }
}
  
}



    
 
 
 

    
 
