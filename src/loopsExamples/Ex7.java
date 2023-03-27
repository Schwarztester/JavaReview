package loopsExamples;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        //Write a program that ask for numbers.The program should stop prompting when we enter "0".
        // The program should print number of numbers entered.

        Scanner scanner=new Scanner(System.in);
        int num;
        int counter=0;
        do {
            System.out.println("Please enter a number");
             num=scanner.nextInt();
             counter++;
        }
        while(num!=0);

        System.out.println("counter = " + counter);







    }
}
