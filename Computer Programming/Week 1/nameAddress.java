/**
 * @(#)nameAddress.java
 *
 *Joey Tierney
 *
 *declare variables to hold your name and address
 *
 * @author
 * @version 1.00 2014/9/19
 */


public class nameAddress {

    public static void main(String args[]) {

    	//declare variables
    	String myname = "Joey";
    	String myaddress = "Dublin";

    	System.out.println("My name is " + myname);
    	System.out.println("My address is " + myaddress);

    	//change the value of myaddress
    	myaddress = "Meath";

    	//print the new value of myaddress
    	System.out.println("I moved, I now live in " + myaddress);

    }//end main method


}//end class