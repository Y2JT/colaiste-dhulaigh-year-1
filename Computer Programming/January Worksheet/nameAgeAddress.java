/**
 * @(#)nameAgeAddress.java
 *
 *
 * @author
 * @version 1.00 2015/1/16
 */

import java.util.Scanner;
public class nameAgeAddress {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);

    	//declare variables
    	String names[] = {"Joey", "Jacob", "Timmy"};
    	String address[] = {"Dublin", "Cork", "Meath"};
    	int ages[] = {20,43,33};

    	String username;

    	boolean found = false;

    	//take in a name from the user
    	System.out.print("Enter name: ");
    	username = input.nextLine();

    	//change username to lowercase
    	username = username.toLowerCase();

    	//loop to check the array for username
    	for(int i = 0; i<names.length; i++){
    		//check each subscript if it matches username
    		if(username.matches(names[i].toLowerCase())){
    			//change value of flag
    			found = true;
    			//print user details
    			System.out.println("Welcome " + names[i] + "\nYou are from " + address[i] + " and you are " + ages[i] + " years old");
    			//stop searching the loop
    			break;
    		}//end if
    	}//end for

    	//after loop check if flag is still false
    	if(found==false){
    		System.out.println("Name is not in the system files");
    		//end program
    		System.exit(0);
    	}//end if

    }//end main method

}//end class