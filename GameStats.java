/*
 *File Name: GameStats.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 27, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <Sets the statistics for the games played of the guessing game.>
 *
 * @author wwoods
 *
 */
public class GameStats
{
	int gamesPlayed;
	int bestTwentyGameRange;
	int bestFiftyGameRange;

	/**
	 * @param gamesPlayed
	 *            The number of games played.
	 * @param twentyGameRange
	 *            The number of guess taken in best game of 20 range.
	 * @param fiftyGameRange
	 *            The number of guess taken in best game of 50 range.
	 */
	public GameStats()
	{

		gamesPlayed = 0;
		bestFiftyGameRange = 100;
		bestTwentyGameRange = 100;

	}

	public int getGamesPlayed()
	{
		return gamesPlayed;
	}

	public int getBestTwentyGameRange()
	{
		return bestTwentyGameRange;
	}

	public int getBestFiftyGameRange()
	{
		return bestFiftyGameRange;
	}

	public void increaseGamesPlayed()
	{
		gamesPlayed++;

	}

	public void determineBestGame(int tries, int range)
	{
		if (tries < bestTwentyGameRange && range == 20)
		{
			bestTwentyGameRange = tries;
		}
		else if(tries < bestFiftyGameRange && range == 50)
		{
			bestFiftyGameRange = tries;
		}
	}
	public void displayGameStats()
	{
		System.out.println("You have played "+ gamesPlayed + " games.");
		if (bestTwentyGameRange != 100){
			System.out.println("Your best game using the 1-20 range is: "
		+ bestTwentyGameRange);
		}
		else{
			System.out.println("You have not played a game using the 1-20 range.");
		}
		if (bestFiftyGameRange != 100){
			System.out.println("Your best game using the 1-50 range is: "
					+ bestFiftyGameRange);
		}
		else{
			System.out.println("You have not played a game using the 1-50 range.");
		}
	}

}
