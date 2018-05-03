/*
 *File Name: ArrayUtility.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Nov 12, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <Holds the attributes for the Array Driver Class>
 *
 * @author wwoods
 *
 */
public class ArrayUtility
{
	public double findPercentageGreaterThanTwenty(int array[])
	{
		int num = 0;
		double percentage = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > 20)
			{
				num++;
			}
			percentage = (double) num / array.length;

		}
		return percentage;
	}

	public int findSmallestInt(int array[])
	{

		int smallest = array[0];
		int row = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (smallest > array[i])
			{
				row = i;
				smallest = array[i];
			}
		}
		return row;
	}

	public int findLargestInt(int array[])
	{
		int largest = 0;
		int lrow = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (largest < array[i])
			{
				lrow = i;
				largest = array[i];
			}
		}
		return lrow;
	}

	public int findDifferenceLargestSmallest(int array[])
	{
		int difference = array[findLargestInt(array)]
				- array[findSmallestInt(array)];
		return difference;

	}

	public void printReverseOrder(int array[])
	{
		for (int i = array.length-1; i > -1; i--)
		{
			System.out.println("intArray[" + i + "] = " + array[i]);	
		}
	}
	public void increaseValues(int array[])
	{
		for (int i = 0;i < array.length; i++)
		{
			array[i]= array[i] * 4;
		}
	}

}
