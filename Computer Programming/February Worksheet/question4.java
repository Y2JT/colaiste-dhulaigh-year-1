/**
 * @(#)question4.java
 * Write a program to roll a dice
 * Ask the user to keep guessing what was rolled until they guess correctly
 * Check the user only enters 1-6
 * Tell the user how many guesses they took
 *
 * @author 
 * @version 1.00 2015/2/24
 */

import java.util.Scanner;
public class question4 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int guess = 0;
    	int dice, goes = 0;
    	String strguess;
    	
    	//roll dice
    	dice = 1 + (int)(Math.random()*6);
    	while(guess!=dice){
    		System.out.print("Please enter your guess: ");
    		strguess = input.next();
    		goes++;
    		//validate
    		while(!strguess.matches("[1-6]")){
    			System.out.println("ERROR: Only 1-6 can be entered!");
    			System.out.print("Please enter your guess: ");
    			strguess = input.next();
    		}//end while validation
    		//prase int
    		guess = Integer.parseInt(strguess);
    	}//end while
    	
    	System.out.println("\nIt took you " + goes + " guesses");
    	System.out.println();
    	
    }//end main method
    
    
}//end class