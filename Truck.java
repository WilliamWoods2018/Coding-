/*
 *File Name: Truck.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 30, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <Sets up parameters for trucking detail>
 *
 * @author wwoods
 *
 */
public class Truck
{

	private int cylinders; 
	private String manufacturer;
	private double load; 
	private double tow;
	
	public Truck(int Cylinders,String manufacturer,double load, double tow){
		setCylinders(this.cylinders);
		setManufacturer(this.manufacturer);
		setLoad(this.load);
		setTow(this.tow);
	}
	
	
	public void printTruckInfo(){
		System.out.println("cylinders = "+ getCylinders());
		System.out.println("manufacturer = "+ getManufacturer());
		System.out.println("load = "+ getLoad());
		System.out.println("tow = "+ getTow());
		
	}
	public int getCylinders(){
		return cylinders;
	}
	public void setCylinders(int cylinders){
		this.cylinders = cylinders;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public void setManufacturer(String maunfacturer){
		this.manufacturer = manufacturer;
	}
	public double getLoad(){
		return load;
	}
	public void setLoad(double load){
		this.load = load;
	}
	public double getTow(){
		return tow;
	}
	public void setTow(double tow){
		this.tow = tow;
	}
	
	
}
