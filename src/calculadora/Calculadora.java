package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Type the first number");
		a = scan.nextInt();
		
		System.out.println("Type the second number");
		b = scan.nextInt();
		
		int resultSum = sum(a,b);
		int resultSub = sub(a,b);
		int resultTim = tim(a,b);
		int resultDiv = div(a,b);
		
		System.out.println("The result of the sum is: " + resultSum);
		System.out.println("The result of the subtraction is: " + resultSub);
		System.out.println("The result of the multiplication is: " + resultTim);
		System.out.println("The result of the division is: " + resultDiv);
	}
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static int div(int a, int b) {
		return a / b;
	}
	
	public static int tim(int a, int b) {
		return a * b;
	}

}
