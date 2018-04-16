/**
 * @(#)passwordQ6.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class passwordQ6 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	String password = "Enter";
    	String pass = "";	//used to take the password from the user
    	
    	//take a password from the user
    	System.out.print("Enter password: ");
    	pass = input.next();
    	
    	while(!pass.matches(password)){	//whille pass does not match "Enter"
    		System.out.println("Incorrect password, please try again");
    		System.out.print("Ener password: ");
    		pass = input.next();
    	}//end while
    	
    	System.out.println("Hello");
    	
    }//end main method
    
    
}//end class