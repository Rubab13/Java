// Write a Java program that takes an integer input from the user and checks whether it is even or odd.

import java.util.Scanner;

public class CheckEvenOrOdd {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    
    if (number % 2 == 0) {
        System.out.println("The given number is an even number.");
    }
    else {
        System.out.println("The given number is an odd number.");
    }
  }
}