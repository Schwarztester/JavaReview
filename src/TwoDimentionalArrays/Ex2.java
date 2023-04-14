package TwoDimentionalArrays;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //create a program that accept the elements of two dimentional array from console
        // and print the square of even elemnts and squareroot of odd elements



        Scanner scanner= new Scanner(System.in);

        System.out.println("give the dimentions of your array");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int arr[][]= new int[n][m];

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("please enter the element for the coordinates of "+ i+","+j);
                arr[i][j]=scanner.nextInt();

            }

        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0) {
                    System.out.println(arr[i][j] * arr[i][j]);
                }
                else if (arr[i][j]%2!=0) {
                    System.out.println((int)Math.sqrt(arr[i][j]));
                }


            }

        }




    }
}
