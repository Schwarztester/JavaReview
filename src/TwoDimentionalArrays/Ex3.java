package TwoDimentionalArrays;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Write a program that finds and prints the maximum value in a two-dimensional array, and prints its index.
        //
        //Input
        //4 5
        //
        //7 3 4 9 10
        //16 7 8 2 0
        //9 1 4 12 3
        //11 6 7 1 2
        //
        //Output
        //16
        //1 0


        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[][]=new int[n][m];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=scanner.nextInt();

            }
        }
        int maxValue= arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>maxValue)
                    maxValue=arr[i][j];
            }
        }
        System.out.println("maxValue = " + maxValue);



    }
}
