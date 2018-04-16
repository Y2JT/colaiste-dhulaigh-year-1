/**
 * @(#)homework23012015.java
 * Write a program to take in 5 grades and names. Check for non digits
 * Get the highest, lowest and average grade
 * Use a flag to tell the user if anyone failed
 *
 * @author
 * @version 1.00 2015/1/23
 */

import java.util.Scanner;
public class homework23012015 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[5];
    	String names[] = new String[5];
    	String strgrades;
    	int highest = 0, lowest = 100, average = 0, total = 0;
    	boolean flag = false;
    	
    	//loop to take in names and grades
    	for (int i = 0; i<names.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in grade
    		System.out.print("Enter grade for " + names[i] + ": ");
    		strgrades = input.next();
    		
    		//check for digits only
    		while(!strgrades.matches("\\d+")){
    			System.out.println("Error, numbers only");
    			java.awt.Toolkit.getDefaultToolkit().beep();
    			System.out.print("Enter grade for " + names[i] + ": ");
    			strgrades = input.next();
    		}//end while
    		
    		//change strgrades to an int
    		grades[i] = Integer.parseInt(strgrades);
    		
    		//check if anyone failed
    		if(grades[i] < 50){
    			flag = true;
    		}
    		
    		//check if grade is highest and lowest
    		if(grades[i] > highest){
    			highest = grades[i];
    		}
    		if(grades[i] < lowest){
    			lowest = grades[i];
    		}
    		
    		//get total
    		total+= grades[i];
    		
    	}//end for
    	
    	//get average
    	average = total/5;
    	
    	//print results
    	System.out.println("\nHighest grade achieved: " + highest);
    	System.out.println("\nLowest grade achieved: " + lowest);
    	System.out.println("\nAverage grade: " + average);
    	System.out.println();
    	
    	//tell the user if anyone failed
    	if(flag == true){
    		System.out.println("At least one person failed");
    	}
    	else{
    		System.out.println("No one failed");
    	}
    	
    	System.out.println();
    	
    	
    }//end main method


}//end class