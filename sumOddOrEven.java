// Write a Java program that takes a number as input and prints whether the sum of its digits is even or odd.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
        }
        System.out.println("Sum is " + sum + ".");
        if (sum % 2 == 0) {
            System.out.println("The sum of digits is even.");
        }
        else {
            System.out.println("The sum of digits is odd.");
        }
    }
}