package Arrays;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        //the program asks for the number n. Next, we enter n numbers and store all the entered numbers in an Array. Then we enter the number m. The program should print the average of all elements grater than m.

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the number of elements of array");
        int n= scanner.nextInt();
        System.out.println("please enter the key number for average calculation");
        int m= scanner.nextInt();
        int sum=0;
        int counter=0;
        int []arr=new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]>m){
                sum+=arr[i];
                counter++;
        }
        }
        double average= (double)sum/counter;
        System.out.println("Average:"+ average);
    }
}
