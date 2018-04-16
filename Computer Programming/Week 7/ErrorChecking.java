/**
 * @(#)ErrorChecking.java
 *
 * Take in an age and see if the person is old enough to vote
 * Check for non digits
 *
 * @version 1.00 2014/11/28
 */

import java.util.Scanner;
public class ErrorChecking {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int age;
    	String strage;	//String str age will hold the first string input & will be checked for non digits

    	System.out.print("Enter age: ");
    	//take in age as a String
    	strage = input.next();

    	//loop to check strage only contains digits
    	while(!strage.matches("\\d+")){
    		System.out.println("Error, numbers only");
    		System.out.print("Enter age: ");
    		//take in age as a String
    		strage = input.next();
    	}//end while

    	//change strage to int age
    	age = Integer.parseInt(strage);

    	//check if the user can vote
    	if (age>17){
    		System.out.println("You can vote");
    	}
    	else{
    		System.out.println("To young to vote");
    	}

    }//end main method


}//end class