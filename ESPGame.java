/*
 * Class: CMSC203  CRN 	34473
 * Instructor: Khandan Monshi
 * Description: This program is a game where the user tries to guess a random color  
 * Due: 02/05/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Andy Gunawan
*/

import java.util.Random;
import java.util.Scanner;

public class ESPGame {

	//Stating Variables
    public static void main(String[] args) {
        final String colorRed = "red";
        final String colorBlue = "blue";
        final String colorGreen = "green";
        final String colorYellow = "yellow";
        final String colorOrange = "orange";
        Scanner input = new Scanner(System.in);
        String name, userDescription, dueDate, userInput = null, answer = null;
        int roundNum = 0;
        int correctAnswers = 0;
        Random rn = new Random();
        int randomNum;

        //prompts user for a name, a description, and a due date 
        System.out.print("Enter Your Name: ");
        name = input.nextLine();
        System.out.print("Describe Yourself: ");
        userDescription = input.nextLine();
        System.out.print("Due Date: ");
        dueDate = input.nextLine();

        System.out.println("CMSC203 Assignment 1: Test your ESP skills!");

        //loops the game for 11 rounds
        for (roundNum = 1; roundNum <= 11; roundNum++) {
            System.out.println("Round " + roundNum);
            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.print("Enter your guess: ");
            userInput = input.nextLine();
            
          // Input Verification, Makes sure that a valid input has been entered 
            boolean validInput = false;
            while (!validInput)  {

                if (userInput.toLowerCase().equals(colorRed) ||
                        userInput.toLowerCase().equals(colorBlue) ||
                        userInput.toLowerCase().equals(colorGreen) ||
                        userInput.toLowerCase().equals(colorOrange) ||
                        userInput.toLowerCase().equals(colorYellow)) {
                    validInput = true;
                } else {
                	//if the user enters a invalid input they will be asked to enter 
                	//another input until its valid
                    System.out.print("You entered invalid color. "
                            + "Is it Red, Green, Blue, Orange, or Yellow?\r\n"
                            + "Enter your guess again: ");
                    userInput = input.nextLine();
                }
            }

            //Random number generator to pick a random color
            randomNum = rn.nextInt(5);
            if (randomNum == 0) {
                answer = colorRed;
            } else if (randomNum == 1) {
                answer = colorGreen;
            } else if (randomNum == 2) {
                answer = colorBlue;
            } else if (randomNum == 3) {
                answer = colorOrange;
            } else if (randomNum == 4) {
                answer = colorYellow;
            }
           
            //Checks if the user correctly guessed the color
            if (answer.equalsIgnoreCase(userInput)) {
            	System.out.print("Correct! ");
                correctAnswers++;
            }else {
             	System.out.print("Incorrect, ");
            }
            System.out.println("I was thinking of " + answer);
        }
        
        //End Screen information
        System.out.println("Game Over\n\n");
        System.out.println("You guessed " + correctAnswers 
        		+ " out of 11 colors correctly.");
        System.out.println("Student Name: " + name); 
  		System.out.println("User Description: " + userDescription); 
  		System.out.println("Due Date: " + dueDate); 
    }
}
