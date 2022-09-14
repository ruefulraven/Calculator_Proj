package main;

public class Calculator implements CalculatorMethods{

	@Override
	public int addition(int firstNumber, int secondNumber) {
		int sum = firstNumber + secondNumber;
		return sum;
	}

	@Override
	public int subtraction(int firstNumber, int secondNumber) {
		int difference = firstNumber - secondNumber;
		return difference;
	}

	@Override
	public int multiplication(int firstNumber, int secondNumber) {
		int product = firstNumber * secondNumber;
		return product;
	}

	@Override
	public int division(int firstNumber, int secondNumber) {
		int quotient = firstNumber / secondNumber;
		return quotient;
	}

}
