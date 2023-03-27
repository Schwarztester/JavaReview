package loopsExamples;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Enter an integer(N) into the program.
        // The program should print all numbers from 1 to N and their squares

        Scanner scanner= new Scanner(System.in);
        System.out.print("please enter your number:");

        int N= scanner.nextInt();

        for (int i = 1; i <=N ; i++) {
            System.out.println("Number="+i+", "+"its square="+i*i);


        }

    }
}
