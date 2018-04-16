/**
 * @(#)HighLowGrades.java
 *
 *
 * @author
 * @version 1.00 2014/10/10
 */

import java.util.Scanner;
public class HighLowGrades {

    public static void main(String args[]) {


		//declare Variables
    	Scanner input = new Scanner(System.in);
    	int students, i , grade;
    	int Low = 100;
    	int High = 0;
    	int average = 0;

		//Prompt user for number of students
    	System.out.println("Enter number of Students : ");
    	students = input.nextInt();

		//Loop for Grade input
    	for (i = 1; i <= students; i ++){

    		System.out.println("Enter Grade " + i + " : ");
    		grade = input.nextInt();

    		if (grade<Low){
    			Low = grade;
    		}
    		if (grade>High){
    			High = grade;
    		}
    		average = average + grade;

    	}//end for

    	i = students;

    	//Calculate average
    	average = average/students;

    	//print results-
    	System.out.println("\nNumber of students in class : " + i);
    	System.out.println("Highest Grade : " + High);
    	System.out.println("Lowest Grade : " + Low);
    	System.out.println("Average Grade : " + average);

    }//end method


}//end class