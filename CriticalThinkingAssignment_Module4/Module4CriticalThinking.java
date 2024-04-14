
import java.util.Scanner ;

public class Module4CriticalThinking {

	public static void main(String[] args) {
		
  
   // variable declarations
	  
   double grade,sumGrades, averageGrade , minGrade , maxGrade ;
   
       
   sumGrades=0 ; 
   averageGrade =0 ; 
   minGrade =Double.MAX_VALUE; 
   maxGrade=Double.MIN_VALUE;
   int count =10;    
       
       Scanner kb = new Scanner(System.in);
       
       System.out.println("Enter 10 grades: \n");
       
       for(int i=0;i<count;i++) {
    	   
    	  System.out.println("Enter grade "+(i+1)+" : ");
    	  
    	// Input validation 
          while (!kb.hasNextDouble()) {
              System.out.println("Invalid input. Please enter a numeric grade:");
              kb.next(); // Discard non-numeric input
              System.out.print("Enter grade " + i + ": ");
          }
    	  
    	  
    	  grade=kb.nextDouble();
    	  
    	  sumGrades = sumGrades+grade;
    	  
    	  if(maxGrade<grade) {
    		  
    		  maxGrade=grade;
    	  }
    	  if(minGrade>grade) {
    		  
    		  minGrade=grade;
    	  }
    	   
        }
       
       averageGrade = sumGrades/10;
       
       System.out.println("Here are the results of the computations: ");
       System.out.println("Sum = "+sumGrades);
       System.out.println("Average = "+averageGrade);
       System.out.println("Maximum = "+maxGrade);
       System.out.println("Minimum = "+minGrade);
       

	}
}

/* 
 * 
 *  Start

Initialize maxGrade to very small number (e.g., -infinity)
Initialize minGrade to very large number (e.g., +infinity)
Initialize sumGrades to 0
Set count = 10  // Number of grades to read

Print "Please enter 10 grades:"

For i from 1 to count:
    Prompt "Enter grade " + i + ": "
    Read grade
    While grade is not a valid floating-point number:
        Print "Invalid input. Please enter a numeric grade:"
        Read grade

    // Update sum, max, and min
    Add grade to sumGrades
    If grade > maxGrade:
        Set maxGrade to grade
    If grade < minGrade:
        Set minGrade to grade

Calculate averageGrade as sumGrades / count

Print "Average grade: " + averageGrade
Print "Maximum grade: " + maxGrade
Print "Minimum grade: " + minGrade

End
 * 
 * 
 * */
 