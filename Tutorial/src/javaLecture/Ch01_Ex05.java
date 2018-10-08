/*
1. Control Statement - For or while
2. More Test
*/

package javaLecture;

public class Ch01_Ex05 {

	public static void main(String[] args) {
		int count; 
		 
	    for(count = 0; count < 5; count = count+1) 
	      System.out.println("This is count: " + count); 
	 
	    System.out.println("Done!"); 
	    
	    // TestMethod: for and if
	    GallonToLiter();
	}

	private static void GallonToLiter() {
		double gallons, liters; 
	    int counter; 
	 
	    counter = 0; 
	    for(gallons = 1; gallons <= 100; gallons++) { 
	      liters = gallons * 3.7854; // convert to liters 
	      System.out.println(gallons + " gallons is " + 
	                         liters + " liters."); 
	 
	      counter++; 
	      // every 10th line, print a blank line        
	      if(counter == 10) { 
	        System.out.println(); 
	        counter = 0; // reset the line counter 
	      } 
	    } 
		
	}

}
