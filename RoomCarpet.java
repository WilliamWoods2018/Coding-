
/*
 *File Name: RoomCarpet.java
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
 * <insert class description here>
 *
 * @author wwoods
 *
 */
public class RoomCarpet
{
	private RoomDimension dimensions;
	private double carpetPricePerSqFoot;
	/**
	 * This constructor will accept parameters for the carpet for a room.
	 * @param dimensions sets the dimensions for a room. 
	 * @param carpetPricePerSqFoot sets the price for carpet per square foot for a room.
	 */
	public RoomCarpet(RoomDimension dimensions, double carpetPricePerSqFoot)
	{
		
		this.dimensions = dimensions;
		this.carpetPricePerSqFoot = carpetPricePerSqFoot;
	}
	public double calculateTotalCost(){
		
		double totalCost = dimensions.CalculateArea() * carpetPricePerSqFoot;
		return totalCost;
		
	}
	@Override
	public String toString()
	{
		
		System.out.printf("the cost of carpet is $%.2f\n", calculateTotalCost());
		return dimensions + ",\nthe price for the carpet per square foot is " 
				+ carpetPricePerSqFoot;
	}
	
}
