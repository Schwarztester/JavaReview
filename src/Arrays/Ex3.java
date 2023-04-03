package Arrays;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of your array");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("enter the member of array with index number" + i);
            arr[i] = scanner.nextInt();

        }
        for (int i = 0; i < length; i++) {
            System.out.println(i + "-" + arr[i]);

        }
        //print your array from last to first
        for (int i = length-1; i >=0 ; i--) {
            System.out.println(i + "-" + arr[i]);

        }
        System.out.println(".....................................");
        //another way
        int arr2[]=new int[length];
        for (int i = length-1; i >=0 ; i--) {
            arr2[length-i-1]=arr[i];
        }
        for (int i = 0; i <length ; i++) {
            System.out.println(i + "-" + arr2[i]);
        }
    }
}
