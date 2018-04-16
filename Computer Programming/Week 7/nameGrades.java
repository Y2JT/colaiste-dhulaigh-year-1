/**
 * @(#)nameGrades.java
 * Joey Tierney
 * Take in 5 names and grades. Print all details and tell the user who got the highest and lowest grade.
 * @author
 * @version 1.00 2014/11/26
 */

import java.util.Scanner;
public class nameGrades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	//declare variables
    	int grades[] = new int[5], highest = -1, lowest = 101, i;
    	String names[] = new String [5];
    	String hname= "", lname= "";

    	//loop to take in names and grades
    	for(i = 0; i<grades.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in grade
    		System.out.print("Enter grade for " + names[i] + ": ");
    		grades[i] = input.nextInt();

    		//check if grade is the highest
    		if (grades[i] > highest){
    			highest = grades[i];	//hold onto the highest value
    			hname = names[i];
    		}//end if grade is the highest

    		//check if grade is the lowest
    		if (grades[i] < lowest){	//hold onto the lowest value
    			lowest = grades[i];
    			lname = names[i];
    		}//end if grade is the lowest

    	}//end for

    	//print the highest and lowest name
    	System.out.println(hname + " got the highest grade");
    	System.out.println(lname + " got the lowest grade");

    	//print all details
    	System.out.println("\nSubscript\tName\t\tGrade\n");
    	for (i = 0; i<names.length;i++){
    		System.out.println(i + "\t\t" + names[i] + "\t\t" + grades[i]);
    	}//end for

    }//end main method

}//end class