/*
 *File Name: RoomDimension.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 22, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <This Class sets the attributes for a room dimension.>
 *
 * @author wwoods
 *
 */
public class RoomDimension
{
	private double length;
	private double width;
	private double area;
	/**
	 * Takes in parameters to assign a length and width for a room. 
	 * @param length sets the length of a room.
	 * @param width sets the width of a room. 
	 */
	public RoomDimension(double length, double width)
	{
		
		this.length = length;
		this.width = width;
	}
	
	public double CalculateArea()
	{
		double area = width * length;
		return area;
	}

	@Override
	public String toString()
	{
		return "The Room Dimension are length: " + length + " and width: "+ width;
	}
	
	
	
}
