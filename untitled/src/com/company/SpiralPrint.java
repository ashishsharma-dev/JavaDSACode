package com.company;

public class SpiralPrint {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        spiralPrint(arr);
    }

    public static void spiralPrint(int arr[][]){
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;

        int tne = (arr.length)*(arr[0].length);
        System.out.println(tne);
        int counter = 0;

        while (counter < tne){
//            left wall
            for (int i = minRow, j = minCol; i <= maxRow; i++) {
                System.out.println(arr[i][j]);
                counter++;
            }
            minCol++;
//            bottom wall
            for (int i = maxRow, j = minCol; j <= maxCol; j++) {
                System.out.println(arr[i][j]);
                counter++;
            }
            maxRow--;
//            right wall
            for (int i = maxRow, j = maxCol; i >= minRow; i--) {
                System.out.println(arr[i][j]);
                counter++;
            }
            maxCol--;
//            top wall
            for (int i = minRow, j = maxCol; i >= minCol; i--) {
                System.out.println(arr[i][j]);
                counter++;
            }
            minRow++;
        }
    }
}
