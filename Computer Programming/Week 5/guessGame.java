/**
 * @(#)guessGame.java
 *
 * Generate a random number 1-6, and let the user guess what the number is
 * Count the number of guesses
 * @version 1.00 2014/10/24
 */

import java.util.Scanner;
public class guessGame {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int guess=0;			//initialise guess to a value not in the range of 1-6
    	int num, goes = 0;

    	//generate the number
    	num = 1 + (int)(Math.random()*100);

    	while(guess != num){	//while the users guess is not equal to the random number
    		//prompt the user
    		System.out.print("Enter your guess: ");
    		guess = input.nextInt();

    		//increment the counter
    		goes++;

    	}//end while

    	System.out.println("\nIt took you " + goes + " guesses");
    	System.out.println();

    }//end main method

}//end class