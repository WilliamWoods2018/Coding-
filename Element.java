/*
 *File Name: Element.java
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
public class Element
{
	private String chemName = null;
	private int aNumber;
	private String symbol = null;
	private double bPoint;
	private double mPoint;
	private double density;
	private double aWeight;

	/**
	 * 
	 */
	public Element(String elementList)
	{
		String[] attributes = elementList.split(",");
		this.chemName = attributes[0];
		this.aNumber = Integer.parseInt(attributes[1]);
		this.symbol = attributes[2];
		if (attributes[3].equals(""))
		{
			this.bPoint = 0;
		}
		else
		{
			this.bPoint = Double.parseDouble(attributes[3]);
		}
		if (attributes[4].equals(""))
		{
			this.mPoint = 0;
		}
		else
		{
			this.mPoint = Double.parseDouble(attributes[4]);
		}
		if (attributes[5].equals(""))
		{
			this.density = 0;
		}
		else
		{
			this.density = Double.parseDouble(attributes[5]);
		}
		if (attributes[6].equals(""))
		{
			this.aWeight = 0;
		}
		else
		{
			this.aWeight = Double.parseDouble(attributes[6]);

		}
	}

	public String getChemName()
	{
		return chemName;
	}

	public int getaNumber()
	{
		return aNumber;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public double getbPoint()
	{
		return bPoint;
	}

	public double getmPoint()
	{
		return mPoint;
	}

	public double getDensity()
	{
		return density;
	}

	public double getaWeight()
	{
		return aWeight;
	}

	@Override
	public String toString()
	{
		return "Element Information:\n\nElement Name: " + chemName + "\nSymbol: " + symbol
				+ "\nAtomic Number: " + aNumber + "\nBoiling Point: " + bPoint
				+ " Kelvin \nMelting Point: " + mPoint + " Kelvin\nDensity: "
				+ density + " g/L\nMolecular Weight: " + aWeight + " g/mole";
	}

}
