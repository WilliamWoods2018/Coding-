/*
 *File Name: Circle.java
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


public class Circle
{

	private final double PI = 3.14159; 
	private double radius; 
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	public double calaulateArea(){
		double area = PI*getRadius()*getRadius();
		return area;
		
	 
	 
 }
	public double calculateDiameter(){
		double diameter = getRadius() * 2;
		return diameter;
				
		
	}
	
	public double calculateCircumference(){
		double circumference = 2 * PI * getRadius();
		return circumference;
		
				
	}
	public void setRadius(double radiusNew){
		radius = radiusNew;
	}
	public double getRadius(){
		return radius;
		
	}
	
	
	
	
	

}
