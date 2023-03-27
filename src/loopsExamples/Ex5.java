package loopsExamples;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //Write a program that takes an integer(n) and displays the sum of the
        // first "n" numbers  in sequence like ( 1+1/2+1/3+1/4....)

        Scanner scanner=new Scanner(System.in);
        double n= scanner.nextInt();
        double a=1;
        double sum=0;


        for (int i = 1; i <= n; i++) {
            sum= sum+(a/i);



        }
        System.out.println(sum);


    }
}
