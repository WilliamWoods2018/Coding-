/*
 * File name:AddTwoNumbers.java
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


import java.util.Scanner;


/**
 * <Adds two numbers read from the keyboard.>
 *
 * @author wwoods
 *
 */
public class AddTwoNumbers 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Hello");
        System.out.println("I will add two numbers for you.");
        System.out.print("Enter two whole numbers on the same line with a space in between: ");
        
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        
        System.out.print("The sum of those two numbers is ");
        System.out.println(num1 + num2);
        
    }
}
