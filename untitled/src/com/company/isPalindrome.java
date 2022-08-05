package com.company;
import java.util.*;

public class isPalindrome {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int s = 0;
        int e = A.length()-1;
        String res = "";

        if(A.length() <= 1){
            res = "Yes";
        }

        while (s < e){
            if(A.charAt(s)!= A.charAt(e)){
                res = "No";
            } else if(A.charAt(s)==A.charAt(e)){
                res = "Yes";
            }
            s++;
            e--;
        }
        System.out.println(res);
    }
}
