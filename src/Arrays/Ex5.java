package Arrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //create an array and print the squares of each members of array

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = scanner.nextInt();
        int sq;
        int[] arr = new int[n];

        System.out.println("enter the members of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("int []arr={");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("}");
        for (int i = 0; i < arr.length; i++) {
            sq = arr[i] * arr[i];
            System.out.println("square of arr[" + i + "]= " + sq);
        }
        //or
        for (int i = 0; i < arr.length; i++) {

            System.out.print((int) Math.pow(arr[i], 2) + ", ");
        }
    }
}
