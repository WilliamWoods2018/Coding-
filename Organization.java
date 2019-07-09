/*
 *File Name: Organization.java
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
public class Organization
{
	private Address address;
	private String name;
	private String url;
	/**
	 * @param address
	 * @param name
	 * @param url
	 */
	public Organization(Address address, String name, String url)
	{
		super();
		this.address = address;
		this.name = name;
		this.url = url;
	}
	public Address getAddress()
	{
		return address;
	}
	public String getName()
	{
		return name;
	}
	public String getUrl()
	{
		return url;
	}
	@Override
	public String toString()
	{
		return " " + name +" " + address + " "
				+ url + " ";
	} 
	
	
}
