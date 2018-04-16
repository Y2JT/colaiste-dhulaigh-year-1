/**
 * @(#)backwards.java
 * Generate 5 random numbers between 1 and 20, store them in an array
 * Ask the user to enter in a number from 1-5 (validate 1-5)
 * If the user entered 3, you should print the numbers backwards from -
 * the number stored in the array subscript (3-1)
 * If the user entered 2, you should print the numbers backwards from -
 * the number stored in the array subscript (2-1)
 * If the user entered 1, you should print the numbers backwards from -
 * the number stored in the array subscript (1-1)
 * @author
 * @version 1.00 2015/1/28
 */

import java.util.Scanner;
public class backwards {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int nums[] = new int[5];
    	int usernum;
    	String strusernum;

		//loop to generate random number
    	for(int i = 0; i<nums.length; i++){
    		nums[i] = 1 + (int)(Math.random()*20);
    	}//end for

    	//take a number from the user
    	System.out.print("Enter a number between 1 and 5: ");
    	strusernum = input.next();

    	//validate number
    	while(!strusernum.matches("[1-5]")){
    		System.out.println("Error, numbers 1-5 only");
    		//take input from user
    		System.out.print("Enter a number between 1 and 5: ");
    		strusernum = input.next();
    	}//end while

    	//change to an int
    	usernum = Integer.parseInt(strusernum);

    	int startnum = nums[usernum-1];

    	//use a loop to print from the number back to 1
		for(int i = startnum; i>0; i--){
			System.out.println(i);
		}

    }//end main method


}//end class