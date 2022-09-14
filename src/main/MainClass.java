package main;

public class MainClass {

	public static void main(String[] args) {
		//Ask the user to input 2 numbers, ask the user to input either symbols + - * /
		//Depending on the symbol, do the appropriate calculator method.
		int firstNumber, secondNumber;
		String symbol;
		//Make this into a Dynamic Calculator that accepts user input
		//Addition
		Calculator calculator = new Calculator();
		System.out.println("This is Addition "  + calculator.addition(1, 1));
		System.out.println("This is Subtraction "  + calculator.subtraction(1, 1));
		System.out.println("This is Multiplication "  + calculator.multiplication(3, 3));
		System.out.println("This is Division "  + calculator.division(20, 2));
	}

}
