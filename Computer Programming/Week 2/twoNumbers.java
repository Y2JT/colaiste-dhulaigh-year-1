/**
 * @(#)twoNumbers.java
 * Joey Tierney
 *
 * Take 2 numbers from the user and add them
 *
 * @author
 * @version 1.00 2014/9/26
 */

import java.util.Scanner;
public class twoNumbers {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare variables
    	int num1;
    	int num2;
    	int total=0;

    	//prompt the user
    	System.out.print("Enter number 1: ");
    	num1 = input.nextInt();

    	System.out.print("Enter number 2: ");
    	num2 = input.nextInt();

		//add the numbers
		total = num1 + num1;

		System.out.println("Total is " + total);


    }//end main method


}//end class