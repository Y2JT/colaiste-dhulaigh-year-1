/**
 * @(#)compareString.java
 *
 * Take a String input from the user to see if they want to start taking in grades
 * @version 1.00 2014/10/22
 */

import java.util.Scanner;
public class compareString {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	String choice;
    	int grade, total = 0, i=1;

    	//prompt the user for an input Y or N
    	System.out.print("Do you want to enter grades? (Y/N): ");
    	choice = input.next();

    	//change choice to upper case
    	choice = choice.toUpperCase();

    	//cehck what value choice is
    	if(choice.matches("Y")){
    		//start loop to take in grades
    		while(i<6){			//for (i=1;i<=5;i++){
    			System.out.print("Enter grade: ");
    			grade = input.nextInt();
    			total += grade;
    			i++;			//not needed for a for loop
    		}//end while		//}//end for

    		System.out.println("Total is " + total);
    	}//end if
    	else{
    		System.out.println("Program ending");
    		//terminate the program
    		System.exit(0);
    	}//end else

    }//end main method

}//end class