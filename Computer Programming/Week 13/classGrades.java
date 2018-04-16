/**
 * @(#)classGrades.java
 *
 * Ask the user how many grades to enter. Store them in arrays
 * Set the length of the arrays after the user enters the number of grades
 * Check for non-digits
 * @version 1.00 2015/1/14
 */

import java.util.Scanner;
public class classGrades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int numgrades;

    	System.out.print("Enter the number of grades: ");
    	numgrades = input.nextInt();

    	//declare arrays
    	int grades[] = new int[numgrades];	//assign the length of the array to numgrades
    	int total =0;
    	String strgrade;	//taking in the grade as a String to check for non-digits

    	//loop to take in the grades
    	for(int i = 0; i<grades.length; i++){
    		//prompt user for input
    		System.out.print("Enter grade " + (i+1) + ": ");
    		strgrade = input.next();

    		//check strgrade contains only digits
    		while(!strgrade.matches("\\d+")){
    			System.out.println("Error, numbers only");
    			//prompt user for input
    			System.out.print("Enter grade " + (i+1) + ": ");
    			strgrade = input.next();
    		}//end while

    		//change strgrade to an int
    		grades[i] = Integer.parseInt(strgrade);
    		//add grades[i] to the total
    		total += grades[i];
    	}//end for

    	//print the total
    	System.out.println("\nTotal is " + total +"\n");

    }//end main method

}//end class