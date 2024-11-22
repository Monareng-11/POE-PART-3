package com.mycompany.easykanbanapp1;

import java.util.Scanner;
import javax.swing.*;

public class EasykanbanApp1 {
    private static Methods methods;
    private static TaskManager taskManager;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        methods = new Methods();
        taskManager = new TaskManager();
        
        JOptionPane.showMessageDialog(null, "Welcome to Easykan");
        
        //User Registration and Login
        if (registerUser() && loginUser()) {
            showMenu();
        }
    }
    
    private static boolean registerUser(){
        System.out.print("Register: ");
        System.out.print("Enter first Name");
        methods.firstName = input.next();
        System.out.print("Enter Last Name: ");
        methods.surname = input.next();
        System.out.print("Enter Username: ");
        methods.userName = input.next();
        System.out.print("Enter Password: ");
        methods.password = input.next();
        
        System.out.println(methods.registerUser());
        
        while (methods.checkUsername() (methods.checkPasswordComplexity()) {
        System.out.println("invalid username or password. Try again.");
        System.out.print("Enter Username");
        methods.userName = input.next();
        System.out.print("Enter Password");
        methods.password = input.next();
        System.out.println(methods.registerUser());
    }
        
    return true;   
    
    }


private static boolean loginUser() {
    System.out.println("Login:");
    System.out.println("Enter Username: ");
    methods.enteredUserName = input.next(); // status entered username
    System.out.println("Enter Password: ");
    methods.enteredPassword = input.next(); // status entered password
    
    
} 

    private static void showMenu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

// Check if the login credentials match
while (methods.loginUser()) {
    System.out.println("Invalid credentials; Try again: ");
    System.out.print("Enter Username; ");
    methods.enteredUserName = input.next();
    System.out.print("Enter Password: ");
    methods.enteredPassowrd = input.next();
    
    // Check again if the username matches
    if (methods.enteredUserName.equals(methods.userName)) {
        System.out.println("Username does not watch the registered username: ");
        return false;
    }
    

JoptionPane.showMessegeDialog(null, "Login Successful!");
return true;
}


private static void showMenu() {
    while (true) {
        String menu = "1. Add Tasks\n2. show Report\n3 Quit";
        String optionstring = JOptionPane.showInputDialog(menu);
        
        if (optionString = null{}) (optionstring.isEmpty()) break;
        
        int option;
        try {
            option = integer.parseInt(OptionString);    
        } catch (NumberFormatException) {
        JOptionPane.showMesssgeDialog(null, "Invalid input.Please enter a number to continue");  
        
        }
        
        switch(option) {
            case 1 -> addTask();
            case 2 -> showReport();
            case 1 -> i {
            JOptionPane,showMessageDialog(null, "Exiting....");
        }
        
    }
}
}
