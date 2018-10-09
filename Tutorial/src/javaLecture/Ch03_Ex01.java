/*
Control Statement - More Example with other concept
	Another - throws exception
*/
package javaLecture;

public class Ch03_Ex01 {

	public static void main(String[] args) throws java.io.IOException {
		guessTheLetter(); // if statement in real program
		complexControlStatement();
		swithStatement();
		negativeLoop();
		forLoopWithMoreVariables();
		loopUntilCertainCharTyped();
	}

	private static void loopUntilCertainCharTyped() throws java.io.IOException {
		int i; 
		 
	    System.out.println("Press S to stop."); 
	 
	    for(i = 0; (char) System.in.read() != 'S'; i++) 
	      System.out.println("Pass #" + i); 
		
	}

	private static void forLoopWithMoreVariables() {
		int i, j; 
		 
	    for(i=0, j=10; i < j; i++, j--) 
	      System.out.println("i and j: " + i + " " + j); 		
	}

	private static void negativeLoop() {
		int x; 
		 
	    for(x = 100; x > -100; x -= 5) 
	      System.out.println(x); 		
	}

	private static void swithStatement() {
		int i; 		 
	    for(i=0; i<10; i++) 
	      switch(i) { 
	        case 0:  
	          System.out.println("i is zero"); 
	          break; // when testing, omit break to see what happens.
	        case 1:  
	          System.out.println("i is one"); 
	          break; 
	        case 2:  
	          System.out.println("i is two"); 
	          break; 
	        case 3:  
	          System.out.println("i is three"); 
	          break; 
	        case 4:  
	          System.out.println("i is four"); 
	          break; 
	        default:  
	          System.out.println("i is five or more"); 
	      } 
	}

	private static void complexControlStatement() {
		int x; 
		  
	    for(x=0; x<6; x++) {  
	      if(x==1) 
	        System.out.println("x is one");  
	      else if(x==2)  
	        System.out.println("x is two"); 
	      else if(x==3)  
	        System.out.println("x is three");  
	      else if(x==4)  
	        System.out.println("x is four");  
	      else  
	        System.out.println("x is not between 1 and 4");  
	    } 
		
	}

	private static void guessTheLetter() throws java.io.IOException {
	    char ch, answer = 'K'; 
	 
	    System.out.println("I'm thinking of a letter between A and Z."); 
	    System.out.print("Can you guess it: "); 
	 
	    ch = (char) System.in.read(); // read a char from the keyboard 
	    
	    if(ch == answer) System.out.println("** Right **"); 
	}

}
