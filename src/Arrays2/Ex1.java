package Arrays2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //The program asks for the number n.
        // Next, we enter n numbers and store all the entered numbers in an array.
        // The program should print the sum of all numbers that are between zeros.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int zero[] = new int[2];
        int sum = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] == 0) {
                zero[j] = i;
                j++;
            }
        }
        System.out.println(zero[0]);
        System.out.println(zero[1]);
        for (int i = zero[0]; i < zero[1]; i++) {
            sum += arr[i];
        }
        System.out.print("int arr[]={");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("}");

        for (int i = 0; i < zero.length; i++) {
            System.out.print(zero[i] + ",");

        }
        System.out.println("...................");
        System.out.println("sum of the elements between two zeros= " + sum);


    }
}
