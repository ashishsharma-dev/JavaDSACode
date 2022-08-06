package Basics;

import java.util.Scanner;

public class characterCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, this Java program checks for a character is lowercase or uppercase or not a number");
        System.out.println("Enter a char to check");

        char userInput = in.next().charAt(0);
        if(userInput>= 65 && userInput <= 90){
            System.out.println("The Character you entered is an uppercase letter: "+1);
        }else if(userInput >= 97 && userInput <= 122){
            System.out.println("The Character you entered is a lowercase letter: "+0);
        }else {
            System.out.println("Please Enter letters only: -1");
        }
    }
}
