/**
 * @(#)TenGrades.java
 *
 *
 * @author
 * @version 1.00 2014/10/10
 */

import java.util.Scanner;
public class TenGrades {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int students, i , grade;
    	int passes = 0;
    	int fails = 0;

    	System.out.println("Enter number of Students : ");
    	students = input.nextInt();

    	for (i = 1; i <= students; i ++){

    		System.out.println("Enter Grade " + i + " : ");
    		grade = input.nextInt();

    		if (grade >49){
    			passes ++;
    		}
    		else {
    			fails ++;
    		}



    	}//end for

    	i = students;
    	System.out.println("\nNumber of students in class : " + i);
    	System.out.println("Number of passes : " + passes);
    	System.out.println("Number of fails : " + fails);

    }//end method


}//end class