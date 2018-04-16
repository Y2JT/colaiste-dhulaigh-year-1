/**
 * @(#)question2.java
 * Write a program that will take in 5 names and grades
 * Get the highest, lowest and average grade
 * Validate the grades
 * Show the highest, lowest and average grade
 *
 * @author 
 * @version 1.00 2015/2/24
 */

import java.util.Scanner;
public class question2 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[5];
    	String names[] = new String[5];
    	String strgrades;
    	int highest = 0, lowest = 100, average = 0, total = 0;
    	
    	//loop to take in names and grades
    	for(int i =0;i<names.length;i++){
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.next();
    		//take in grade
    		System.out.print("Enter grade for " + names[i] + ": ");
    		strgrades = input.next();
    		//validate grade
    		while(!strgrades.matches("\\d+")){
    			System.out.println("ERROR, NUMBERS ONLY");
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			System.out.print("Enter grade for " + names[i] + ": ");
    			strgrades = input.next();
    		}//end while
    		
    		//parse int
    		grades[i] = Integer.parseInt(strgrades);
    		
    		//check if grade is highest and lowest
    		if(grades[i]>highest){
    			highest = grades[i];
    		}
    		if(grades[i]<lowest){
    			lowest = grades[i];
    		}
    		
    		//get total
    		total+=grades[i];
    	}//end for
    	
    	//get average
    	average = total/5;
    	
    	//print results
    	System.out.println("\nHighest grade achieved: " + highest);
    	System.out.println("\nLowest grade achieved: " + lowest);
    	System.out.println("\nAverage grade: " + average);
    	System.out.println();
    	
    }//end main method
    
    
}//end class