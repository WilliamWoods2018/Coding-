/*
 *File Name: RestaurantBillCalculator.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 3, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <This program provides the payment needed to pay for a bill at a restaurant>
 *
 * @author wwoods
 *
 */
public class RestaurantBillCalculator
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final double TIP_PERCENTAGE = 0.15;
		final double TAX_RATE = 0.075;
		double MEAL_COST = 45.75;
		double TAX = 0;
		double TIP_AMOUNT = 0;
		double TOTAL_AMOUNT = 0;
		
		TAX = MEAL_COST * TAX_RATE;
		TIP_AMOUNT = MEAL_COST * TIP_PERCENTAGE;
		TOTAL_AMOUNT = MEAL_COST + TIP_AMOUNT + TAX;
		
		System.out.println("Meal Cost: $"+ MEAL_COST);
		System.out.println("Tax: $"+ TAX);
		System.out.println("Tip: $"+ TIP_AMOUNT);
		System.out.println("Total: $"+ TOTAL_AMOUNT);
		
		

	}

}
