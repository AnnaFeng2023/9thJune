package Class3;

import java.util.Scanner;

public class MyProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch(exp) { case val1 : whatever break; case val2: anothor thing... }
		 */

		int monthNum;
		String monthName;
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me number of any month");
		monthNum = kb.nextInt();

		switch (monthNum) {
		case 1:
			monthName = "Jan";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 3:
			monthName = "march";
			break;
		case 4:
			monthName = "apr";
			break;
		case 5:
			monthName = "may";
			break;
		case 6:
			monthName = "june";
			break;
		case 7:
			monthName = "july";
			break;
		case 8:
			monthName = "aug";
			break;
		case 9:
			monthName = "sep";
			break;
		case 10:
			monthName = "oct";
			break;
		case 11:
			monthName = "nov";
			break;
		case 12:
			monthName = "Dec";
			break;
		default: 
			monthName = "there is no such a thing";
			break;
		}
		
		System.out.println("you enterd " + monthName);

	}

}
