/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.easykanbanapp1;

/**
 *
 * @author RC_Student_lab
 */
public class Methods {
    String firstName, surname, userName, password, enteredUserName,();

    public String regisreUser() {
        return "User registered successfully!";
    }
    
    public boolean checkUsername() {
        return userName != null && userName.length() >=5;
    }
    
    public boolean lginUser() {
        return enteredUserName != null && enteredPassword != null &&
               enetredUserName.equals(UserName) && enteredPassword.equals(password);
    }
    
    public String returnLoginStatus() {
        return loginUser() ? "Login Successful" ; "Invalid Login";
    }

    boolean registerUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
