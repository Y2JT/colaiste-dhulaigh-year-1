/**
 * @(#)forEvennumbers.java
 * Joey Tierney
 *
 * Print the even numbers from 1 to 20
 *
 * @author
 * @version 1.00 2014/10/8
 */


public class forEvennumbers {

    public static void main(String args[]) {

    	for(int i =2; i<=20;i+=2){
    		System.out.println(i);
    	}//end for

		System.out.println();

    	//print the numbers from 20 to 2
    	for(int i =20; i>=2;i-=2){
    		System.out.println(i);
    	}//end for

    }//end main method


}//end class