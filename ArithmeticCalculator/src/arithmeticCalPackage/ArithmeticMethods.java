package arithmeticCalPackage;

import java.util.Scanner;

public class ArithmeticMethods {
	String operator;
	double number1;
	double number2;
	double result;
	
	public void enterNumbers() {
		Scanner firstNumber = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		number1 = firstNumber.nextDouble();
		
		Scanner operation = new Scanner(System.in);
		System.out.println("Enter an Operator");
		operator = operation.next();
		
		Scanner secondNumber = new Scanner(System.in);
		System.out.println("Enter 2nd Number");
		number2 = secondNumber.nextDouble();
	}
	
	public void verifyOperation() {
		if(operator.equals("+")) {
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			
		}else if(operator.equals("-")) {
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			
		}else if(operator.equals("*")) {
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			
		}else if(operator.equals("/")) {
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			
		}else {
			System.out.println("Invalid Operation");
		}
	}
}
