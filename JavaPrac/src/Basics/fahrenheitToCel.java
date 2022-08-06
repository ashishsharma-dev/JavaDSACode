package Basics;

import java.util.Scanner;

public class fahrenheitToCel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the start fahrenheit value");
        int start = in.nextInt();
        System.out.println("Enter the end fahrenheit value");
        int end = in.nextInt();
        System.out.println("Enter the gap value");
        int gap = in.nextInt();

        while (start <= end){
            System.out.println(start + " " + (start - 32) * 5/9);
            start = start + gap;
        }

    }
}
