import java.util.Random;

/*
 *File Name: Die.java
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
public class Die
{
	int spots;
	Random generator;

	/**
	 * creates the generator in order to make the die.
	 */
	public Die()
	{
		generator = new Random();
	}
	public void roll()
	{
		spots = generator.nextInt(6)+1;
	}
	
	public int getSpots()
	{
		return spots;
	}
	public boolean equals(Die other)
	{
		if(spots == other.getSpots()){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}
