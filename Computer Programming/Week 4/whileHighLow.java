/**
 * @(#)whileHighLow.java
 *
 * take in 5 grades, get the average, highest and lowest grade. Use a while loop
 * @author
 * @version 1.00 2014/10/17
 */

import java.util.Scanner;
public class whileHighLow {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int i = 1, grade;
    	int low = 100;
    	int high = 0;
    	int total = 0;
    	int average = 0;

		//while loop
    	while(i<=5){
    		System.out.print("Enter Grade " + i + ": ");
    		grade = input.nextInt();

    		total = total + grade;

    		if (grade<low){
    			low = grade;
    		}
    		if (grade>high){
    			high = grade;
    		}
    		i++;

    	}//end while

		i = 5;

    	//Calculate average
    	average = total/i;

    	//print results
    	System.out.println("\nHighest grade: " + high);
    	System.out.println("Lowest grade: " + low);
    	System.out.println("Average grade: " + average + "\n");
    }


}