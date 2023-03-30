package MoreExercises;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //input m and n, write a program that will print all numbers from nto m. if n bigger than m decreasing oder else increasing order


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int n = scanner.nextInt();
        System.out.println("enter second number");
        int m = scanner.nextInt();

        if (n > m) {
            for (int i = n; i >= m; i--) {

                System.out.print(i + ",");

            }
        } else
            for (int i = n; i <= m; i++) {
                System.out.print(i + ",");

            }

    }

}

