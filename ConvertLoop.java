/*
 *  Filename:  ConvertLoop.java
 *  
 *  Programmer: 
 *  ULID:  
 *
 *  Date:  
 *
 *  Class: IT 168
 *
 *  Lecture Section:
 *  Lecture Instructor:
 *  Lab Section: 
 *  Lab Instructor: 
 */

/**
 * Converts given nested for loops to nested while loops
 *
 * @author Holbrook
 *
 */
public class ConvertLoop
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Original code with for loop");
		int s = 0;
		int t = 1;

		for (int i = 0; i < 5; i++)
		{
			s = s + i;
			for (int j = i; j > 0; j--)
			{
				t = t + (j - 1);
			}
			s = s + t;
			System.out.println("T is " + t);
		}
		System.out.println("S is " + s);

		System.out.println("\n\nNew code with while loop");

		int sum1 = 0;
		int sum2 = 1;
		int i = 0;
		int j;
		while (i < 5)
		{

			sum1 = sum1 + i;
			j = i;
			

			while (j != 0)
			{

				sum2 = sum2 + (j - 1);
				j--;
			}

			sum1 = sum1 + sum2;
			System.out.println("sum2 is " + sum2);
			i++;
		}
		System.out.println("sum1 is " + sum1);
		/* **************************************************
		 * Add new code here**************************************************
		 */

	}

}
