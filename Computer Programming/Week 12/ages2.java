/**
 * @(#)ages2.java
 * Take in 5 ages and names. Print the people who are 18 and over together and print people who are under 18
 *
 * @author
 * @version 1.00 2015/1/9
 */

import java.util.Scanner;
public class ages2 {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	int ages[] = new int[5];
    	String names[] = new String [5];
    	int i;

    	//Strings to hold the names who are above and below 18
    	String above = "People above 18 are: \n";
    	String below = "People below 18 are: \n";

    	//loop to take in names and ages
    	for(i = 0; i<ages.length; i++){
    		//code for bug in java
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)

    		//prompt user
    		System.out.print("Enter name: ");
    		names[i] = input.nextLine();

    		System.out.print("Enter age for " + names[i] + ": ");
    		ages[i] = input.nextInt();

    		//check if age is below 18
    		if(ages[i]<18){
    			below += names[i] + "\n";
    		}
    		else{
    			above += names[i] + "\n";
    		}
    	}//end for

    	System.out.println(below + "\n\n" + above);

    }//end main method


}//end class