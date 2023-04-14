package Arrays2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
       /* Task 2:
        Write a Java program that accepts two int arrays as input and merges them into a single array.
         The resulting array should contain all the elements from both input arrays,
         in the order they were inputted.

                Input
        10
        6 19 0 -3 4 8 0 -6 9 5

        5
        1 2 3 4 5

        Output
        6 19 0 -3 4 8 0 -6 9 5 1 2 3 4 5*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter length of arr1");
        int n = scanner.nextInt();
        System.out.println("enter length of arr2");
        int m = scanner.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arr3[] = new int[n + m];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("enter a member for arr1");
            arr1[i] = scanner.nextInt();
            System.out.print(arr1[i] + " ");
        }
        System.out.println("********************************");
        for (int j = 0; j < arr2.length; j++) {
            System.out.println ("enter a member for arr2");
            arr2[j] = scanner.nextInt();
            System.out.print(arr2[j] + " ");
        }

        System.out.println();
        for (int j = 0; j < arr3.length; j++) {
            if (j < arr1.length) {
                arr3[j] = arr1[j];
            } else if (j >= arr1.length) {
                arr3[j] = arr2[j - arr1.length];

            }

        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+ " ");

        }
    }
}
