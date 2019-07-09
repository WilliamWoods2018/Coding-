
import java.util.Scanner;

/*
 *File Name: CarpetDriver.java
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
 * <The driver class for both the RoomDimension and RoomCarpet classes.>
 *
 * @author wwoods
 *
 */
public class CarpetDriver
{


	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double length;
		double width;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the room: ");
		length = kb.nextDouble();
		System.out.println("Enter the width of the room: ");
		width = kb.nextDouble();
		System.out.println("Enter the carpet price per sqaure foot.");
		double carpetPricePerSqFoot = kb.nextInt();
		RoomDimension newRoom = new RoomDimension(length, width);
		
		RoomCarpet Room1 = new RoomCarpet(newRoom, carpetPricePerSqFoot);
		System.out.println(Room1);
		
		
		
		
	}

}
