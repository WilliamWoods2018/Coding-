/*
 *File Name: DiceAccumulator.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 29, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <Acts as a counter for the Driver program.>
 *
 * @author wwoods
 *
 */
public class DiceAccumulator
{
	int snakeEyes;
	int twos;
	int threes;
	int fours;
	int fives;
	int sixes;

	public void addSnakeEyes()
	{
		snakeEyes++;
	}
	public void addTwos()
	{
		twos++;
	}
	public void addThrees()
	{
		threes++;
	}
	public void addFours()
	{
		fours++;
	}
	public void addFives()
	{
		fives++;
	}
	public void addSixes()
	{
		sixes++;
	}
	public int getSnakeEyes()
	{
		return snakeEyes;
	}
	public int getTwos()
	{
		return twos;
	}
	public int getThrees()
	{
		return threes;
	}
	public int getFours()
	{
		return fours;
	}
	public int getFives()
	{
		return fives;
	}
	public int getSixes()
	{
		return sixes;
	}
	
}
