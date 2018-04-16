/**
 * @(#)highLowGrade.java
 *
 * Joey Tierney
 *
 * Take in 5 grades from the user and print the highest and the lowest
 *
 * @author
 * @version 1.00 2014/10/8
 */

import java.util.Scanner;
public class highLowGrade {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int grade, high=0, low=100;

    	//loop to take in the grades
    	for(int i=1;i<=5;i++){
    		System.out.print("Enter grade " + i + " : ");
    		grade = input.nextInt();

			//compare grade to high
    		if(grade > high){
    			high = grade;
    		}

    		//compare grade to low
    		if(grade < low){
    			low = grade;
    		}

    	}//end for loop

    	System.out.println("Highest grade is "+ high);
    	System.out.println("Lowest grade is " + low);

    }//end main method

}//end class