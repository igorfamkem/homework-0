

import java.util.Scanner;

public class CSC320Assignments {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
     /*
       
    PSEUDOCODE
        
     BEGIN
    Prompt user for weekly income
    Read weeklyIncome
    
    IF weeklyIncome < 500 THEN
        taxRate = 0.10
    ELSE IF weeklyIncome >= 500 AND weeklyIncome < 1500 THEN
        taxRate = 0.15
    ELSE IF weeklyIncome >= 1500 AND weeklyIncome < 2500 THEN
        taxRate = 0.20
    ELSE IF weeklyIncome >= 2500 THEN
        taxRate = 0.30
    END IF
    
    taxWithholding = weeklyIncome * taxRate
    
    Print "Your weekly tax withholding is: $" + taxWithholding
    END
      * */		
	
	
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the Weekly income :");		
		
		double weeklyIncome = kb.nextDouble();
		
		double taxRate;
		
		if(weeklyIncome < 500) {
			
			taxRate = .10;
			
		    }
		else if(weeklyIncome>500 && weeklyIncome<1500) {
			
			
			taxRate = 0.15;
			
		   }
		
		else if(weeklyIncome>1500 && weeklyIncome<2500) {
			
			taxRate = 0.20;
			
		  }
		
		
		else {
			
			taxRate = 0.3;
			
			
			}
		
		double weeklyTaxWithholding = 0;
		
		weeklyTaxWithholding = weeklyIncome * (taxRate);
		
		System.out.println("The Tax withholding for someone with a weekly income of $"+weeklyIncome
				+" is $"+ weeklyTaxWithholding);
		
		
		
	}

}
