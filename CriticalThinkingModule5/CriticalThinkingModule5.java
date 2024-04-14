package CriticalThinkingModule5;

import java.util.Random;
import java.util.Scanner;

public class CriticalThinkingModule5 {

	public static void main(String[] args) {
		
	//Declare both arrays 
		
	 final int NUM_MONTHS = 12;
	
	 
	//initialize the month array
	String []	monthList = {
	        "January", "February", "March", "April", "May", "June", 
	        "July", "August", "September", "October", "November", "December"};
	
	// declare the temperature array
	double []   temperatureList = new double [NUM_MONTHS];
	  
	
	// A random temperature will be picked from -20 to 183 _ these are the lowest and highest temperatures last year in the US
	  Random rand = new Random();  // Instance of Random class
      int min = -20;
      int max = 183;
      
	
	    for(int i=1; i<= NUM_MONTHS;i++) {
	    	
	    	      temperatureList[i-1]=rand.nextInt(max - min + 1) + min;  
	   
	           };
	  
	 
	  // the variable that will hold the user input         
	  String userInput ;
	  
	  Scanner kb = new Scanner(System.in);
	           
	  System.out.println("Enter the month for the temperature to be viewed or enter 'year', to view all months:");
	  
	  userInput = kb.next();
	  
	  // we initialize a boolean variable to check for input validity
	  boolean validInput = false;
	  

	  // we loop through the month array to make sure the input is valid
	  for (String item : monthList) {
		  
		  if(item.equalsIgnoreCase(userInput)|| userInput.equalsIgnoreCase("year")) {
			  
			  validInput = true;
			  break;
		      }
		  };
		  
    
	 // prompt the user to re-enter in case input is not valid	  
	 while(!validInput) {
    	 
    	 System.out.println("\nInput not Valid ");
    	
    	 System.out.println("Enter the month for the tempersture to be viewed or enter 'year', to view all months :");
    	 
    	 userInput = kb.next();
    	 
    	 for (String item : monthList) {
   		  
   		  if(item.equalsIgnoreCase(userInput)|| userInput.equalsIgnoreCase("year")) {
   			  
   			  validInput = true;
   			  break;
   		      }
   		  };   
     
         }
     
     
	 // we print results
	 
	  System.out.println("\n  MONTH           AVERAGE-TEMPERATURE");
      System.out.println("----------------------------------------");
     
     int count = 0;
     
     for (String item : monthList) {
		  
		  if(item.equalsIgnoreCase(userInput)) {
			  
			  System.out.printf("%-15s : %6.2f°F\n", item, temperatureList[count]);
			  break;
		      }
		  
		  else if(userInput.equalsIgnoreCase("year")) {
			 
			  System.out.printf("%-15s : %6.2f°F\n", item, temperatureList[count]);
			  
			  count++;
			  
		  }
	  kb.close();	  
		 
     };
 
	
	
	
	}
		  
		  
	};
	
	
	/*
	 * 
	 * Start

Declare and initialize constant NUM_MONTHS as 12
Declare and initialize monthList with month names (January to December)
Declare temperatureList as array of double with size NUM_MONTHS

Initialize Random instance for temperature generation
Set temperature range with min = -20 and max = 183

For each month from 1 to NUM_MONTHS:
    Generate random temperature and store in temperatureList at index i-1

Declare userInput
Initialize Scanner for input

Prompt user for month or 'year' to display temperatures
Read userInput

Declare validInput as false

Check if userInput matches any month in monthList or is 'year':
    If a match is found:
        Set validInput to true
        Break the loop

While not validInput:
    Print invalid input message
    Prompt again for correct month or 'year'
    Read userInput
    Repeat check for valid month names or 'year'

Print header for results

If userInput is 'year':
    Declare count as 0
    For each month in monthList:
        Print month and corresponding temperature from temperatureList
        Increment count
Else:
    Find index of userInput in monthList
    Print userInput month and corresponding temperature from temperatureList

End
	 * 
	 * */

	


