/*
 *File Name: WidgetTester.java
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
 * <insert class description here>
 *
 * @author wwoods
 *
 */
public class WidgetTester
{

	
	public static void main(String[] args)
	{
		WidgetProducer w1 = new WidgetProducer(10);
		double days = w1.calculateDaysToProduce(100);
		System.out.printf("100 widgets produced at 10 widgets per hour will take: %.2f ", days);
		System.out.print("days");
		

	}
	
	

}
