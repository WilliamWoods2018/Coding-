/*
 *File Name: determineAreaByZip.java
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
 * <This program determines the region based on the first digit of the zip code>
 *
 * @author wwoods
 *
 */

public class determineAreaByZipLookup
{

	public String determineAreaByZip(String zipCode){
		String GeographicArea;
		String value = zipCode.substring(0, 1);
		switch(value){
			case "0":
			case "1":
			case "2":
			case "3":
				GeographicArea = "East Coast";
			break;
			case "4":
			case "5":
			case "6":
				GeographicArea = "Central Coast";
			break;
			case "7":
				GeographicArea = "South";
			break;
			case "8":
			case "9":
				GeographicArea = "West";
			default:
				GeographicArea = "Invalid Zip Code!";
				
			
			
		}
		return GeographicArea;
		
		
	
		

	}

}
