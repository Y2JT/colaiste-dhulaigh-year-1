/**
 * @(#)gradesNames.java
 * Joey Tierney
 * Take in 10 grades and names. Print all the names with the highest grades
 * @version 1.00 2014/12/10
 */

import java.util.Scanner;
public class gradesNames {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[10];
    	String names[] = new String[10];

    	int highest = 0;

    	//loop to take in names and grades
    	for(int i = 0; i < names.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in grade
    		System.out.print("Enter grade for " + names[i] + ": ");
    		grades[i] = input.nextInt();

    		//check if grade is the highest
    		if(grades[i] > highest){
    			highest = grades[i];
    		}//end if

    	}//end for

    	System.out.println("\nName(s) who got the higesht grade:");
    	System.out.println("\n\nName\t\tGrade");
    	for(int i = 0; i < grades.length; i++){
    		if(grades[i]==highest){
    			System.out.println(names[i] + "\t" + grades[i]);
    		}
    	}//end for

    	System.out.println();	//print a blank line

    }//end main method


}//end class