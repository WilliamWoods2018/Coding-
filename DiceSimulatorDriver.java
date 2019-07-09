/*
 *File Name: DiceSimulatorDriver.java
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
 * <insert class description here>
 *
 * @author wwoods
 *
 */
public class DiceSimulatorDriver
{

	/**
	 * @param args Takes the totals for the rolls of the dice.
	 */
	public static void main(String[] args)
	{
		DiceSimulator dice1 = new DiceSimulator();
		
		int numberSimulatedRolls = 10000;
		DiceAccumulator count1 = dice1.runSimulation(numberSimulatedRolls);
		System.out.println("Number of Rolls: \t" + numberSimulatedRolls);
		System.out.println("Number of Snake Eyes: \t"+ count1.getSnakeEyes());
		System.out.println("Number of Twos: \t"+ count1.getTwos());
		System.out.println("Number of Threes: \t"+ count1.getThrees());
		System.out.println("Number of Fours: \t"+ count1.getFours());
		System.out.println("Number of Fives: \t"+ count1.getFives());
		System.out.println("Number of Sixes: \t"+ count1.getSixes());

	}

}
