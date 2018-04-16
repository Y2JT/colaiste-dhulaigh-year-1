/**
 * @(#)password.java
 *
 * Keep taking a [assword from the user until they enter the correct password
 *
 * @version 1.00 2014/11/28
 */

import java.util.Scanner;
public class password {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	String password = "student203";
    	int goes=0;

    	String pass="";		//used to take the password from the user

    	//take a password from the user
    	System.out.print("Enter password: ");
    	pass = input.next();

    	while(!pass.matches(password)){		//while pass does not match "student203"
    		goes++;	//add one to goes
    		if(goes==3){
    			System.out.println("To many attempts, program closing");
    			System.exit(0);		//terminate the program
    		}//end if
    		System.out.println("Incorrect password, please try again");
    		System.out.print("Enter password: ");
    		pass = input.next();
    	}//end while

    	System.out.println("Hello");

    }//end main method


}//end class