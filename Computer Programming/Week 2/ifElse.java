/**
 * @(#)ifElse.java
 * Joey Tierney
 *
 * Take a persons age and see if they can vote using an if else
 *
 * @author
 * @version 1.00 2014/9/24
 */

import java.util.Scanner;  //needed for inputing
public class ifElse {

    public static void main(String args[]){

    	Scanner input = new Scanner(System.in);
    	int age;

    	//prompt the user for age
		System.out.print("Enter your age: ");
		//take the age
		age = input.nextInt();

		//check if user is old enough to vote
		if(age>17){
			System.out.println("You can vote!");
		}//end if

		else{
			System.out.println("You cannot vote");
		}//end else


    }//end main method


}//end class