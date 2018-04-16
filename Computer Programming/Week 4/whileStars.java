/**
 * @(#)whileStars.java
 *
 * take in the users age using a while loop, print age amount of stars
 *
 * @author
 * @version 1.00 2014/10/17
 */

import java.util.Scanner;
public class whileStars {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

		//declare variables
    	int i = 1, age;

		//take input from the user
    	System.out.print("Enter your age: ");
    	age = input.nextInt();

		//start while loop
    	while(i<=age){
    		System.out.println("*");
    		i++;
    	}//end while


    }//end main method


}//end class