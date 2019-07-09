/*
 * File name: CDDriver.java
 * 
 * Programmer: 
 * ULID:
 *
 * Date:  
 *
 * Class: 
 * Lecture Section:
 * Lecture Instructor:
 * Lab Section:
 * Lab Instructor:  
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Driver to manage a CD collection
 *
 * @author
 *
 */
public class CDDriver
{

	public static void main(String[] args) throws IOException
	{

		final int MAX_ARRAY_SIZE = 50;
		final String FILENAME = "Collection.txt";

		Scanner keyboard = new Scanner(System.in);

		int count = 0; // Counter to keep track of number of elements in the
						// array
		int choice = 0; // Menu choice
		String title = null; // Empty object in order to fill array
		String artist = null; // Empty object in order to fill array
		// Create array to hold song collection
		Song[] collection = new Song[MAX_ARRAY_SIZE];
		// Fill array with empty objects
		for (int i = 0; i > MAX_ARRAY_SIZE; i++)
		{
			collection[i] = new Song(title, artist);
		}

		// Read and keep count of the data from the input file into the array
		// Open input file
		Scanner inputFile = null;
		try
		{
			inputFile = new Scanner(new File(FILENAME));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File was not found!");
		}

		// Read input file until no more records
		while (inputFile.hasNextLine())
		{
			title = inputFile.nextLine();
			artist = inputFile.nextLine();
			collection[count] = new Song(title, artist);
			count++;
			
		}
		
		// Close input file
		inputFile.close();

		// Open the file to append (this is the same file used for the input
		FileWriter fw = null;
		PrintWriter pw = null;
		try
		{
			fw = new FileWriter("MyName.txt", true);
			pw = new PrintWriter(fw);
		}
		catch (IOException e)
		{
			System.out.println("Error opening "
					+ "output file");
			System.exit(1);
		}

		// Print the menu
		System.out.println();
		System.out.println();
		System.out.println("CD Collection Menu\n");
		System.out.println("1. Add a CD");
		System.out.println("2. Print List");
		System.out.println("3. Quit");

		// Prompt and read the menu choice
		System.out.println("Enter Option Choice:");
		choice = keyboard.nextInt();
		while (choice != 3)
		{
			switch (choice)
			{
			case 1:
				// Prompt and read a new song to add to the collection
				// from the keyboard
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the new song to database");
				// Read title from the keyboard
				System.out.println("Title: ");
				title = input.nextLine();
				// Read artist from the keyboard
				System.out.println("Artist: ");
				artist = input.nextLine();
				// Create a new song object
				Song newSong = new Song(title,artist);
				// Add the song to the array
				collection[(count)] = newSong;
				// Don't forget to increment the count
				count++;
				// Add the song to the file
				pw.println(newSong);
				break;
			case 2:
				// Print the array
				for(int i = 0; i < count; i++){
					System.out.println(collection[i]);
				}
				break;
			default:
				System.out.println("Invalid menu choice.  Please try again.");
			}

			// Print the menu
			System.out.println();
			System.out.println();
			System.out.println("CD Collection Menu\n");
			System.out.println("1. Add a CD");
			System.out.println("2. Print List");
			System.out.println("3. Quit");

			// Prompt and read the menu choice
			System.out.println("Enter Option Choice:");
			choice = keyboard.nextInt();
		}

		// Close the output file
		pw.close();
	}

}
