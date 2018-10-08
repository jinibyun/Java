/*
1. Variables scope
2. Varialbe Life Time
3. How not to define variables
*/
package javaLecture;

public class Ch02_Ex02 {

	public static void main(String[] args) {
		scopeTest();
		variableLifeTimeScope();
		NotDefineThisWay();
	}

	private static void variableLifeTimeScope() {
		int x;  
		 
	    for(x = 0; x < 3; x++) { 
	      int y = -1; // y is initialized each time block is entered 
	      System.out.println("y is: " + y); // this always prints -1 
	      y = 100;  
	      System.out.println("y is now: " + y); 
	    } 		
	}

	private static void scopeTest() {
		int x; // known to all code within main 
		 
	    x = 10; 
	    if(x == 10) { // start new scope
	      int y = 20; // known only to this block 
	 
	       // x and y both known here. 
	       System.out.println("x and y: " + x + " " + y); 
	       x = y * 2; 
	    } 
	    // y = 100; // Error! y not known here  
	 
	    // x is still known here. 
	    System.out.println("x is " + x); 
		
	}
	
	private static void NotDefineThisWay() {
//		int count;  
//		 
//	    for(count = 0; count < 10; count = count+1) { 
//	      System.out.println("This is count: " + count);  
//	     
//	      int count; // illegal!!! 
//	      for(count = 0; count < 2; count++) 
//	        System.out.println("This program is in error!"); 
//	    } 
	}

}
