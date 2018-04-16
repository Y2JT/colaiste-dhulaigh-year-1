/**
 * @(#)gradesCheck.java
 *
 * Take in 5 grades and store them in an array
 * Get the average grade
 * Check for non digits
 *
 * @version 1.00 2014/11/28
 */
import java.util.Date;
import java.util.Scanner;
public class gradesCheck {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	Date d = new Date();

    	int grades[] = new int[5];
    	String strgrade;
    	int total =0;

    	System.out.println("Logged in " + d + "\n\n");

    	//loop to take in the grades
    	for(int i = 0;i<grades.length;i++){
    		System.out.print("Enter grade " + (i+1) + ": ");
    		//take in grade as a string
    		strgrade = input.next();

    		//check strgrade contains only digits
    		while(!strgrade.matches("\\d+")){
    			System.out.println("Error, numbers only");
    			System.out.print("Enter grade " + (i+1) + ": ");
	    		//take in grade as a string
	    		strgrade = input.next();
    		}//end while

    		//change strgrade to an int
    		grades[i] = Integer.parseInt(strgrade);

    		//add the gradeto the total
    		total+= grades[i];
    	}//end for

    	//get average
    	System.out.println("The average is " + total/grades.length);

    }//end main method

}//end class