/**
 * @(#)login.java
 *
 * Ask a person to login using a pin and display their details
 * Tell the user if their pin was not found
 *
 * @version 1.00 2015/1/14
 */

import java.util.Scanner;
public class login {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare variables
    	int pins[] = {123, 234, 345};
    	int balance[] = {400, 300, 500};
    	String names[] = {"Ciaran","Fred","Ted"};

    	int userpin;

    	boolean found = false;
    	int sub = 0;

    	//take in a pin from the user
    	System.out.print("Enter pin: ");
    	userpin = input.nextInt();

    	//loop to check the array for the userpin
    	for(int i = 0; i<pins.length; i++){
    		//check each subscript to see if it matches userpin
    		if(userpin==pins[i]){
    			//change the value of the flag
    			found = true;
    			//hold onto the vaule of i
    			sub = i;
    			//stop searching the loop
    			break;
    		}//end if

    	}//end for

    	//after the loop check if the flag is still false i.e. no pin matched the userpin
    	if(found==false){
    		System.out.println("Pin was not found");
    		//end the program
    		System.exit(0);
    	}//end if

		//print the user details
    	System.out.println("Welcome " + names[sub] + "\nBalance is: " + balance[sub]);
    	System.out.println("After updating the balance ");
    	//add to the balance
		balance[sub] = balance[sub] + 20;	//balance[sub] +=20
		System.out.println("New balance is: " + balance[sub]);

    }//end main method


}//end class