package bas1;

import java.util.Scanner;

public class AfForLoop {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; ++i) {
		      System.out.println("Java is fun");
		    }
		int fact = 1;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number to do factorial");
	    int n1 = reader.nextInt();

	    // for loop
	    for (int i = 1; i <= n1; ++i) {
	      // body inside for loop
	      fact *= i;     // sum = sum + i
	    }
	       
	    System.out.println("fact = " + fact);
	    reader.close();
	    
		/*
		 * for (int i = 1; i <= 10; --i) { System.out.println("Hello"); }
		 */
	}
}
