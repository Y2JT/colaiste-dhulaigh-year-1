/**
 * @(#)namesGrades.java
 *
 *
 * @author
 * @version 1.00 2015/1/16
 */

import java.util.Scanner;
public class namesGrades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int grades[] = new int[5];
    	String names[] = new String[5];
    	String strgrades;
    	int total = 0, average = 0;

    	//Strings to hold the names of people above and below average
    	String above = "People who scored above average are: \n";
    	String below = "People who scored below average are: \n";

    	for(int i = 0; i<names.length; i++){
    		if(i!=0){
    			input.nextLine();
    		}//end if(i!=0)
    		//prompt user for name
    		System.out.print("Enter name " + (i+1) + ": ");
    		names[i] = input.nextLine();
    		//take in grades
    		System.out.print("Enter grade for " + names[i] + ": ");
    		strgrades = input.next();

    		//check for digits only
    		while(!strgrades.matches("\\d+")){
    			System.out.println("Error, numbers only");
    			//prompt user for input
    			System.out.print("Enter grade for " + names[i] + ": ");
    			strgrades = input.next();
    		}//end while

    		//change to integer
    		grades[i] = Integer.parseInt(strgrades);

    		//get total
    		total+= grades[i];

    	}//end for

    	//get average
    	average = total/5;

    	//loop to get above and below average
    	for(int i = 0; i<names.length; i++){
    		//check if grade is above/below average
    		if(grades[i]<average){
    			below += names[i] + " scored " + grades[i] + "\n";
    		}
    		else{
    			above += names[i] + " scored " + grades[i] + "\n";
    		}//end if
    	}//end for

    	System.out.println("\nAverage grade is " + average);
    	System.out.println("\n" + below + "\n\n" + above);

    }//end main method


}//end class