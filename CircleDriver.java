/*
 *File Name: circle.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 17, 2014
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
public class CircleDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Radius for a circle: ");
		double radiusNew = s.nextDouble();
		c1.setRadius(radiusNew);
		System.out.println("Area is: "+ c1.calaulateArea());
		System.out.println("Diameter is: "+ c1.calculateDiameter());
		System.out.println("Circumference is: "+ c1.calculateCircumference());
		
		
	}

}
