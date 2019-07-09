/*
 *File Name: WidgetProducer.java
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
public class WidgetProducer
{
	private int widgetPerHours;
	final private int HOURS_PER_DAY = 16; 
	
	public WidgetProducer(int widgetPerHours){
		this.widgetPerHours = widgetPerHours;
	}
	
	public double calculateDaysToProduce(int numberWidgets){
		double days = numberWidgets/((double)HOURS_PER_DAY*getWidgetPerHour());
		return days;
		
	}
	
	public int getWidgetPerHour(){
		return widgetPerHours;
	}
	

}
