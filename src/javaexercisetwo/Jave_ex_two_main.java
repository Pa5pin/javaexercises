package javaexercisetwo;

public class Jave_ex_two_main {
	
	public static void addition(int num1, int num2) {
		
		int answer = num1 + num2;
		System.out.println(answer);
		
	}
	
	public static void multiplication(int num1, int num2) {
		
		int answer = num1 * num2;
		System.out.println(answer);
	}
	
		public static void division(int num1, int num2) {
		
		int answer = num1 / num2;
		System.out.println(answer);
	}
		public static void subtraction(int num1, int num2) {
			
			int answer = num1 - num2;
			System.out.println(answer);
		}

	public static void main(String[] args) {
		
		addition(1, 2);
		multiplication(2, 4);
		division(10, 2);
		subtraction (8, 4);
	}

}
