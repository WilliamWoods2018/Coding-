/*
 * Filename:
 *
 * Programmer:
 * ULID: 
 *
 * Date:  
 *
 * Class:  
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */


import java.util.Scanner;

/**
 * <insert class description here> 
 *
 * @author 
 *
 */
public class DivideTwo
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int numerator = 0;
		int denominator = 0;
		double quotient = 0;
		
		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator:  ");
		numerator = keyboard.nextInt();
		
		System.out.print("Enter the denominator:  ");
		denominator = keyboard.nextInt();
		
		if(denominator == 0);
			System.out.println("Division by zero is not allowed");
			System.out.println("Enter the denominator:  ");
			denominator = keyboard.nextInt();
			
		
		quotient = (double) numerator / denominator;
		
		System.out.println(numerator + "/" + denominator + " = " + quotient);
		
		keyboard.close();
	}

}
