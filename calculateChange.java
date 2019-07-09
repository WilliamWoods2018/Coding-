/*
 *File Name: calculateChange.java
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
 * <This program will provide a calculation for giving change back after providing a value>
 *
 * @author wwoods
 *
 */
import java.util.Scanner;
public class calculateChange
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int value;
		int quarters;
		int dimes;
		int nickels;
		boolean valid = true; 
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Item price must be 25 to a dollar, in 5-cent increments");
		System.out.print("Enter item Price: ");
		value = keyboard.nextInt();
		
		if(value < 25){
			
			System.out.println("Cost is invalid - it must be at least 25 cents");
			valid = false;
		}
		else if(value > 100){
			System.out.println("Cost is invalid - it must be less then 100 cents");
			valid = false; 
		}
		if(value % 5 != 0){
			System.out.println("Cost is invalid - it must be evenly divisible by 5");
			valid = false;
		}
		if(valid){
			 value = 100 - value;
			 quarters = value / 25;
			 value = value - (quarters*25);
			 dimes = value / 10;
			 value = value - (dimes*10);
			 nickels = value / 5; 
		
			 if(quarters != 0){
				 if(quarters == 1){
					 System.out.println(quarters + " quarter");
				}
				 else{
					 System.out.println(quarters + " quarters");
				}
			 }
			 if(dimes != 0){
				 if(dimes == 1){
					 System.out.println(dimes + " dime");
				}
				 else{
					 System.out.println(dimes + " dimes");
				 }
			 }
			 if(nickels != 0){
				 if(nickels == 1){
					 System.out.println(nickels + " nickel");
					}
				 else{
					 System.out.println(nickels + " nickels"); 
				 }
			 }
		}
		keyboard.close();

	}
		

}
