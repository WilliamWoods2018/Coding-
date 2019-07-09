import java.util.Scanner;

/*
 *File Name: determineAreaByZipTester.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 8, 2014
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
public class determineAreaByZipTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter Zip Code (Ex.99999): ");
		String zipCode = keyboard.nextLine();
		determineAreaByZipLookup area1 = new determineAreaByZipLookup();
		String area = area1.determineAreaByZip(zipCode);
		System.out.println(zipCode + " is in the "+area+" region");

	}

}
