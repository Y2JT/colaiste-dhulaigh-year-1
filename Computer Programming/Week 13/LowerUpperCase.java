/**
 * @(#)LowerUpperCase.java
 *
 *
 * @author
 * @version 1.00 2015/1/14
 */

import java.util.Scanner;
public class LowerUpperCase {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	String name;

    	System.out.print("Enter your name: ");
    	name = input.next();

    	//print name
    	System.out.println("Hello " + name);

    	//change name to all upper case
    	name = name.toUpperCase();
    	System.out.println("Hello " + name);

    	//change name to all lower case
    	name = name.toLowerCase();
    	System.out.println("Hello " + name);

    }//end main method


}//end class