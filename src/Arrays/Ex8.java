package Arrays;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //write a program to check if a given number is a member of the array. Print yes or no

        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        System.out.println("give the lenght of Array");
        n = scanner.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("enter the number to add to your array:");
            arr[i] = scanner.nextInt();
            System.out.println(arr[i] + ",");
        }
        System.out.println("enter 'm' to check:");
        m = scanner.nextInt();
        String isThere="NO";
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == m) {
                isThere="YES";
                System.out.println("YES");
                System.out.println("index of " + m + "= " + i);
                break;

            }
        }
        if (isThere.equals("NO"))
            System.out.println("NO");

    }
}
