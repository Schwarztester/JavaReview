package loopsExamples;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        //Write a program that ask for numbers.The program should stop prompting when we enter "0".
        // The program should print the Maximum value of numbers entered.

        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int max=num;
        while (num!=0){
        if(num>max){
            max=num;}

            num= scanner.nextInt();

        }
        System.out.println("max"+ max);
    }
}
