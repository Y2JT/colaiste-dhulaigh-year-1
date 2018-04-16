/**
 * @(#)squareNumber.java
 * Joey Tierney
 * Populate the first array with numbers from 1-10
 * Square each number in the first array and store it in the subscript in the second array
 * @version 1.00 2014/12/10
 */

public class squareNumber {

    public static void main(String args[]) {

    	//declare variables
    	int array1[] = new int[10];
    	int array2[] = new int[10];
    	int i;

		//popluate the first array
    	for(i = 0; i < array1.length; i++){
    		//add 1 to the value of i and assign it to array1[i]
    		array1[i] = (i+1);
    		//put the square of the number stored in array1[i] into array2[i]
    		array2[i] = (i+1)*(i+1);
    	}//end for

		//print the values stored in the arrays
    	System.out.println("Array1\t\tArray2");
    	for(i = 0; i < array1.length; i++){
    		System.out.println(array1[i] + "\t\t" + array2[i]);
    	}

    	System.out.println();	//print blank line

    }//end main method


}//end class