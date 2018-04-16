/**
 * @(#)namesAges.java
 *
 * Take in 5 names and ages. Store them in an array, check for non-digits
 *
 * @version 1.00 2015/1/16
 */

import java.util.Scanner;
public class namesAges {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int ages[] = new int[5];
    	String names[] = new String[5];
    	String strages;

    	for(int i = 0; i<names.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		//prompt user for name
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in ages
    		System.out.print("Enter age for " + names[i] + ": ");
    		strages = input.next();

    		//check for digits only
    		while(!strages.matches("\\d+")){
    			System.out.println("Error, numbers only");
    			//prompt user for input
    			System.out.print("Enter age for " + names[i] + ": ");
    			strages = input.next();
    		}//end while

    		//change to integer
    		ages[i] = Integer.parseInt(strages);
    	}//end for

    	System.out.println("\n\nSubscript\t\tName\t\tAge");
    	for(int i = 0; i<ages.length; i++){
    		System.out.println(i + "\t\t" + names[i] + "\t\t" + ages[i]);
    	}//end for

    }//end main method


}//end class