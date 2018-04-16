/**
 * @(#)changeArrays.java
 * Print out the array details and ask the user what grade they want to change (1-5)
 * Change the grade and print all the array values again
 *
 * @author
 * @version 1.00 2015/1/30
 */

import java.util.Scanner;
public class changeArrays {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	String names[] = {"Bill", "Ben", "Ted", "Fred", "John"};
    	int grades[] = {30,55,90,37,62};

    	System.out.println("\nNumber\tName\tGrade\n\n");
    	for(int i = 0; i<grades.length;i++){
    		System.out.println((i+1)+ "\t" + names[i] + "\t" + grades[i] + "\n");
    	}//end for

    	System.out.print("Enter number of grade to change: ");
    	int num = input.nextInt();

    	System.out.print("\nEnter the new grade: ");
    	int newgrade = input.nextInt();

    	grades[num-1] = newgrade;	//take 1 from num to get the correct subscript

    	//print out array
    	System.out.println();
    	System.out.println("\nNumber\tName\tGrade\n\n");
    	for(int i = 0; i<grades.length;i++){
    		System.out.println((i+1)+ "\t" + names[i] + "\t" + grades[i] + "\n");
    	}

    }//end main method


}//end class