/*
 *File Name: PersonDriver.java
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
 * <The driver Class that operates the Person class >
 *
 * @author wwoods
 *
 */
public class PersonDriver
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Person person1 = new Person("Jalen","Manning",24);
		Person person2 = new Person("Jalen","Manning",21);
		if (person1.equals(person2)){
			System.out.print(person1.toString()+ " and \n" + person2.toString() 
					+ "\nhave same names.");
		}
		else{
			System.out.print(person1.toString()+ " and \n" + person2.toString() 
					+ "\nhave different names.");
		}
		if (person1.getAge() > person2.getAge()){
			System.out.print("\n" + person1.toString()+ " is older \n" + person2.toString() );
		}
		else{
			System.out.print("\n" + person1.toString()+ " is younger \n" + person2.toString() );
			
		}

	}
}
