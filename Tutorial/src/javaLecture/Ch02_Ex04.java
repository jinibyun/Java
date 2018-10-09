/*
1. Type Conversion: 
	implicit conversion: Automatic
 	explicit conversion
*/

package javaLecture;

public class Ch02_Ex04 {

	public static void main(String[] args) {
		automaticConversion();
		no_automaticConversion();
		explicitConversion();
		moreConversionExample();
	}

	private static void moreConversionExample() {
		byte b; 
	    int i; 
	   
	    b = 10; 
	    i = b * b; // OK, no cast needed 
	 
	    b = 10; 
	    b = (byte) (b * b); // cast needed!! 
	 
	    System.out.println("i and b: " + i + " " + b); 
		
	}

	private static void explicitConversion() {		
		double x, y; 
	    byte b; 
	    int i; 
	    char ch; 
	 
	    x = 10.0; 
	    y = 3.0; 
	 
	    i = (int) (x / y); // cast double to int 
	    System.out.println("Integer outcome of x / y: " + i); 
	 
	    i = 100; 
	    b = (byte) i;  
	    System.out.println("Value of b: " + b); 
	 
	    i = 257; 
	    b = (byte) i;  
	    System.out.println("Value of b: " + b); 
	 
	    b = 88; // ASCII code for X 
	    ch = (char) b; 
	    System.out.println("ch: " + ch);
	    
	    
	    for(int i1 = 0; i1 < 5; i1++) { 
	      System.out.println(i1 + " / 3: " + i1 / 3); 
	      System.out.println(i1 + " / 3 with fractions: " 
	                         + (double) i1 / 3); 
	      System.out.println(); 
	    }
	}

	private static void no_automaticConversion() {
		// NOTE: This will not compile
//		long L; 
//	    double D; 
//	   
//	    D = 100123285.0; 
//	    L = D; // Illegal!!! 
//	   
//	    System.out.println("L and D: " + L + " " + D); 
		
	}

	private static void automaticConversion() {
		long L; 
	    double D; 
	   
	    L = 100123285L; 
	    D = L; 
	   
	    System.out.println("L and D: " + L + " " + D); 		
	}

}
