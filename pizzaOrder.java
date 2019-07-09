/*
 *File Name: pizzaOrder.java
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
public class pizzaOrder

{

	final private double tax = .025;
	final private double carryOutCharge = .1;
	final private double cheesePrice = 2.40;
	final private double sausagePrice = 3.00;
	final private double pepperoniPrice = 3.00;
	final private double veggiePrice = 3.50;
	private int numberOfCheese; 
	private int numberOfSausage;
	private int numberOfPepperoni;
	private int numberOfVeggie; 
	
	public void setNumberOfCheese(int numberOfCheese){
		this.numberOfCheese = numberOfCheese;
	}
	public void setNumberOfSausage(int numberOfSausage){
		this.numberOfSausage = numberOfSausage;
	}
	public void setNumberOfPepperoni(int numberOfPepperoni){
		this.numberOfPepperoni = numberOfPepperoni;
	}
	public void setNumberOfVeggie(int numberOfVeggie){
		this.numberOfVeggie = numberOfVeggie;
	}
	public int getNumberOfCheese(){
		return numberOfCheese;
	}
	public int getNumberOfSausage(){
		return numberOfSausage;
	}
	public int getNumberOfPepperoni(){
		return numberOfPepperoni;
	}
	public int getNumberOfVeggie(){
		return numberOfVeggie; 
	}
	public double getCheesePrice(){
		return cheesePrice;
	}
	public double getSausagePrice(){
		return sausagePrice;	
	}
	public double getPepperoniPrice(){
		return pepperoniPrice;
	}
	public double getVeggiePrice(){
		return veggiePrice;
	}
	public double calculatePizzaOrderCost(){
		double subTotal = ((getNumberOfCheese()*getCheesePrice())+(getNumberOfSausage()*getSausagePrice())+(getNumberOfPepperoni()*getPepperoniPrice())+(getNumberOfVeggie()*getVeggiePrice()));
		return subTotal;
		
	}
	public double calculateTax(){
		double taxTotal = (calculatePizzaOrderCost()*tax);
		return taxTotal;
		
	}
	public double calculateCarryCharge(){
		double carryOut = ((calculatePizzaOrderCost()+calculateTax())*carryOutCharge);
		return carryOut;
	}
	public double calculateTotal(){
		double total = calculatePizzaOrderCost()+calculateTax()+calculateCarryCharge();
		return total;
		
	}
}
