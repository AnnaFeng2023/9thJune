package Class3;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MIN_AGE = 18;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me your age ? ");
		int age = kb.nextInt();
		
		if(age < MIN_AGE) {
			System.out.println("Sorry your age is not legal age");
			System.out.println("Smoking is bad for your health");
		}else {
			System.out.println("you can buy this ");
			System.out.println("show some id to cashier");
		}
		
		System.out.println("End of prog");
		
		kb.close();
		
	}

}
