/*
 *File Name: examAverageTester.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 24, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <set up the variables in order to calculate the average>
 *
 * @author wwoods
 *
 */
public class examAverageTester
{

	public final int exam1 = 80;
	public final int exam2 = 90;
	public final int exam3 = 100;
	double average;
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	
	public double examAverageCalculator(int exam1, int exam2,int exam3){
		average = (exam1 + exam2 +exam3)/2.0;
		System.out.print("Exam Average: + average");
		return average;
		
	}

}
