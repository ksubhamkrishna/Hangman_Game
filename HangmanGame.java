//Following top-Down Approach means first creating skeleton or what and how to implement first means following top-down approach creating skeleton of the program for creating Hangman Game:-

// 11. Filling in details;-

// 2. Top Down Design:-

// Following top-Down Approach means the main body of the game in order to implement all of them in order to create the entire body of the game means design of the program.

/*
 * How to do that?
 *     
 * Understanding the requirement of the program what is needed to be implemented and to run in order to perform all the tasks.
 * 
 * 1. Something needs to be displayed so a display method is needed in which a random word generated from a list of words of array needs to be displayed or used in order to start the game.
 * 2. getUserInput method is needed in order to get the user input and to check whether the given test inserted or input through user is correct or not.
 * 3. checkuserInput to check the inserted data through the System whether it's correct or not.
 * 4. A method in which we call and run all the above methods under do while loop called here as Run in which is called in order to run the whole program under a program having main method in order to run all the methods and eventually the whole program or game
 * 5. A boolean variable running which is at Furst assigned a default value as true and needs to be changed as false after completing the whole game
 */

package hangmangame;

import java.util.Scanner;

public class HangmanGame {
	private boolean running = true;
	private RandomWordChoosenUseBodyOfDisplayFirstStep randomword = new RandomWordChoosenUseBodyOfDisplayFirstStep();
	private Scanner scanner = new Scanner(System.in);
	private int triesRemaining = 5; // 14. Limited tries.
	private char lastGuess; // 14. Limited tries.

	public void run() {
		do {
			display(); // defining methods which needs to be Implemented in future in order to
						// implement all the functionalities of the program or game in order to make the
						// program.
			getuserInput(); // getting user input Filling in details through getUSerInput method.
			checkUserInput();
		} while (running);
	}

	public void getuserInput() {
		System.out.print("Enter your guess: ");
		String guess = scanner.nextLine();
		lastGuess = guess.charAt(0);
		// randomword.addGuess(guess.charAt(0));

	}

// 13. Checking User Input:-

	public void checkUserInput() {

		// 14. Limited tries:-

		if (randomword.addGuess(lastGuess)) { // 14. Limited tries.
			if (randomword.isComplete()) {
				System.out.println("You have won!");
				System.out.println("The Word is:" + randomword);
				running = false;
			}
		} else
			triesRemaining--;
		if (triesRemaining == 0) { // 14. Limited tries.
			System.out.println("You have lost!");
			System.out.println("The Word is: " + randomword.getChosenWord());
			running = false;
		}

	}

	public void display() {
		System.out.println("\nTries Remaining:" + triesRemaining); // 14. Limited tries.
		System.out.println(randomword);
	}

	// 12. Closing The Scanner Class Object.

	/*
	 * -> We know that java has Constructors ,so it has methods that is
	 * automatically called when you create an object from a class ,in other words
	 * when you instantiate a class,you create an object from it.
	 * 
	 * -> Java Doesn't have exact Equivalent Destructors which is something that is
	 * found in various other Languages,Destructors in C++ are called when an object
	 * is no longer used basically,java Really doesn't have those something like
	 * Destructors,but what we can do can conventionally do is to use a close()
	 * method.
	 * 
	 * -> For using a close Method and closing method call it and in that close
	 * method close all the objects created using:-
	 * object_reference_variable.close(); method. & calling that method using the
	 * main class's object_reference_variable.close();
	 * 
	 * -> We should not quit the program using using System.exit(); as if we will do
	 * so it will exit the program without program going to next part of the program
	 * & calling the close method so if we will use System.exit() to quit the
	 * program the Objects will not close & the program will Exit,So Most Often best
	 * Avoid it. -> In general,you want a program to have a class pathway through it
	 * that terminates somewhere from the Start to End,have a very clear pathway
	 * that don't get terminated or cut off anywhere,so you don't want to sprinkle
	 * .exit() in your code because that mean,close method doesn't get called.
	 */

	public void close() {
		scanner.close();

	}

}