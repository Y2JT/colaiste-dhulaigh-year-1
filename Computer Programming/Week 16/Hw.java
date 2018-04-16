/**
 * @(#)Hw.java
 *
 *
 * @author
 * @version 1.00 2015/2/4
 */

import java.util.Scanner;
public class Hw {

    public static void main( String args[]) {


        Scanner input = new Scanner(System.in);


       	String names[] = {"Bill","Ben","Ted","Fred","John"};
       	String strchoice;
        int grades[] = {30,55,90,37,62};
        int pin[] = {123,234,345,456,567};
        int userpin;//pin entered buy user
        int sub = 15; //hold the ppostion of the person int the array
        int counter = 0; //counts number of atempts
        int choice = 0;

        boolean flag = false; // used to see if we found the the user pin

        while(flag == false && counter < 3){
        	if(counter != 0 ){
        		System.out.println("Incorrect Pin");
        	}
        	//propmt user
        	System.out.print("Enter pin : ");
        	//take user pin
        	userpin = input.nextInt();

        	//Loop to search array for the pin
        	for(int i = 0; i < pin.length; i++){
        		if(userpin == pin[i]){
        			System.out.println("Pin Found");
        			sub = i;
        			flag = true;


        			break;
        		}//end if
        		else{
        			counter ++;
       				}
        	}//end for
        }//end while


		if(flag == false){
       		System.out.println("Pin not found,\nShutting down!");

		}
       	if(flag == true){
       		System.out.println("Welcome " + names[sub] + ", your grade is " + grades[sub]);

       		while(choice != 4){
       			System.out.println("\n1 Change pin \n2 Change grade \n3 Print details \n4 Exit");
       			strchoice = input.next();

       			while(!strchoice.matches("[1-4]")){
    				System.out.println("Error numbers 1 - 4 only");

    				System.out.print("Enter Choice : ");
    				//take in grade as string
    				strchoice = input.next();
    			}//end while
    			choice = Integer.parseInt(strchoice);

    			switch(choice){
        			case 1 :
        				System.out.println("Enter new pin : ");
        				pin[sub] = input.nextInt();
        				break;
        			case 2 :
        				System.out.println("Enter new grade : ");
        				grades[sub] = input.nextInt();
        				break;
        			case 3 :
        				System.out.println("Your pin is " + pin[sub] + " and your grade is" + grades[sub]);
        				break;
        			case 4 :
        				System.out.println("Thank you for using our services");
        				break;
       				}
       		}
       	}//end else



    }


}