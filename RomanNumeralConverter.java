// Write a program that prompts the user to enter a number within the range of 1 through 10. The program 
//should display the Roman numeral version of that number. If the number is outside the range of 1 through 10, the program should display an error message.

import java.util.Scanner;

class RomanNumeralConverter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-10): ");
        int number = scanner.nextInt();
        
        if (number < 1 || number > 10) {
            System.out.println("Error: Please enter a number between 1 and 10.");
        }
        else {
            switch (number) {
                case (1):
                     System.out.println("I");break;
                case (2):
                     System.out.println("II");break;
                case (3):
                     System.out.println("III");break;
                case (4):
                     System.out.println("IV");break;
                case (5):
                     System.out.println("V");break;
                case (6):
                     System.out.println("VI");break;
                case (7):
                     System.out.println("VII");break;
                case (8):
                     System.out.println("VIII");break;
                case (9):
                     System.out.println("IX");break;
                case (10):
                     System.out.println("X");break;
            }
        }
        scanner.close();
    }
}
