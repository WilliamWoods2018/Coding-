/*
 *File Name: Gradebook.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Oct 21, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */

/**
 * <This program will provide methods to display gradebook>
 *
 * @author wwoods
 *
 */
public class Gradebook
{
	int numberA;
	int numberB;
	int numberC;
	int numberD;
	int numberF;

	/**
	 * @param numberA
	 * @param numberB
	 * @param numberC
	 * @param numberD
	 * @param numberF
	 */
	public Gradebook(int numberA, int numberB, int numberC, int numberD,
			int numberF)
	{
		this.numberA = numberA;
		this.numberB = numberB;
		this.numberC = numberC;
		this.numberD = numberD;
		this.numberF = numberF;
	}

	public int getNumberA()
	{
		return numberA;
	}

	public void setNumberA(int numberA)
	{
		this.numberA = numberA;
	}

	public int getNumberB()
	{
		return numberB;
	}

	public void setNumberB(int numberB)
	{
		this.numberB = numberB;
	}

	public int getNumberC()
	{
		return numberC;
	}

	public void setNumberC(int numberC)
	{
		this.numberC = numberC;
	}

	public int getNumberD()
	{
		return numberD;
	}

	public void setNumberD(int numberD)
	{
		this.numberD = numberD;
	}

	public int getNumberF()
	{
		return numberF;
	}

	public void setNumberF(int numberF)
	{
		this.numberF = numberF;
	}

	public int totalNumberGrades()
	{
		return numberA + numberB + numberC + numberD + numberF;
	}

	public void drawBarGraph()
	{
	System.out.print("A\t");
		for (int i = 0; i != numberA; i++)
		{
			System.out.print("*");
		}
	System.out.print(" "+ numberA);
	System.out.print("\n");
	System.out.print("B\t");
	for(int i = 0;i != numberB; i++){
		System.out.print("*");
	}
	System.out.print(" "+ numberB);
	System.out.print("\n");
	System.out.print("C\t");
	for(int i = 0;i != numberC; i++){
		System.out.print("*");
	}
	System.out.print(" "+ numberC);
	System.out.print("\n");
	System.out.print("D\t");
	for(int i = 0;i != numberD; i++){
		System.out.print("*");
	}
	System.out.print(" "+ numberD);
	System.out.print("\n");
	System.out.print("F\t");
	for(int i = 0;i != numberF; i++){
		System.out.print("*");
	}
	System.out.print(" "+ numberF);
	System.out.print("\n");
	
	}
}