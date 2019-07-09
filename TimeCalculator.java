/*
 *File Name: TimeCalculator.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 10, 2014
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
import java.util.Scanner;
public class TimeCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final int numberOfSecondsInMinute = 60;
		final int numberOfSecondsInHour = 3600;
		int seconds;
		int minutes;
		int hours;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number of Seconds: ");
		int numberOfSeconds = scanner.nextInt();
		hours = numberOfSeconds / numberOfSecondsInHour;
		minutes =((numberOfSeconds-(hours*numberOfSecondsInHour)) / numberOfSecondsInMinute);
		seconds =(numberOfSeconds-((hours*numberOfSecondsInHour)+(minutes*numberOfSecondsInMinute)));
		System.out.println(numberOfSeconds + " are equal to: " +hours+" Hours, "+minutes+" Minuets, and "+seconds+ " seconds.");
		

	}

}
