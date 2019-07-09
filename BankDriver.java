/*
 *File Name: BankDriver.java
 *
 *Programmer: William Woods
 *ULID: wwoods
 *
 *Date: Nov 5, 2014
 *
 *Class: IT 168
 *Lecture Section: 12
 *Lecture Instructor: Pat Matsuda
 *Lab Section: 12
 *Lab Instructor: Nasiba AL-Rawi  
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author wwoods
 *
 */
public class BankDriver
{

	public static void main(String[] args)
	{
		//File myFile = new File("Transaction.txt");
		Scanner inputFile = null;
		File output = new File("output.txt");
		BankAccount account = null;

		try
		{
			inputFile = new Scanner(new File("Transactions.txt"));
			String accountNumber = inputFile.nextLine();
			String firstName = inputFile.nextLine();
			String lastName = inputFile.nextLine();
			double balance = inputFile.nextDouble();
			account = new BankAccount(accountNumber, firstName,
				lastName, balance);
		while (inputFile.hasNextLine())
		{
			if (inputFile.nextInt() == 1)
			{
				account.processWithdrawal(inputFile.nextDouble());
			}
			else
			{
				account.processDeposit(inputFile.nextDouble());
			}
		}
		inputFile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error: File does not exist!");
		}
		
		
			
		try
		{
			PrintWriter outputFile = new PrintWriter(output);
			outputFile.print(account);
			outputFile.close();
		}
		catch (Exception e)
		{
				System.out.print("Error: Problem with output to file");
		}

		}

	}

