/**
 * @(#)arrayAges.java
 * Joey Tierney
 *
 * @author
 * @version 1.00 2014/11/21
 */

import java.util.Scanner;
public class arrayAges {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int ages[] = new int[5], highest = 0, i;

    	//show default value of array
    	System.out.println("Default Values\n");
    	System.out.println("Subscript\tValue");

    	for(i = 0; i < ages.length; i++){	//i starts at zero
    		System.out.println(i + "\t\t" + ages[i]);
    	}//end for

    	//take in ages
    	for(i = 0; i < ages.length; i++){	//i starts at zero
    		//take an input
    		System.out.print("Enter age " + (i+1) + ": ");
    		ages[i] = input.nextInt();
    	}//end for

    	System.out.println("\n\nSubscript\tValue");
    	//display the elements in array
    	for(i = 0; i < ages.length; i++){	//i starts at zero
    		System.out.println(i + "\t\t" + ages[i]);
    	}//end for

    }//end main method


}//end class