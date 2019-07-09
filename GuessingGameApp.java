import java.util.Scanner;

/*
 * File name: GameStats.java
 *
 * Programmer: Pat Matsuda
 * ULID: mpmatsu
 *
 * Date: Sep 10, 2014
 *
 * Class: IT 168
 * Lecture Section: 1, 10, 13
 * Lecture Instructor: Patricia Matsuda
 * Lab Section: 2,3,11,12,14,15
 * LabInstructor: Nasiba Al-Rawi, Aayush Agrawal, Karl Bissereth, 
 * 					Swarup Deonepudi
 */

/**
 * <insert class description here>
 *
 * @author Holbrook, Matsuda
 *
 */
public class GuessingGameApp
{
	private GuessingGame game;
	private GameStats stats;
	private Scanner keyboard;
	
	public void run()
	{
		game = new GuessingGame();
		stats = new GameStats();
		keyboard = new Scanner(System.in);
		
		int choice = 0;		
		int endRange = 20;
		int numberGuesses = 0;
		
		//THE REST OF YOUR CODE HERE
		System.out.println("\t\t\tGuessing Game");
		displayInstructions();
		while(choice == 0){
			
		
		System.out.println("Guessing Game Menu");
		System.out.println("\n");
		System.out.println("1. Play a Game");
		System.out.println("2. Change Number Range");
		System.out.println("3. Statistics for Session");
		System.out.println("4. Quit");
		System.out.println("Please enter your choice: ");
		choice = keyboard.nextInt();
		}
		
		while(choice != 4)
		{
			if(choice == 1){
				System.out.println("Let's Play. I've chosen my number.");
				System.out.println("It's a whole number from 1 to " + endRange);
				int tries = game.playGame(keyboard, endRange);
				updateGameStats(tries, endRange);
		
			}
			if(choice == 2){
				chooseEndRange();
			}
			if(choice == 3){
				stats.displayGameStats();
			}
			if(choice == 4){
				displayGoodbye();
				System.exit(0);
			}
		}
		
	}
	
	private void displayInstructions()
	{
		System.out.println("On the following screen you will find a menu with three"
				+ "choices");
		System.out.println("\t\tThe first choice will be to play the game.");
		System.out.println("\tThe second choice you will be to change the game range.");
		System.out.println("\t\tThe third choice will be to display your statistics for the session");
		System.out.println("\tThe fourth choice will be to quit the game.");
		System.out.println("\n");
		System.out.println("Playing the game:");
		System.out.println("\tAfter each guess, if you haven't guessed the number,");
		System.out.println("you will be given a hint of cold, warm, or hot.");
	}
	
	//private int getChoice()
	{
		//return choice;
	}
	
	private void updateGameStats(int numberGuesses, int endRange)
	{
		stats.determineBestGame(numberGuesses, endRange);
		
	}
	
	//Asks the user to select an end range, validates the entry and return the valid end range chosen
	private int chooseEndRange()
	{
		Scanner range = new Scanner(System.in);
		System.out.println("Choose your Range(20 or 50): ");
		int nRange = range.nextInt();
		while(nRange != 20 && nRange != 50){
			System.out.println("Choose your Range(20 or 50): ");
			nRange = range.nextInt();
		}
		int endRange = nRange;
		return endRange;
		
	}
	
	private void displayGoodbye()
	{
		System.out.println("Thanks for playing the Guessing Game. Game Over.");
	}
	
	public static void main(String[] args)
	{
		GuessingGameApp application = new GuessingGameApp();

		application.run();
	}
}
