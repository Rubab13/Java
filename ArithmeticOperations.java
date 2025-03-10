// Write a Java program that takes two numbers as input and prints their sum, difference, product, and quotient.

import java.util.Scanner;

public class ArithmeticOperations {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();
    
    System.out.println("Sum: " + (firstNumber + secondNumber));
    System.out.println("Difference: " + (firstNumber - secondNumber));
    System.out.println("Product: " + (firstNumber * secondNumber));
    System.out.println("Quoient: " + (firstNumber / secondNumber));
    
  }
}