import java.util.Scanner;

/*
 *File Name: PeriodicTable.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Nov 17, 2014
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
public class PeriodicTable
{
	private int count;
	private String symbol1;
	private String symbol2;
	private String symbol3;
	private int amount1;
	private int amount2;
	private int amount3;

	public PeriodicTable(Element[] elements, int count)
	{
		this.elements = elements;
		this.count = count;

	}

	Element[] elements = new Element[count];

	public void elementSearch()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter symbol for the element: ");
		String searchSym = kb.nextLine();
		int listNumber = 0;
		for (int i = 0; i < count; i++)
		{
			if (elements[i].getSymbol().equals(searchSym))
			{
				listNumber = i;
			}

		}
		System.out.printf("\n%s", elements[listNumber].toString());

	}

	public void highestBoilingPoint()
	{
		int highestIndex = 0;
		double highPoint = elements[0].getbPoint();
		for (int i = 0; i < count; i++)
		{
			if (elements[i].getbPoint() > highPoint)
			{
				highPoint = elements[i].getbPoint();
				highestIndex = i;
			}
		}
		System.out.printf("\n%s", elements[highestIndex].toString());
	}

	public void lowestMeltingPoint()
	{
		int lowestIndex = 0;
		System.out.println("The Elements with the lowest melting points");
		double lowPoint = elements[0].getmPoint();
		for (int i = 0; i < count; i++)
		{
			if (elements[i].getmPoint() < lowPoint&& elements[i].getmPoint() > 0)
			{
				
				lowPoint = elements[i].getmPoint();
				lowestIndex = i;
			}
		}
		for (int n = 0; n < count; n++)
		{
			if (elements[n].getmPoint() == lowPoint)
			{
				System.out.printf("\n%s", elements[n].toString());
			}

		}
	}

	public void particleSearch(String symbol)
	{
		int listNumber = 0;
		for (int i = 0; i < count; i++)
		{
			if (elements[i].getSymbol().equals(symbol))
			{
				listNumber = i;
			}

		}

		System.out.println("");
		System.out.println("Particle information for "
				+ elements[listNumber].getChemName());
		System.out.println("Number of Protons: "
				+ elements[listNumber].getaNumber());
		System.out.println("Number of Electrons: "
				+ elements[listNumber].getaNumber());
		System.out.println("Number of Neutrons: "
				+ Math.round(elements[listNumber].getaWeight()));
	}

	public void molecularMass(String compound)
	{
		double total = 0;
		String[] attributes = compound.split(" ");
		if (attributes.length == 4)
		{
			this.symbol1 = attributes[0];
			this.amount1 = Integer.parseInt(attributes[1]);
			this.symbol2 = attributes[2];
			this.amount2 = Integer.parseInt(attributes[3]);
		}
		else
		{
			this.symbol1 = attributes[0];
			this.amount1 = Integer.parseInt(attributes[1]);
			this.symbol2 = attributes[2];
			this.amount2 = Integer.parseInt(attributes[3]);
			this.symbol3 = attributes[4];
			this.amount3 = Integer.parseInt(attributes[5]);
		}
		int listNumber = 0;
		for (int i = 0; i < count; i++)
		{
			if (elements[i].getSymbol().equals(symbol1))
			{
				listNumber = i;
				total += elements[listNumber].getaWeight() * amount1;
			}
			
		}
		listNumber = 0;
		for (int i = 0; i < count; i++)
		{
			if (elements[i].getSymbol().equals(symbol2))
			{
				listNumber = i;
				total += elements[listNumber].getaWeight() * amount2;
			}
			
		}
		if (attributes.length > 3)
		{

			listNumber = 0;
			for (int i = 0; i < count; i++)
			{
				if (elements[i].getSymbol().equals(symbol1))
				{
					listNumber = i;
					total += elements[listNumber].getaWeight() * amount1;
				}
				
			}
		}
		System.out.println(compound + " Has a mass of: " + total);
		total = 0;
	}
}
