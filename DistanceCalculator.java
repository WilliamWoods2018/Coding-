/*
 *File Name: DistanceCalculator.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Aug 31, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <A program that converts two variables speed and time into distance >
 *
 * @author wwoods
 *
 */
public class DistanceCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int speed = 20;
		int time = 10; 
		int distance = speed * time;
		System.out.println("Speed, which is, "+speed+ " multiplied by time, which is, "+time+" is converted into "+distance+" units of distance");

	}

}
