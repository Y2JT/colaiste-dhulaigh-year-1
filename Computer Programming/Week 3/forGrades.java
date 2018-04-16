/**
 * @(#)forGrades.java
 *
 * Joey Tierney
 *
 * Using a loop, take in 5 grades and print the total
 *
 * @version 1.00 2014/10/8
 */

import java.util.Scanner;
public class forGrades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

		//declare variables
    	int i, grades, total=0, average;

    	//start the loop to take in grades
    	for(i=1; i<=5; i++){
    		System.out.print("Total grades " +i+ ": ");
    		grades = input.nextInt();
    		total = total + grades;
    	}//end for loop

		//get the average
		average = total/5;

		System.out.print("Average is " +average);
		System.out.println();

    	//Print total
       System.out.println("Total grades: " +total);

    }//end main method

}//end class