package Basics;

import java.util.Scanner;

public class averageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first letter of your name");
        char name = in.next().charAt(0);
        System.out.println("Enter the first subject marks");
        int fSub = in.nextInt();
        System.out.println("Enter the second subject marks");
        int sSub = in.nextInt();
        System.out.println("Enter the third subject marks");
        int tSub = in.nextInt();

        int averageMarks = (fSub+sSub+tSub)/3;

        System.out.println("Hello Mr. " + name + " Your average marks of three subjects are " + averageMarks);
    }
}
