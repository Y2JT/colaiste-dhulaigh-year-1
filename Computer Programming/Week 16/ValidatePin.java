/**
 * @(#)ValidatePin.java
 *
 *
 * @author
 * @version 1.00 2015/2/4
 */

import java.util.Scanner;
import java.util.Date;

public class ValidatePin {

    public static void main( String args[]) {

       	Scanner input= new Scanner(System.in);

       	int pins[] = {123,234,345};
       	String names[] = {"Fred","George","Ron"};
       	int userpin;
       	String struserpin;
       	int sub = 0;

       	boolean flag = false;


        System.out.print("Enter pin ");
		struserpin = input.next();

		while(!struserpin.matches("\\d{3}")){
			System.out.println("Error, 3 digits only");
			System.out.print("Enter pin ");
			struserpin = input.next();
		}
		userpin = Integer.parseInt(struserpin);

		for(int i = 0; i < pins.length; i++){
        		if(userpin == pins[i]){
        			System.out.print("Pin Found");
        			sub = i;
        			flag = true;
        			break;
        		}//end if
        	}//end for

       	if(flag == false){
       		System.out.print("Pin not valid");
       	}
       	if(flag == true){
       		System.out.print("Welcome " + names[sub]);
       	}



    }


}