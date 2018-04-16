/**
 * @(#)histogram.java
 * Print a line of stars for all the ages in the array
 *
 * @author
 * @version 1.00 2015/1/23
 */


public class histogram {

    public static void main(String args[]) {

    	int ages[] = {19,17,30,27,24,18};

    	//outer loop will move through each element in the array
    	for(int i = 0; i<ages.length; i++){
    		//inner for will go from 1 up to the element, eg. 1-18
    		for(int x = 1; x<=ages[i]; x++){
    			System.out.print("*");
    		}//end for
    		System.out.println();	//blank line
    	}//end for

    }//end main method


}//end class