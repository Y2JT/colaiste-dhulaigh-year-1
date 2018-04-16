/**
 * @(#)passesFails.java
 * Joey Tierney
 * Take in 3 grades, tell the user how many passes and fails there were 
 * @version 1.00 2014/10/25
 */

import java.util.Scanner;
public class passesFails {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades, i;
    	int passes = 0;
    	int fails = 0;
    	
    	//for loop to take in grades
    	for(i=1;i<=3;i++){
    		System.out.print("Enter grade " + i + ": ");
    		grades = input.nextInt();
    		
    		//check if grade is pass or fail
    		if(grades>49){
    			passes++;
    		}
    		else{
    			fails++;
    		}
    	}//end for
    	
    	System.out.println("\nNumber of passes: " + passes);
    	System.out.println("Number of fails: " + fails);
    	
    	
    	
    }//end main method
    
    
}//end class