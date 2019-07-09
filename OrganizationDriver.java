import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 *File Name: OrganizationDriver.java
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
public class OrganizationDriver
{

	public static void main(String[] args)
	{
		Scanner inputFile = null;
		File output1 = new File("output_com_List.csv");
		File output2 = new File("output_edu_List.csv");
		File output3 = new File("output_org_List.csv");
		File output4 = new File("output_reject_List.csv");
		Organization organization = null;
		Address address = null;
		Scanner file = new Scanner(System.in);
		System.out.println("Enter the name of the file:");
		String filename = file.nextLine();
		String extension = null;
		PrintWriter outputfile1 = null;
		PrintWriter outputfile2 = null;
		PrintWriter outputfile3 = null;
		PrintWriter outputfile4 = null;
		try
		{
			inputFile = new Scanner(new File(filename));

			while (inputFile.hasNextLine())
			{

				String name = inputFile.nextLine();
				String streetAddress = inputFile.nextLine();
				String city = inputFile.next();
				String state = inputFile.next();
				String zip = inputFile.nextLine();
				String url = inputFile.nextLine();
				address = new Address(streetAddress, city, state, zip);
				organization = new Organization(address, name, url);
				extension = url.substring(url.length() - 3, url.length());
				try
				{
					if (new String("com").equals(extension))
					{
						outputfile1 = new PrintWriter(output1);
						outputfile1.println(organization);

					}
					else if (new String("edu").equals(extension))
					{
						outputfile2 = new PrintWriter(output2);
						outputfile2.println(organization);

					}
					else if (new String("org").equals(extension))
					{
						outputfile3 = new PrintWriter(output3);
						outputfile3.println(organization);

					}
					else
					{
						outputfile4 = new PrintWriter(output4);
						outputfile4.println(organization);

					}

				}
				catch (Exception e)
				{
					System.out.println("Expexcted Error!");
				}
			}
			inputFile.close();
			outputfile1.close();
			outputfile2.close();
			outputfile3.close();
			outputfile4.close();

		}
		catch (FileNotFoundException e)
		{
			System.out.println("File was not found");
		}
	}
}