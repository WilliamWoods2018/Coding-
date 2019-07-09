import java.io.File;
import java.util.Scanner;

/*
 *File Name: PeriodicTableApp.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Dec 1, 2014
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
public class PeriodicTableApp
{

	public static void main(String[] args)
	{
		String filename = "PeriodicTableData.csv";
		final int SIZE = 120;
		Element[] elements = new Element[SIZE];
		Scanner inputfile = null;
		Scanner inputfile2 = null;
		Scanner kb = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		try
		{
			inputfile2 = new Scanner(new File("MolecularWeightInput.txt"));
		}
		catch (Exception e)
		{
			System.out.println("Error, text file has not been found!");
			System.exit(1);
		}
		

		try
		{
			inputfile = new Scanner(new File(filename));
		}
		catch (Exception e)
		{
			System.out.println("File has not been found");
			System.exit(1);
		}

		inputfile.nextLine();

		int count = 0;
		while (inputfile.hasNextLine())
		{
			String line = inputfile.nextLine();
			elements[count] = new Element(line);
			count++;
		}
		PeriodicTable table = new PeriodicTable(elements, count);

		int choice = 0;

		while (choice != 6)
		{
			if (choice == 0)
			{
				System.out.println("Periodic Table Menu");
				System.out.println("");
				System.out.println("1-Display element information");
				System.out.println("2-Display particle information"
						+ "(# of protons, electrons, neutrons)");
				System.out.println("3-Get element with highest boiling point");
				System.out.println("4-Get element with lowest melting points");
				System.out.println("5-Display Molecular mass calculations");
				System.out.println("6-Quit");
				System.out.println("");
				System.out.println("Please enter your choice: ");
				choice = kb.nextInt();

			}
			if (choice == 1)
			{
				table.elementSearch();
				choice = 0;
			}
			if (choice == 2)
			{
				System.out.println("Enter a Chemical Symbol");
				String symbol = input.nextLine();
				table.particleSearch(symbol);
				choice = 0;
			}
			if (choice == 3)
			{
				table.highestBoilingPoint();
				choice = 0; 
			}
			if (choice == 4)
			{
				table.lowestMeltingPoint();
				choice = 0;
			}
			if (choice == 5)
			{
				
				while (inputfile2.hasNextLine())
				{
					String compound = inputfile2.nextLine();
					table.molecularMass(compound);
				}
				choice = 0;
			}
		}

	}

}
