/*
 *File Name: Address.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Nov 8, 2014
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
public class Address
{
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	/**
	 * @param streetAddress
	 * @param city
	 * @param state
	 * @param zip
	 */
	public Address(String streetAddress, String city, String state, String zip)
	{
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getStreetAddress()
	{
		return streetAddress;
	}
	public String getCity()
	{
		return city;
	}
	public String getState()
	{
		return state;
	}
	public String getZip()
	{
		return zip;
	}
	@Override
	public String toString()
	{
		return " " + streetAddress + " " + city
				+ " " + state + " " + zip;
	}
	
	
	
}
