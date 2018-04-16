/**
 * @(#)doWhile.java
 * Take a password from the user using a do while loop
 * A do while loop will always execute at least once
 *
 * @author
 * @version 1.00 2015/1/21
 */

import java.util.Scanner;
public class doWhile {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	String pass;	//user input
    	String password = "Password123";

    	do{
    		System.out.print("Enter password: ");
    		pass = input.next();
    	}
    	while(!pass.matches(password));

    	//if the user gets to here they have the password correct
    	System.out.println("Welcome");

    }//end main method


}//end class