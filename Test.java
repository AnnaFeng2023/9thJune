package Class3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a single character from the alphabet: ");
	        String input = scanner.nextLine();

	        scanner.close();

	        if (input.length() != 1) {
	            System.out.println("Error: Input should be a single character");
	        } else {
	            char ch = input.charAt(0);
	            if (!Character.isLetter(ch)) {
	                System.out.println("Error: Input is not a letter");
	            } else {
	                ch = Character.toUpperCase(ch);
	                if (isVowel(ch)) {
	                    System.out.println("Vowel");
	                } else {
	                    System.out.println("Consonant");
	                }
	            }
	        }
	    }

	    public static boolean isVowel(char ch) {
	        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	    }


}
