/**
 * @(#)Menu2.java
 *Create a menu
 *1)Get the length of your name
 *2)Enter your age and check if you can vote
 *3)Exit
 *
 * @author
 * @version 1.00 2015/2/4
 */

import java.util.Scanner;
public class Menu2 {

    public static void main( String args[]) {

       	Scanner input = new Scanner(System.in);
       	//Declare strings
       	String menu = "\n/***-Menu-***/\n1) Enter Name \n2) Check Age \n3) Exit\n";
       	String strchoice;
       	String firstname;
       	String surname;
       	String vote;
       	String strage;


       	//Declare ints
       	int choice = 0;
       	int age;

        while(choice != 3){
       			System.out.println(menu);
       			strchoice = input.next();

       			while(!strchoice.matches("[1-3]")){
    				System.out.println("Error numbers 1 - 3 only");

    				System.out.print("Enter Choice : ");
    				//take in grade as string
    				strchoice = input.next();
    			}//end while
    			choice = Integer.parseInt(strchoice);

    			switch(choice){
        			case 1 :
        				if (choice != 0){
        					input.nextLine();
        				}
        				System.out.print("\nEnter First Name : ");
        				firstname = input.nextLine();
        				System.out.println("\nYour first name is " + firstname.length() + " characters long.");


        				break;
        			case 2 :
        				System.out.print("\nEnter Age : ");
        				strage = input.next();

        				while(!strage.matches("\\d+")){

    					System.out.println("Error numbers only");

    					System.out.print("Enter age : ");
    					//take in age as string
    					strage = input.next();
        				}
        				age = Integer.parseInt(strage);
        				if(age>=18){
        					System.out.println("\nYou can vote");
        					vote = "Yes";
        				}
        				else{
        					System.out.println("\nYou aren't allowed vote");
        					vote = "No";
        				}
        				break;
        			case 3 :
        				System.out.println("\nThank you for using our services");
        				break;
       				}
       		}


    }


}