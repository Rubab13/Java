// Write a Java program to check if a number is a Harshad Number (also called a Niven Number). A Harshad Number is a number that is divisible by the sum of its digits.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int num = number;
        
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
        }
        
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number.");
        }
        else {
            System.out.println(num + " is not a Harshad number.");
        }
    }
}