package Basics;
import java.util.*;

public class sumOfEvenNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till you want the sum of even nums");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum= sum+i;
            }
        }
        System.out.println("The sum of even numbers till " + n + " is "+sum);
    }
}
