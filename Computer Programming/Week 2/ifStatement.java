/**
 * @(#)ifStatement.java
 * Joey Tierney
 *
 * Take in a persons age, and see if they can vote
 *
 * @author
 * @version 1.00 2014/9/24
 */

import java.util.Scanner;
public class ifStatement {

    public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int age;

		//prompt the user for age
		System.out.print("Enter your age: ");
		age = input.nextInt();

		//check if user can vote
		if (age>17){
			 System.out.println("You can vote!");
		}//end if

		if (age>=17) {
			System.out.println("You can't vote");
		}//end if

    }//end main method


}//end class