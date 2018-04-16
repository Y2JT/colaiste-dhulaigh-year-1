/**
 * @(#)flag.java
 *
 * Take in 5 grades and use a flag to tell the user if anyone failed
 * @version 1.00 2014/10/22
 */

import java.util.Scanner;
public class flag {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

		int grade;
    	boolean failedflag = false;		//flag to see if someone failed

    	for (int i = 1;i<=5;i++){
    		System.out.print("Enter grade: ");
    		grade = input.nextInt();

    		//check if grade is a fail
    		if (grade <50){
    			failedflag = true;
    			//stop the loop
    			break;
    		}//end if

    	}//end for

    	//check the value of failedflag
    	if (failedflag == true){
    		System.out.println("\nSomeone failed");
    	}
    	else{
    		System.out.println("\nNo one failed");
    	}

    }//end main method


}//end class