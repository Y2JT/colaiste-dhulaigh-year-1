/**
 * @(#)DiceGameMenu.java
 * Ask the user if they want to guess what will be rolled
 * They have a menu to roll 1, 2, or 3 dice or exit the game
 * If the choose 1 and get it correct, they score 5
 * If the choose 2 and get it correct, they score 15
 * If the choose 3 and get it correct, they score 50
 *
 * @author
 * @version 1.00 2015/1/21
 */

import java.util.Scanner;
public class DiceGameMenu {

    public static void main(String args[]) {

    	Scanner input = new Scanner(System.in);
    	int choice = 0, dice1, dice2, dice3, guess;
    	String strchoice;	//take in choice as a String
    	int score = 100;
    	String menu = "\n\n1) Roll Dice 1\n2) Roll Dice 2\n3) Roll Dice 3\n4) Exit\n>";

    	//loop to display menu
    	while(choice !=4){
    		System.out.print(menu);
    		strchoice = input.next();
    		//validate strchoice (between 1 and 4)
    		while(!strchoice.matches("[1-4]")){
    			System.out.println("Error, 1-4 can only be entered");
    			System.out.print(menu);
    			strchoice = input.next();
    		}//end while
    		//parse strchoice to an int
    		choice = Integer.parseInt(strchoice);

    		if(choice==1){
    			//roll the dice
    			dice1 = 1+(int)(Math.random()*6);
    			System.out.print("Enter your guess: ");
    			guess = input.nextInt();
    			if(guess == dice1){
    				score += 5;
    				System.out.println("Correct, you have scored 5 points!\nScore: " + score);
    			}
    			else{
    				score -=5;
    				System.out.println("Incorrect, you have lost 5 points.\nScore: " + score);
    			}
    		}//end if
    		else if(choice==2){
    			//roll the dice
    			dice1 = 1+(int)(Math.random()*12);
    			System.out.print("Enter your guess: ");
    			guess = input.nextInt();
    			if(guess == dice1){
    				score += 15;
    				System.out.println("Correct, you have scored 15 points!\nScore: " + score);
    			}
    			else{
    				score -=15;
    				System.out.println("Incorrect, you have lost 15 points.\nScore: " + score);
    			}
    		}//end else if
    		else if(choice==3){
    			//roll the dice
    			dice1 = 1+(int)(Math.random()*18);
    			System.out.print("Enter your guess: ");
    			guess = input.nextInt();
    			if(guess == dice1){
    				score += 50;
    				System.out.println("Correct, you have scored 50 points!\nScore: " + score);
    			}
    			else{
    				score -=50;
    				System.out.println("Incorrect, you have lost 50 points.\nScore: " + score);
    			}
    		}//end else if
    	}//end while

    	System.out.println("\nYour final winnings are: " + score);
    	System.out.println();	//blank line

    }//end main method


}//end class