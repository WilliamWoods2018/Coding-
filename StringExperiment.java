/*
 *File Name: StringExperiment.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Sep 10, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <This class will have the ablity to print different variations of a person's name>
 *
 * @author wwoods
 *
 */
public class StringExperiment
{

	/**
	 * @param args
	 * @param  
	 */
	public static void main(String[] args)
	{
		String firstName = "William";
		String middleName = "Demetrius";
		String lastName = "Woods";
		int lastNameLenght = lastName.length();
		int middleNameLenght = middleName.length();
		int firstNameLenght = firstName.length();
		
		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(firstName + " " + middleName.charAt(0)+ ". " + lastName);
		System.out.println(firstName.toUpperCase()+ " " + lastName.toLowerCase());
		System.out.println("Length of last name = "+ lastNameLenght);
		System.out.println("Middle letter in middle name is: "+ middleName.charAt(middleNameLenght/2));
		System.out.println("Last letter in first name is: "+ firstName.charAt(firstNameLenght-1));
		
		
		
		
			

	}

}
