/*
 * Filename:
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



/**
 * Write and test arithmetic expressions
 *
 * @author 
 *
 */
public class ArithmeticExpressions {

	public static void main(String[] args) {
		// Constant declaration
		double height;
		double base1;
		double base2;
		int fahrenheit;
		int expected;
		int observed;
		int freezing;
		double area;
		double celsius;
		double PrecentageOfDifferance;
		
		
		// Variable declarations and initializations
		height = 9.0;
		base1 = 5.0;
		base2 = 10.0;
		fahrenheit = 78;
		expected = 89;
		observed = 78;
		freezing = 32;
		
		// Problem 17
		area = (height/2)*(base1 + base2);
		System.out.println("area = "+ area);
		
		
		
		// Problem 18
		celsius = ((double)5/9)*(fahrenheit-freezing);
		System.out.println("celsius = "+ celsius);
		
		
		
		// Problem 19
		PrecentageOfDifferance = ((double)(expected-observed)/expected)*100;
		System.out.println("Precentage Of Differance = "+ PrecentageOfDifferance);
		
		
		
		
		
	
		
		
	}

}
