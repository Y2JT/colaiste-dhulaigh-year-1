/**
 * @(#)grades2.java
 * Joey Tierney
 * Take in 5 names and grades, tell the user the names of the people who scored above average
 * @author
 * @version 1.00 2015/1/9
 */

import java.util.Scanner;
public class grades2 {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int grades[] = new int[5];
    	String names[] = new String[5];
    	int total = 0, average = 0;

    	//loop to take in names and grades
    	for(int i = 0; i<names.length; i++){
    		if(i!=0){				//if i is not zero
    			input.nextLine();	//read a blank line
    		}//end if(i!=0)
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//loop for grades
    		System.out.print("Enter grade for " + names[i] + ": ");
    		grades[i] = input.nextInt();

    		//get total
    		total = total + grades[i];

    	}//end for

    	//get average
    	average = total/grades.length;
    	System.out.println("\nAverage grade is " + average);

		//people who got above average
    	System.out.println("\nPeople who scored above average");
    	System.out.println("\n\nName\t\tGrade");
    	//loop to check who got above average
    	for(int i = 0; i<grades.length; i++){
    		if(grades[i]>average){
    			System.out.println(names[i] + "\t" + grades[i]);
    		}
    	}//end for

    	System.out.println();	//print blank line

    }//end main method


}//end class