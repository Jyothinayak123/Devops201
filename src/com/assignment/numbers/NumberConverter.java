package com.assignment.numbers;

import java.util.Scanner;

public class NumberConverter {

	public boolean convertToString(String inputNumber, Scanner scanner) {
		int number;
		boolean successflag = true;
		number = Integer.parseInt(inputNumber);
		if (number >= 1 && number <= 999) {
			System.out.print("NUMBER AFTER CONVERSION:\t");
			numberToWord(((number / 100) % 10), " hundred");
			numberToWord((number % 100), " ");
			successflag = true;
		} else {
			System.out.print("INVALID NUMBER");
			successflag = false;
		}
		return successflag;
	}

	public static void main(String[] args) {
		NumberConverter numberConverter = new NumberConverter();
		String inputNumber = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please type a number between 1 and 999 OR type 0 to exit:  ");
		inputNumber = scanner.next();
		while (inputNumber.matches("^[0-9]*$") && Integer.parseInt(inputNumber) != 0) {
			numberConverter.convertToString(inputNumber, scanner);
			System.out.print("\nPlease type a number between 1 and 999 OR type 0 to exit:  ");
			inputNumber = scanner.next();
		}
		System.out.println("PROGRAM EXITED");
		scanner.close();
	}

	/**
	 * @param inputNumber
	 * @param scanner
	 * @return
	 */
	private static String convert(String inputNumber, Scanner scanner) {
		int number;
		number = Integer.parseInt(inputNumber);
		if (number >= 1 && number <= 999) {
			System.out.print("NUMBER AFTER CONVERSION:\t");
			numberToWord(((number / 100) % 10), " hundred");
			numberToWord((number % 100), " ");
			// successflag = true;
		} else {
			System.out.print("INVALID NUMBER");
			// successflag = false;
		}
		System.out.print("\nPlease type a number between 1 and 999 OR type 0 to exit:  ");
		inputNumber = scanner.next();
		return inputNumber;
	}

	public static void numberToWord(int num, String val) {
		String ones[] = { " ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
				" eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen",
				" nineteen" };
		String tens[] = { " ", " ", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty",
				" ninety" };
		if (num > 19) {
			System.out.print(tens[num / 10] + " " + ones[num % 10]);
		} else {
			System.out.print(ones[num]);
		}
		if (num > 0) {
			System.out.print(val);
		}
	}
}
