package bas1;

import java.util.Scanner;

public class AcArithOperations {
	public static void main(String[] args) {
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter two numbers");
	    // nextInt() reads the next integer from the keyboard
	    int first = reader.nextInt();
	    int second = reader.nextInt();
	    
	    System.out.println(first + " " + second);

	    // add two numbers
	    int sum = first + second;
	    System.out.println("The sum is: " + sum);

	    // diff between two numbers
	    int diff = first - second;
	    System.out.println("The differs is: " + diff);

	    // multiply two numbers
	    int mul = first * second;
	    System.out.println("The product is: " + mul);

	    // division two numbers
	    int div = first / second;
	    System.out.println("The div is: " + div);

	    // finding the remainder
	    int rem = first % second;
	    System.out.println("The remainder is: " + rem);
	    
	    
        float firstf = 1.5f;
        float secondf = 2.0f;

        float productf = firstf * secondf;

        System.out.println("The product is: " + productf);
        
        firstf=reader.nextFloat();
        secondf=reader.nextFloat();
        productf = firstf * secondf;

        System.out.println("The product is: " + productf);
	    
	    reader.close();
	    
	}
}
