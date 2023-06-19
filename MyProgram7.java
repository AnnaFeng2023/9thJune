package Class3;

import java.util.Scanner;

public class MyProgram7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalMark;
		char grade;

		Scanner kb = new Scanner(System.in);

		System.out.print("Please Enter the Total Mark: ");
		totalMark = kb.nextDouble();

//		if (totalMark < 50) {//totally wrong
//			grade = 'F';
//		} else if (totalMark >= 50) {
//			grade = 'D';
//		} else if (totalMark >= 65) {
//			grade = 'C';
//		} else if (totalMark >= 75) {
//			grade = 'B';
//		} else {
//			grade = 'A';
//		}
		
		if(totalMark < 50) {
			grade = 'F';
		}else if(totalMark >= 50 && totalMark < 65) {
			grade = 'D';
		}else if(totalMark >= 65 && totalMark < 75) {
			grade = 'C';
		}else if(totalMark >= 75 && totalMark < 85) {
			grade = 'D';
		}else {
			grade = 'A';
		}

		System.out.printf("Based on a total mark of %.2f, the grade is: %s ", totalMark, grade);
		kb.close();

	}

}
