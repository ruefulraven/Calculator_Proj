package main;

import java.util.Scanner;

public class MainClass{

	public static void main(String[] args) {
		//Ask the user to input 2 numbers, ask the user to input either symbols + - * /
		//Depending on the symbol, do the appropriate calculator method.
		int firstNumber, secondNumber;
		String symbol;
		//Make this into a Dynamic Calculator that accepts user input
		//Addition
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number:");
		secondNumber = scanner.nextInt();
		System.out.println("Enter calculator operation:");
		symbol = scanner.next();
		Calculator calculator = new Calculator();
		Calculator2 calculator2 = new Calculator2();
		switch(symbol) {
			case "+":
				System.out.println("This is Addition "  + calculator.addition(firstNumber, secondNumber));
				System.out.println("This is Addition "  + calculator2.addition(firstNumber, secondNumber));
				break;
			case "-":
				System.out.println("This is Subtraction "  + calculator.subtraction(firstNumber, secondNumber));
				break;
			case "*":
				System.out.println("This is Multiplication "  + calculator.multiplication(firstNumber, secondNumber));
				break;
			case "/":
				System.out.println("This is Division "  + calculator.division(firstNumber, secondNumber));
				break;
		}
		scanner.close();
	}
}
