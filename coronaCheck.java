/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.time.LocalDateTime;
/**
 *
 * @author madisonlewis
 */
public class coronaCheck {
        LocalDateTime myObj = LocalDateTime.now();
        Scanner inUser = new Scanner(System.in);
        int Spray_Meter = 200;
        final int HOURS_PER_DAY = 2;
        int temp; // a temperature reading
        int maxTemp = -100;
        int minTemp = 100;
        Scanner scan = new Scanner(System.in);
        
        public void coronaCheck(){
        //print program heading
        System.out.println();
        System.out.println("Temperature Readings for 1 Hour Period");
        System.out.println();
        
        for (int hour = 0; hour < HOURS_PER_DAY; hour++ )
        {
            System.out.print("Enter the temperature reading at " + hour + " hours: ");
            temp=scan.nextInt();
            if(temp >= 37.8 ){
                System.out.println("Corona infection detected. Using antiseptic spray...");
                antisepticSpray();
                break;
            }else{
                System.out.println("Congrats! You don't have the corona virus.");
                
            }
            
            if ( temp > maxTemp )
            {
                maxTemp = temp;
                
            }
            if ( temp < minTemp )
            {
                minTemp = temp;
                
            }
        }
       
        }
        
        public void Result(){
         //Print the results
        System.out.println("The maximum temperature was " + maxTemp + " degrees. It occurred at " + myObj + " o'clock.");
        System.out.println("The minimum temperature was " + minTemp + " degrees. It occurred at " + myObj + " o'clock.");
        
        
        }
        
     
        public void antisepticSpray(){
       System.out.println("Checking for amount of spray...");
       
       for (int amount = Spray_Meter - 1; amount >= 0; amount-- ){
           if(amount == 0){
               System.out.println("Amount of spray: 0. Please get an antiseptic spray and place it in the back of the wallet.");
               break;
           }else if(amount <= 3){
           System.out.println("You're almost out of antiseptic spray. Make sure to get one before it/s done.");
           promptEnterKey();
           System.out.println("Amount of spray available. Spraying area...");
           promptEnterKey();
           System.out.println("Operation Antiseptic Spray complete.");
           break;
           }else{
           System.out.println("Amount of spray available. Spraying area...");
           promptEnterKey();
           System.out.println("Operation Antiseptic Spray complete.");
           break;
           }
       
       }
       
       
}
   public void promptEnterKey(){
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        }
}

