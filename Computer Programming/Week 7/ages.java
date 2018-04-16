/**
 * @(#)ages.java
 *
 * Take in 5 ages and store them in an array
 * Tell the user the highest age and lowest age
 * Print the values stored in the array and subscript
 * @author
 * @version 1.00 2014/11/26
 */

import java.util.Scanner;
public class ages {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int ages[] = new int [5], oldest = 0, youngest = 100, i;
    	String names[] = new String[5];

    	//take in ages
    	for(i = 0; i < ages.length; i++){	//i starts at zero
    		if(i!= 0){	//if i is not equal to zero
    			input.nextLine();	//read blank line
    		}
    		//prompt user
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i]=input.nextLine();
    		System.out.print("Enter age for " + names[i] + ": ");
    		//take in the age and store it in the array
    		ages[i] = input.nextInt();

    		//check if age is oldest
    		if(ages [i] > oldest){
    			oldest = ages[i];
    		}
    		//check if age is youngest
    		if(ages [i] < youngest){
    			youngest = ages[i];
    		}
    	}//end for

    	System.out.println("\n\nSubscript\tAge\tName");
    	//display elements in the array
    	for(i = 0; i < ages.length; i++){	//i starts at zero
    		System.out.println(i + "\t\t" + ages[i] + "\t\t\t" + names[i]);
    	}//end for

		//print the oldest and youngest age
		System.out.println();	//print blank line
    	System.out.println("Oldest age is " + oldest);
    	System.out.println("Youngest age is " + youngest + "\n\n");

    }//end main method

}//end class