/**
 * @(#)checkGrades.java
 *
 * Take in 5 grades and store them in an array
 * If the grade entered is less than 0 or greater than 100, the grade should be set to 0
 * Get the average grade
 * Tell the user how many grades were set to the default value
 *
 * @version 1.00 2014/12/3
 */

import java.util.Scanner;
public class checkGrades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare variables
    	int grades[] = new int[5];
    	int i, total = 0, checkgrade = 0, counter = 0;

    	//loop to take in the grades
    	for(i = 0; i<grades.length; i++){
    		System.out.print("Enter grade " + (i+1) + ": ");
    		checkgrade = input.nextInt();
			//if checkgrade is greater than 100 or less than 0
    		if(checkgrade > 100 || checkgrade < 0){
    			counter++;	//increment counter
    			System.out.println("Out of range, setting to the default value of 0");
    			checkgrade = 0;
    		}//end if

    		//give the value of checkgrade to grades[]i
    		grades[i] = checkgrade;

    		//add to the total
    		total += grades[i];

    	}//end for

    	System.out.println("The average grade is: " + total/5);
    	System.out.println("There was " + counter + " grades set to default");

    }//end main method


}//end class