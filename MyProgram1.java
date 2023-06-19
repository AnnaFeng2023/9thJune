package Class3;

import java.util.Scanner;

public class MyProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me value for a: ");
		int a = kb.nextInt();
		System.out.println("Please give me value for b: ");
		int b = kb.nextInt();
		
		System.out.println("Before swapping : a is " + a + " and b is "+ b);
		int temp = a; 
		a = b; 
		b = temp;
		System.out.println("After swapping : a is " + a + " and b is "+ b);
		
	}

}
