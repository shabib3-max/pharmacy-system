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
public class User {

    private int id;
    private String name;
    private int password;
    private String role;

    public int getId() {  //  هادا id 
        return id;
    }
  //seter ,geter id 
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
// هان  passeword  
    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
//  هان برجع 
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
