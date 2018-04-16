/**
 * @(#)ifTest2.java
 * Joey Tierney
 *
 * Check what grade the user got using if, else if and else
 * @author
 * @version 1.00 2014/9/24
 */

import java.util.Scanner;
public class ifTest2 {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int grade;

    	//prompt use for grade
    	System.out.print("Enter grade: ");
    	//take in grade
    	grade = input.nextInt();

    	//check the grade
    	if(grade > 79){
    		System.out.println("You got a Distinction!");
    	}
    	else if (grade > 64){
    		System.out.println("You got a Merit!");
    	}
    	else if (grade > 49){
    		System.out.println("You got a Pass!");
    	}
    	else{
    		System.out.println("You Failed...");
    	}

    }//end main method


}//end class