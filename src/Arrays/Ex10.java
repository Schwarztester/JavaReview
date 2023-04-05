package Arrays;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //the program asks for the number n. Next, we enter n numbers and store all the entered numbers
        // in an Array.  The program should print  all elements in reverse order.


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number of elements of array");
        int n = scanner.nextInt();

        int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the arr[" + i + "]");
            arr[i] = scanner.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ",");


        }
    }
}

