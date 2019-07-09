/*
 *File Name: poolArea.java
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
 * <This program will provide the perimeter, voulume, gallons of water, and underground surface area of any given length and width size of a pool>
 *
 * @author wwoods
 *
 */
import java.util.Scanner;
public class poolCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int length;
		int width;
		int averageDepth;
		double perimeter;
		double volume;
		double gallonsOfWater;
		double undergroundSurfaceArea;
		final double convertToGallonsOfWater = 7.48;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the length of the pool: ");
		length = s.nextInt();
		System.out.print("Enter the width of the pool: ");
		width = s.nextInt();
		System.out.print("Enter the average depth of the pool: ");
		averageDepth = s.nextInt();
		perimeter = (2*(length+width));
		volume = length*width*averageDepth;
		gallonsOfWater = volume*convertToGallonsOfWater;
		undergroundSurfaceArea = ((2*(length+width)*averageDepth)+(length*width));
		
		System.out.println("Perimeter = "+ perimeter);
		System.out.println("Volume = "+ volume);
		System.out.println("Gallons of water = "+ gallonsOfWater);
		System.out.println("Underground surface area = "+ undergroundSurfaceArea);
		
		
	
		
		
		
		
		

	}

}
