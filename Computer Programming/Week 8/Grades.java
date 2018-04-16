/**
 * @(#)Grades.java
 *
 * Take 5 names and grades. Store them in an array
 * Take a number from the user and show all names & grades above this number
 * @version 1.00 2014/12/3
 */

import java.util.Scanner;
public class Grades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare variables
    	int grades[] = new int[5];
    	String names[] = new String[5];
    	int number;
    	String aname = "";

    	//loop to take in names and grades
    	for(int i = 0; i<grades.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in grade
    		System.out.print("Enter grade for " + names[i] + ": ");
    		grades[i] = input.nextInt();

    	}//end for

		//prompt user for number
		System.out.print("\nEnter a number from 1 to 100: ");
		number = input.nextInt();

		//loop to check if grade is higher than number
		System.out.println("\n\nPeople who scored above " + number);
		System.out.println();	//print a blank line
		for(int i = 0; i<grades.length; i++){
			if(grades[i] > number){
				System.out.println(names[i] + "\t\t" + grades[i]);
			}//end if

		}//end for

    }//end main method

}//end class