/**
 * @(#)forCondition.java
 *
 *
 *	Take in the number of grades you need to enter and have a loop
 *  to take in that many grades. Print the total of the grades
 *
 * @author
 * @version 1.00 2014/10/15
 */

import java.util.Scanner;
public class forCondition {

    public static void main(String args[]) {

		//declare variables
    	Scanner input = new Scanner(System.in);
    	int grades, total = 0, numgrades;
    	int passes = 0;
    	int fails = 0;

    	System.out.print("Enter the number of grades: ");
    	numgrades = input.nextInt();

		//loop to take in numbers
    	for(int i = 1; i<= numgrades; i ++){
			System.out.print("Enter grade " + i + ": ");
			grades = input.nextInt();
			//check if grade is a pass or fail
			if (grades>49){
				passes ++;
			}
			else{
				fails++;
			}
		    //add the grade to the total
		    total = total + grades;		//or total += grade;
    	}//end for

		System.out.println("The total of the grades is: " + total);
		System.out.println("The number of passes is: " + passes);
		System.out.println("The number of fails is: " +fails);

    }//end main method

}//end class