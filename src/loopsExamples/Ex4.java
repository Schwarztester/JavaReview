package loopsExamples;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //Write a program that takes an integer(n) and displays the sum of the
        // first "n" numbers from the sequence

        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        int number=3;
        for (int i = 0; i < n; i++) {

            System.out.print(number+", ");
            sum +=number;
            number += 3;

        }
        System.out.println();
        System.out.println("sum of the numbers till "+n+". number"+";"+sum );
    }
}
