/**
 * @(#)question5.java
 * Write a program that will hard code arrays of names and ages both of length 5
 * Search through the array to see if anyone is over 30
 * If there is anyone over 30 the program should stop searching and display them
 * If no one is over the 30,the user should be told this
 *
 * @author 
 * @version 1.00 2015/2/24
 */

import java.util.Scanner;
public class question5 {

    public static void main(String args[]) {
    	
    	Scanner input = new Scanner(System.in);
    	int ages[] = {21,22,18,35,41};
    	String names[] = {"Joey", "Marcie", "Carl", "Natalie", "Paul"};
    	boolean found = false;
    	int sub=0;
    	
    	//check if anyone is over 30
    	for(int i = 0;i<ages.length;i++){
    		if(ages[i]>=30){
    			found = true;
    			System.out.println("People over 30 are: " + names[i]);
    			break;
    		}//end if
    	}//end for
    	
    	//check if flag is still false
    	if(found == false){
    		System.out.println("Nobody is over 30");
    	}//end if
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }//end main method
    
    
}//end class