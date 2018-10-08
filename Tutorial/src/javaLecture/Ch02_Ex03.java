/*
1. Operator
*/
package javaLecture;

public class Ch02_Ex03 {

	public static void main(String[] args) {
		
		PercentOperator();
		RelationalLogicalOperator();
	}

	private static void RelationalLogicalOperator() {
		int i, j; 
	    boolean b1, b2; 
	 
	    i = 10; 
	    j = 11; 
	    if(i < j) System.out.println("i < j"); 
	    if(i <= j) System.out.println("i <= j"); 
	    if(i != j) System.out.println("i != j"); 
	    if(i == j) System.out.println("this won't execute"); 
	    if(i >= j) System.out.println("this won't execute"); 
	    if(i > j) System.out.println("this won't execute"); 
	 
	    b1 = true; 
	    b2 = false; 
	    if(b1 & b2) System.out.println("this won't execute"); 
	    if(!(b1 & b2)) System.out.println("!(b1 & b2) is true"); 
	    if(b1 | b2) System.out.println("b1 | b2 is true"); 
	    if(b1 ^ b2) System.out.println("b1 ^ b2 is true"); 		
	}

	private static void PercentOperator() {
		int iresult, irem; 
	    double dresult, drem; 
	 
	    iresult = 10 / 3; 
	    irem = 10 % 3; 
	 
	    dresult = 10.0 / 3.0; 
	    drem = 10.0 % 3.0;  
	 
	    System.out.println("Result and remainder of 10 / 3: " + 
	                       iresult + " " + irem); 
	    System.out.println("Result and remainder of 10.0 / 3.0: " + 
	                       dresult + " " + drem); 
	}

}
