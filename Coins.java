
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madison Buse Lewis
 * This is continuation from the Wallet mini project where getValue(), getDolllars(), getChange() and Spend() functions are made.
 */
//import java.util.Scanner
public class Coins {
    //Instant Variables
    private int pennies, nickels, dimes, quarters;
    
    private int amount;
    
    
  
                       
    
    //Constructors
    public Coins(int pennies, int nickels, int dimes, int quarters){
        this.pennies = pennies;
        this.nickels = nickels;
        this.dimes = dimes;
        this.quarters = quarters;
    }
    
    
    //getValue: This will return a double with the total value of the coins in dollars and cents. 
    public double getValue(){
        double total;
        total = 0;
        total += this.pennies * 0.01;
        total += this.nickels * 0.05;
        total += this.dimes * 0.10;
        total += this.quarters * 0.25;
        return total;
    
}
    //getDollars: Return an integer with the amount of dollars in the Coins.
    public int getDollars(){
        int dollars = (int) this.getValue();
        return dollars;
    }
    
    //getChange: Returns an integers with the change.
    public int getChange() {
        double findChange = (this.getValue() - this.getDollars()) * 100;
        findChange = Math.round(findChange); // We have to round it to the highest number for accuracy purposes.
        int change = (int) findChange;
        return change;
    }
    
    //Spend: You can spend the amount of dollars you earned in your wallet and aks you if you want to spend them.
    public void Spend() {
          
        Scanner inUser = new Scanner(System.in);
        
        String decision = inUser.nextLine();
       switch(decision)
      {
           
           case "yes":
            System.out.println("Okay. How much do you want to take out? You can take out max. 30 dollars (5, 10, 15, 20, 25, 30)");
            int amount = inUser.nextInt();
            if(amount > 30){
                System.out.println("Sorry, but I said I can/t take out more than 30.");
                
            } else{
            System.out.println("You now have " + (this.getDollars() - amount) + " dollars");
            }
            break;

        case "no":
            System.out.println("Okay. Have a nice day."); 
            break;

        default:
            System.out.println("Invalid statement.");
            boolean repeat = true;
            
            while (repeat)
            {
                System.out.println("Let/s try again. Do you want to spend it? yes or no");
                decision = inUser.nextLine();

                switch (decision)
                {
                    case "yes":
                        
                        System.out.println("Okay. How much do you want to take out? You can take out max. 30 dollars (5, 10, 15, 20, 25, 30)");
                        int amount2 = inUser.nextInt();
                        if(amount2 > 30){
                        System.out.println("Sorry, but I said I can/t take out more than 30.");
                
                        } else{
                            System.out.println("You now have " + (this.getDollars() - amount2) + " dollars");
                        }
                        
                        repeat = false;
                        break;

                    case "no":
                        System.out.println("Okay. Have a nice day."); 
                        repeat = false;
                        break;
                    default:
                        repeat = true;
                }
            }
            break;
    }

      
}
    
}
