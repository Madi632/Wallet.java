/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
/* Wallet Homework
 * Methodology of Programming 2
 * @author Madison Buse Lewis
 * Neptun code: ANIDGQ
 *
 *This project is about how the wallet can get any amount of pennies, nickels, dimes,
 *and quarters. You can spend it too.
 *It is also responsive towards temperature and if it detects a high degree (37.8*C to be exact)
 *then it will automatically spray antiseptic fluid to the hands before asking the amount of money the user
 *should put.
 */
public class Wallet {
    public static void main(String[] args){
        //Create Coins class so we can create getValue(), getDollars() and Spend(). A more detailed explanation of 
        //these functions are in the Coins.java file.
        //There is also coronaCheck.java class that is responsible for checking if you have the virus
        //or not with coronaCheck() and Result() before Coins class begins.
        //Now to test it.
        Scanner inUser = new Scanner(System.in); //Console keyboard input
        
        coronaCheck coronaCheck = new coronaCheck();
        
        coronaCheck.coronaCheck();//For checking the temperature of the user.
        coronaCheck.Result();//For giving the maximum and minimum temperature of the 2 hours with date and time written.
        
        
        System.out.println("Hello. This is your wallet. Please input the amount of pennies, nickels, dimes, and quarters in your wallet.(e.g 2 4 6 9)");
        
        int a = inUser.nextInt(); //Integer input from keyboard
       
        int b = inUser.nextInt(); 

       int c = inUser.nextInt(); 

        int d = inUser.nextInt(); 
        
        Coins coinWallet = new Coins(a, b, c, d );
        
        
        
        System.out.println("The value of all the coins combined is " + coinWallet.getValue() + ". " + "The amount turned into dollars is " + coinWallet.getDollars() + ". " );
        
        System.out.println("Do you want to spend it? yes or no");
        coinWallet.Spend();
        
    }
}

    
       

      
   
   


