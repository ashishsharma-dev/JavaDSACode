package com.company;
import java.util.*;

public class isAnagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
//        boolean check = true;
        char[]charA = a.toCharArray();
        char[]charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        for (int i = 0; i < charA.length; i++) {
            if(charA[i]!= charB[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
