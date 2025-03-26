// Given three integers, print the smallest value. 

import java.util.Scanner;

class Minimum3Numbers {
  public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter first number: ");
    int number1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int number2 = scanner.nextInt();
    System.out.print("Enter third number: ");
    int number3 = scanner.nextInt();
        
    System.out.print("\nThe minimum of the three numbers is ");

    if (number1 <= number2 && number1 <= number3) {
      System.out.println(number1);
    }
    else if (number2 <= number1 && number2 <= number3) {
      System.out.println(number2);
    }
    else {
      System.out.println(number3);
    }

    scanner.close();

    // Second method
    int min = Math.min(number1, Math.min(number2, number3));
    System.out.println(min);

    }
}
