package com.company;
import java.util.*;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] newArr = s.split(",");
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }


        scan.close();
    }
}
