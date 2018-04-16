/**
 * @(#)nameAddress2.java
 * Joey Tierney
 *
 * Declare name and address as String variables
 * Take the name and address from the user
 * Print the users name and address
 * @version 1.00 2014/9/19
 */

import java.util.Scanner;	//needed to take inputs from user
public class nameAddress2 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	//declare variables
    	String name;
    	String address;
    	
    	//prompt the user for their name
    	System.out.print("Enter your name : ");
    	name = input.nextLine();
    	
    	//prompt the user for their address
    	System.out.print("Enter your address : ");
    	address = input.nextLine();
    	
    	System.out.println("Hello " + name + ", you are from " + address);


    }//end main method


}//end class