package calculator;

import java.util.Scanner;

import calculator.operations.Operation;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insert first number: ");
		Double a = s.nextDouble(); s.nextLine();
		System.out.println("Insert the operator: ");
		String op = s.nextLine();
		System.out.println("Insert second number: ");
		Double b = s.nextDouble();
		
		Operation o = Operation.parseOperator(op);
		if (o == null) {
			System.err.println("Operator not recognized!");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result of " + o.getName() + " is " + o.calc());
		}
		s.close();
	}
	
}
