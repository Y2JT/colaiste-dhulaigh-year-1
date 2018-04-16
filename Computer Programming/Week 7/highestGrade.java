/**
 * @(#)highestGrade.java
 *
 * Take in 5 grades and names and print the person(s) with the highest grade
 *
 * @version 1.00 2014/11/28
 */

import java.util.Scanner;
public class highestGrade {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int grades[]= new int[5];
    	String names[] = new String[5];

    	int highest = 0;

    	//loop to take in the grades and names
    	for(int i=0;i<names.length;i++){
    		System.out.print("Enter name: ");
    		names[i] = input.next();
    		System.out.print("Enter grade: ");
    		grades[i] = input.nextInt();

    		//check if grade is the highest
    		if(grades[i]>highest){
    			highest = grades[i];
    		}//end if
    	}//end for

    	//loop to print the name(s) who got the highest grade
    	System.out.println("\n\nName(s) who got the highest grade\n");
    	for(int i=0;i<grades.length;i++){
    		if(grades[i]==highest){
    			System.out.println(names[i]);
    		}//end if

    	}//end for

    }//end main method

}//end class