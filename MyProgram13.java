package Class3;

public class MyProgram13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "PARGOL";
		String name2 = "pargol";
		
//		if(name1 == name2) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("no");
//		}
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}
		
	}

}
