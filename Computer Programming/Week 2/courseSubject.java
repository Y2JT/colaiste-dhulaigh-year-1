/**
 * @(#)courseSubject.java
 * Joey Tierney
 *
 * Declare variables to hold your course name and favourite subject
 * Take the values from the user
 * Print out these values
 *
 * @author
 * @version 1.00 2014/9/26
 */

import java.util.Scanner;
public class courseSubject {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	String course;
    	String subject;

    	//or we could declare variables as
    	//String course, subject;

    	System.out.print("Enter your course name: ");
    	course = input.nextLine();

    	System.out.print("Enter your favourite subject: ");
    	subject = input.nextLine();

    	System.out.println("Your course is " + course);
    	System.out.println("Your favourite subject is " + subject);

    	//print a blank line
    	System.out.println();

    }//end main method


}//end class