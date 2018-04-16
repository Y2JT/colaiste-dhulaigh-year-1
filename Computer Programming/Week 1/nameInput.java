/**
 * @(#)nameInput.java
 * Joey Tierney
 *
 * Declare name as String variable
 * Take name from user
 * Print name
 *
 * @author
 * @version 1.00 2014/9/24
 */

import java.util.Scanner;
public class nameInput {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

		//declare variables
    	String name;

		//prompt user for name
    	System.out.print("Enter your name : ");
    	name = input.nextLine();

    	System.out.println("Hello " + name);

    }//end main method


}//end class