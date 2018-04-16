/**
 * @(#)namesAges.java
 * Joey Tierney
 * Take in 5 names and ages. Print all the people who are under 18 with their ages and all the people who are over 18 and their ages
 * @version 1.00 2014/12/10
 */

import java.util.Scanner;
public class namesAges {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int ages[] = new int[5], i;
    	String names[] = new String[5];
    	String under18 = "\n\nPeople under 18:\n\n";
    	String over18 = "\n\nPeople over 18:\n\n";

    	//loop to take in names and grades
    	for(i = 0; i < names.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in grades
    		System.out.print("Enter age for " + names[i] + ": ");
    		ages[i] = input.nextInt();

    		//check age
    		if(ages[i] > 18){
    			over18 += names[i] + "\t" + ages[i] + "\n";
    		}
    		else{
    			under18 += names[i] + "\t" + ages[i] + "\n";
    		}
    	}//end for

		System.out.println(over18);
		System.out.println(under18);

    }//end main method

}//end class