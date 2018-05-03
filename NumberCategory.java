/*
 *File Name: NumberCategory.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 1, 2014
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
public class NumberCategory
{

	
	
	public static void main(String[] args)
	{
		Scanner pickNumber = new Scanner(System.in);
		System.out.print("Input an interger of your choice: ");
		int number = pickNumber.nextInt();
		if(number < 0){
			System.out.println(number+ " is Negative");
		}
		else if(number > 0){
			System.out.println(number+ " is Positive");
		}
		else{
			System.out.println(number+ " is zero");
			
		}
		
	}
	
	

}
