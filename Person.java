/*
 *File Name: Person.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 22, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <A program that sets the attributes for a person>
 *
 * @author wwoods
 *
 */
public class Person
{
	private String firstName;
	private String lastName;
	private int age;
	/**
	 * this class takes in the attributes for this class.
	 * 
	 * @param firstName sets the first name for a person
	 * @param lastName sets the last name for a person
	 * @param age sets the age for a person
	 */
	public Person(String firstName, String lastName, int age)
	{
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return firstName +" "+ lastName +" "+ age+ " " + "years old";
	}
	public boolean equals(Person other)
	{
		if(firstName == other.getFirstName() && lastName == other.getLastName())
		{
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	
}
