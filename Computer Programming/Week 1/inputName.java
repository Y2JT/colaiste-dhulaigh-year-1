/**
 * @(#)inputName.java
 *
 *Joey Tierney
 *
 *Take the name from the user and print "Hello X"
 *
 * @author
 * @version 1.00 2014/9/19
 */

import java.util.Scanner;	//needed to take inputs from the user
public class inputName {

    public static void main(String args[]) {

		Scanner input = new Scanner(System.in);	//needed to take inputs from the user

		//declare variables
		String name;

		//prompt the user for their name
		System.out.print("Enter your name : ");
		//take the value entered by the user and store it in variable "name"
		name = input.nextLine();

		System.out.println("Hello " + name);

    }//end main method


}//end class