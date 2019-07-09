/**
 * <This part of the program will ask the user for 
 * guesses, set up the range of numbers to guess, and 
 * evaluate how close the guess is to the mystery number>
 *
 * @author wwoods
 *
 */
import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
	private final double TEN_RANGE = .1;
	private final double TWENTYFIVE_RANGE = .25;
	private int endRange;
	private int mNumber;

	/**
	 * @param range
	 *            sets the range for the game.
	 * @param mNumber
	 *            the number to be guessed for the game.
	 */
	public GuessingGame()
	{

		endRange = 20;
		mNumber = 0;
	}

	public int getEndRange()
	{
		return endRange;
	}

	public boolean evaluateGuess(int guess)
	{
		boolean attempt = false;
		if (guess <= (mNumber + (mNumber * TEN_RANGE))
				|| guess <= (mNumber - (mNumber * TEN_RANGE)))
		{
			System.out.println("Hot. Try again.");
			attempt = false;

		}
		else if (guess > (mNumber + (mNumber * TEN_RANGE))
				|| guess > (mNumber - (mNumber * TEN_RANGE)))
		{
			if (guess <= (mNumber + (mNumber * TWENTYFIVE_RANGE))
					|| guess <= (mNumber - (mNumber * TWENTYFIVE_RANGE)))
			{
				System.out.println("Warm. Try again.");
				attempt = false;

			}
			else if (guess > (mNumber + (mNumber * TWENTYFIVE_RANGE))
					|| guess > (mNumber - (mNumber * TWENTYFIVE_RANGE)))
			{
				System.out.println("Cold. Try again.");
				attempt = false;
			}
			else
			{
				System.out.println("You guess the number!!!");
				attempt = true;
			}

		}
		return attempt;

	}

	public int makeGuess(Scanner kb)
	{
		Scanner kb2 = new Scanner(System.in);
		System.out.print("Enter a guess: ");
		int numguess = kb2.nextInt();
		int tries = 0;
		while (numguess != mNumber)
		{
			
			
			System.out.print("Enter a guess: ");
			numguess = kb2.nextInt();
			
		}
		return numguess;

	}

	public int playGame(Scanner kb, int range)
	{
		int tries = 0;
		Random rand = new Random();
		mNumber = rand.nextInt(range) + 1;
		int guess = makeGuess(kb);
		for (int counter = 0; evaluateGuess(guess) == true; counter++)
		{
			
			makeGuess(kb);
			tries = tries + 1;
			tries = counter;
			
		}

		System.out.println("It took you " + tries +" guesses to get the mystery number.");
		return tries;

	}
	

}
