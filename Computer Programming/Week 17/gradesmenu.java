/**
 * @(#)gradesmenu.java
 * Write a program to take in 5 grades. Check for non-digits
 * Have a menu to ask: 1. View Highest Grade, 2. View Lowest, 3. View Average, 4. Exit
 * @version 1.00 2015/2/11
 */

import java.util.Scanner;
import java.util.Date;
public class gradesmenu {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[5];
    	String strgrades;
    	String strchoice;
    	int highest = 0, lowest = 100, average = 0, total = 0, choice = 0;

    	Date d = new Date();
    	System.out.println(d);
    	System.out.println();

		for(int i =0; i<grades.length; i++){
		System.out.print("*************************");
    	System.out.print("\nPlease Enter Grade " + (i+1) + ": ");
    	strgrades = input.next();

    	//validate grades
    	while(!strgrades.matches("\\d+")){
    		System.out.println("Error, numbers only");
    		System.out.print("Please Enter Grade " + (i+1) + ": ");
    		strgrades = input.next();
    	}//end while

    	//parse Int
    	grades[i] = Integer.parseInt(strgrades);

		//check for the highet grade
    	if(grades[i]>highest){
    		highest = grades[i];
    	}//end if
		//check for the lowest grade
    	if(grades[i]<lowest){
    		lowest = grades[i];
    	}//end if

    	//get total
    	total = total + grades[i];
	}//end for

		//get average
    	average = total/5;

		System.out.println("\n********** School Grading Main Menu **********");
		//print menu
		while(choice!=4){
			System.out.print("\nWhat would you like to do?\n1) View Highest Grade \n2) View Lowest Grade \n3) View Average \n4) Exit\n>");
			strchoice = input.next();
			//validate menu input
			while(!strchoice.matches("[1-4]")){
				System.out.print("\nERROR: Enter numbers 1 - 4 only!");
				System.out.print("\nEnter your choice: ");
				strchoice = input.next();
			}//end while
			choice = Integer.parseInt(strchoice);
			//choice 1
			if(choice==1){
				System.out.println("\nHighest grade is: " + highest);
			}//end choice 1
			else if(choice==2){
				System.out.println("\nLowest grade is: " + lowest);
			}//end choice 2
			else if(choice==3){
				System.out.println("\nAverage grade is: " + average);
			}//end choice 3
		}//end while

		System.out.println("\nThank you for using the School Grading Menu. \n\nPROCESS ENDING...");
		System.out.println();

    }//end main method


}//end class