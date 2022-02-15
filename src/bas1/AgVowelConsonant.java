package bas1;

import java.util.Scanner;

public class AgVowelConsonant {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = reader.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
        

		System.out.println("Enter a character");
		ch = reader.next().charAt(0);
		switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            System.out.println(ch + " is vowel");
            break;
        default:
            System.out.println(ch + " is consonant");
		}
		reader.close();

	}
}
