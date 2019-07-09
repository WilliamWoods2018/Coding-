/*
 *File Name: pizzaOrderApp.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 24, 2014
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
public class pizzaOrderApp
{

	
	public static void main(String[] args)
	{
		pizzaOrder order1 = new pizzaOrder();
		Scanner s = new Scanner(System.in);
		String menu = "Pizza Shop Menu";
		System.out.print("\t\tPizza Shop Menu");
		System.out.println("\nCheese\t\t\t\t\t$2.40");
		System.out.println("Sausage\t\t\t\t\t$3.00");
		System.out.println("Pepperoni\t\t\t\t$3.00");
		System.out.println("Vegetarian Special\t\t\t$3.50\n\n");
		System.out.println("Enter The number of cheese slices: ");
		int numberOfCheese = s.nextInt();
		System.out.println("Enter The number of sausage slices: ");
		int numberOfSausage = s.nextInt();
		System.out.println("Enter The number of pepperoni slices: ");
		int numberOfPepperoni = s.nextInt();
		System.out.println("Enter The number of vegetarian special: ");
		int numberOfVeggie = s.nextInt();
		System.out.println("\n\n\t\tPizza Shop Order Summary\n\n");
		System.out.println("\t\t\t\t\tPizza Slice Ordered");
		System.out.println("Cheese\t\t\t\t\t\t"+numberOfCheese);
		System.out.println("Sausage\t\t\t\t\t\t"+numberOfSausage);
		System.out.println("Pepperoni\t\t\t\t\t"+numberOfPepperoni);
		System.out.println("Vegetarian Special\t\t\t\t"+numberOfVeggie);
		order1.setNumberOfCheese(numberOfCheese);
		order1.setNumberOfSausage(numberOfSausage);
		order1.setNumberOfPepperoni(numberOfPepperoni);
		order1.setNumberOfVeggie(numberOfVeggie);
		System.out.printf("\nSub-Total:  \t$%.2f", order1.calculatePizzaOrderCost());
		System.out.printf("\nTax: \t\t$%.2f", order1.calculateTax());
		System.out.printf("\nCarry-out: \t$%.2f", order1.calculateCarryCharge());
		System.out.printf("\nTotal Bill: \t$%.2f", order1.calculateTotal());
		
		
		
		
		
		

	}

}
