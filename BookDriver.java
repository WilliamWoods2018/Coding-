/*
 *File Name: BookDriver.java
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
 * <Uses the methods in previous program to price books>
 *
 * @author wwoods
 *
 */
import java.util.Scanner;
public class BookDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Book b1 = new Book();
		Book b2 = new Book();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the title of the first book: ");
		String titleNew = s.nextLine();
		b1.setTitle(titleNew);
		System.out.println("Enter the title of the second book: ");
		String titleNew2 = s.nextLine();
		b2.setTitle(titleNew2);
		System.out.println("Enter the price of the first book: ");
		double priceNew = s.nextDouble();
		b1.setPrice(priceNew);
		System.out.println("Enter the price of the second book: ");
		double priceNew2 = s.nextDouble();
		b2.setPrice(priceNew2);
		System.out.println("Enter the amount of books purchased for the first title: ");
		double numberOfBooks = s.nextInt();
		System.out.println("Enter the amount of books purchased for the first title: ");
		double numberOfBooks2 = s.nextInt();
		System.out.println("The Calculated Sales for the first book is"+ b1.calculateSales((int)numberOfBooks));
		System.out.println("The Calculated Sales for the second book is"+ b2.calculateSales((int)numberOfBooks2));
		priceNew = b1.calculateSales((int)numberOfBooks);
		priceNew2 = b2.calculateSales((int)numberOfBooks2);
		System.out.println("Enter a precentage increase for the first book sale: ");
		double percentagePrice = s.nextDouble();
		System.out.println("Enter a precentage increase for the second book sale: ");
		double percentagePrice2 = s.nextDouble();
		b1.increasePrice(percentagePrice);
		b2.increasePrice(percentagePrice2);
		System.out.println("The final price for the first title is : $"+b1.getPrice());
		System.out.println("The final price for the first title is : $"+b1.getPrice());
		
		
		
		
		
	
		
		
		
		
		
		
		

	}

}
