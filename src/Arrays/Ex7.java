package Arrays;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //The program asks for the number n. Next, we enter n numbers and store all the entered numbers in an array.
        //The program should output the sum and the average value, excluding the maximum and minimum values

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of values which contains your array");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int biggest;
        int smallest;
        double average;
        for (int i = 0; i < arr.length; i++) {

            System.out.println("enter the value for arr[" + i +"]");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("arr["+ n +"]="+arr[i]+",");

        }
        System.out.println("}");
        System.out.println("..........................................");
        smallest = arr[0];
        biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i])
                smallest = arr[i];
            if (biggest < arr[i])
                biggest = arr[i];
            sum += arr[i];
        }
        System.out.println("smallest = " + smallest);
        System.out.println("biggest = " + biggest);
        average = (double) (sum-smallest-biggest)/(arr.length-2);
        System.out.println("average = " + average);


    }
}
