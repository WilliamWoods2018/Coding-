/*
 *File Name: Book.java
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
 * <Holds the varibles need to make the book>
 *
 * @author wwoods
 *
 */
public class Book
{
	private final double SALES_TAX = .075;
	private String title;
	private double price; 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	public void increasePrice(double increasePercent){
		price = price*(1+increasePercent);
	}
	public double calculateSales(int numberOfBooks){
		price = (numberOfBooks * price)*(1+SALES_TAX);
		return price;
	
	}
	public String getTitle(){
		return title;
	}
	public double getPrice(){
		return price;
	}
	public double getSalesTax(){
		return SALES_TAX;
	}
	public void setTitle(String titleNew){
		title = titleNew;
	
	}
	public void setPrice(double priceNew){
		price = priceNew;
	}
}
