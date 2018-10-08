/*
1. Each data type exercise
2. For other data type in more detail, let student to look for reference
*/

package javaLecture;

public class Ch02_Ex01 {

	public static void main(String[] args) {		
		
		charTest();
		doubleTest();
		boolTest();
		stringEscapeSequenceTest();
	}

	private static void stringEscapeSequenceTest() {
		// Escape Sequence
		System.out.println("First line\nSecond line"); 
	    System.out.println("A\tB\tC"); 
	    System.out.println("D\tE\tF"); 
	    
	    // Look for other escape sequence
		
	}

	private static void boolTest() {
		boolean b; 
		 
	    b = false; 
	    System.out.println("b is " + b); 
	    b = true; 
	    System.out.println("b is " + b); 
	 
	    // a boolean value can control the if statement 
	    if(b) System.out.println("This is executed."); 
	 
	    b = false; 
	    if(b) System.out.println("This is not executed."); 
	 
	    // outcome of a relational operator is a boolean value 
	    System.out.println("10 > 9 is " + (10 > 9)); 
		
	}

	private static void doubleTest() {
		
		// Pythagorean theorem
		double x, y, z; 
		 
	    x = 3; 
	    y = 4; 
	 
	    z = Math.sqrt(x*x + y*y); 
	 
	    System.out.println("Hypotenuse is " +z); 
		
	}

	private static void charTest() {		
		// Character variables can be handled like integers.  
		// if operator is used with char type, then it would be considered as ASCII code							
		char ch; 
		 
	    ch = 'X'; 
	    System.out.println("ch contains " + ch); 
	 
	    ch++; // increment ch 
	    System.out.println("ch is now " + ch); 
	 
	    ch = 90; // give ch the value Z 
	    System.out.println("ch is now " + ch); 		
	}

}
