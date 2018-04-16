/**
 * @(#)namesAndagesQ7.java
 *
 *
 * @author 
 * @version 1.00 2015/1/6
 */

import java.util.Scanner;
public class namesAndagesQ7 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int ages[] = new int[5], oldest = 0, youngest = 100, i;
    	String names[] = new String[5];
    	String oname= "", yname= "";
    	
    	//take in ages
    	for(i = 0; i < ages.length; i++){	//i starts at zero
    		if(i!=0){	//if i not eqaul to zero
    			input.nextLine();	//read blank line
    		}//end if
    		//prompt user
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i]=input.nextLine();
    		System.out.print("Enter age for " + names[i] + ": ");
    		//take in the age and store it in the array
    		ages[i] = input.nextInt();
    		
    		//check if age is the oldest
    		if(ages [i] > oldest){
    			oldest = ages[i];
    			oname = names[i];
    		}
    		//check if age is the youngest
    		if(ages[i] < youngest){
    			youngest = ages[i];
    			yname = names[i];
    		}
    	}//end for
    	
    	System.out.println("\n\nSubscript\tAge\tName");
    	//display elements in the array
    	for(i = 0; i < ages.length; i++){
    		System.out.println(i + "\t\t" + ages[i] + "\t\t\t" + names[i]);
    	}//end for
    	
    	//Print the oldest and youngest age
    	System.out.println();	//print blank line
    	System.out.println("Oldest age is " + oldest + " and their name is " + oname);
    	System.out.println("Youngest age is " + youngest + " and their name is " + yname + "\n\n");
    	
    }//end main method
    
    
}//end class