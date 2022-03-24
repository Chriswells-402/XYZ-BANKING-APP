/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankaccount;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class myBank {
    public static void main(String[] args) {
        System.out.println("WELCOME TO XYZ BANK CHOOSE YOUR ACCOUNT TYPE");
        System.out.println("FOR RGULAR ACCOUNT, PRESS 1");
        System.out.println("FOR INTREST ACCOUNT PRESS 2");
        System.out.println("FOR CHECKING ACCOUNT PRESS 3");
        System.out.println("FOR CD ACCOUNT PRESS 4");
        int accountType;
        Scanner scan =new Scanner(System.in);
        accountType=scan.nextInt();
        if(accountType==1)
        {
            System.out.println("ENTER PIN");
            int pin;
            pin=scan.nextInt();
            if(pin==1111){
                System.out.println("TRANSACTIONS AT THE END OF THE MONTH");
                System.out.println("SELECT 1 FOR DEPOSIT CHARGES");
                System.out.println("SELECT 2 FOR BALANCE INQUIRY");
                int select;
                select=scan.nextInt();
                switch(select){
                    case 1:
                        System.out.println("No charge for deposit");
                 break;
                    case 2:
                        System.out.println("penalty of 10.00 for balance below 50000");
                        

                }
            }
            else{
                System.out.println("Wrong PIN");
            }
        }
        else if(accountType==2){
            System.out.println("ENTER PIN");
            int pin;
            pin=scan.nextInt();
            if(pin==2222){
                System.out.println("TRANSACTIONS AT THE END OF THE MONTH");
                System.out.println("SELECT 1 FOR INTREST AND CHARGE");
                System.out.println("SELECT 2 FOR PENALTY CHARGE");
                int select;
                select=scan.nextInt();
                switch(select){
                    case 1:
                        System.out.println("7% intrest every month");
                        System.out.println("10% fee for every month");
                 break;
                    case 2:
                        System.out.println("no minimum balance rquired");
                        

                }
            }
            else{
               System.out.println("Wrong PIN"); 
            }
        }
        else if(accountType==3)
        {
            System.out.println("ENTER PIN");
            int pin;
            pin=scan.nextInt();
            if(pin==3333){
                System.out.println("TRANSACTIONS AT THE END OF THE MONTH");
                System.out.println("SELECT 1 FOR INTREST AND FEES");
                System.out.println("SELECT 2 FOR FOR PENALTY AND MIN BALANCE");
                int select;
                select=scan.nextInt();
                switch(select){
                    case 1:
                        System.out.println("10% charge onbalance");
                        System.out.println(" charge of 0.10 for each transaction");
                        System.out.println("7% annual intrest paid monthly");
                 break;
                    case 2:
                        System.out.println("penalty of 10.00 for balance below 50000");
                        System.out.println(" charge of 0.10 for each transaction");
                        System.out.println("10.00 penalty for balance below 10000.00");

                }
            }
            else{
               System.out.println("Wrong PIN"); 
            }
        }
        else if(accountType==4)
        {
            System.out.println("ENTER PIN");
            int pin;
            pin=scan.nextInt();
            if(pin==4444){
                System.out.println("TRANSACTIONS AT THE END OF THE MONTH");
                System.out.println("SELECT 1 FOR DFOR INTREST AND CHARGE");
                System.out.println("SELECT 2 FOR FOR PENALTY AND BALANCE");
                int select;
                select=scan.nextInt();
                switch(select){
                    case 1:
                        System.out.println("15% intrest paid every year");
                        System.out.println("10% fee for every month");
                 break;
                    case 2:
                        System.out.println("no minimum balance rquired");
                        System.out.println("penalty of 20% on current balance if withdrwawal is done below 12 months");

                }
            }
            else
            {
                System.out.println("Wrong PIN");
            }
        }
        
    }
}
