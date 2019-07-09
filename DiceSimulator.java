
/*
 *File Name: DiceSimulator.java
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
public class DiceSimulator
{
	public DiceAccumulator runSimulation(int numberrolls)
	{
		DiceAccumulator trial1 = new DiceAccumulator();
		Die die1 = new Die();
		Die die2 = new Die();
		while (numberrolls != 0)
		{
			die1.roll();
			die2.roll();
			numberrolls--;
			if (die1.equals(die2))
			{
				if (die1.spots == 1)
				{
					trial1.addSnakeEyes();
				}
				else if (die1.spots == 2)
				{
					trial1.addTwos();
				}
				else if (die1.spots == 3)
				{
					trial1.addThrees(); 
				}
				else if (die1.spots == 4)
				{
					trial1.addFours();
				}
				else if (die1.spots == 5)
				{
					trial1.addFives();
				}
				else{
					trial1.addSixes();
				}
				
			}
			
		}
		return trial1;

	}
}
