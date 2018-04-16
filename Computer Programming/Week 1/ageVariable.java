/**
 * @(#)ageVariable.java
 *joey tierney
 *
 *declare a variable to hold an age and print the age
 * @author
 * @version 1.00 2014/9/17
 */


public class ageVariable {

    public static void main(String args[]) {

    	//declare variables
    	int myage = 20;		//declare and initialise on one line

    	int yourage;		//declare variable
    	yourage = 26;		//initialise yourage on a different line

		//print the value of the variables
		System.out.println("I am " + myage);
		System.out.println("You are " + yourage);

		System.out.println("It was my birthday");
		//change the value of myage
		myage = 21;
		System.out.println("I am now " + myage);

    }//end method


}//end class