/**
 * @(#)question3.java
 * Write aprogram to take in 5 grades
 * Tell the user the number of passes and fails
 * Validate all grade inputs
 *
 * @author 
 * @version 1.00 2015/2/24
 */

import java.util.Scanner;
public class question3 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[5];
    	String names[] = {"Rick", "Daryl", "Phillip", "Merle", "Shane"};
    	String pass= "\nNumber of passes are:";
    	String fails = "\nNumber of fails are:";
    	String strgrades;
    	int sub = 0;
    	
    	//loop to take in grades
    	for(int i = 0; i<names.length; i++){
    		System.out.print("Enter grade for " + names[i] + ": ");
    		strgrades = input.next();
    		//validate
    		while(!strgrades.matches("\\d+")){
    			System.out.println("ERROR: Numbers only!");
    			System.out.print("Enter grade for " + names[sub] + ": ");
    			strgrades = input.next();
    		}//end while
    		//parse int
    		grades[i] = Integer.parseInt(strgrades);
    		
    		if(grades[i]>49){
    			pass+= names[i] + "\t" + grades[i];
    		}
    		else{
    			fails+=names[i] + "\t" + grades[i];
    		}
    		
    	}//end for
    	
    	System.out.println(pass + "\n" + fails);
    	
    	
    	
    	
    }//end main method
    
    
}//end class