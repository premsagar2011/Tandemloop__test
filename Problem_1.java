package com.tandeemloop;

import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operation = sc.next();
        Calculator calc = new Calculator(a, b, operation);
        System.out.println("Result: " + calc.calculate());
	}

}
class Calculator {
    double a, b;
    String operation;

    Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else throw new ArithmeticException("Division by zero is not allowed");
            default:
                throw new IllegalArgumentException("Invalid operation");
        }
    }
}