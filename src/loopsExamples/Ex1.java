package loopsExamples;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // write a program to calculate the faktorial of a given integer

        Scanner scan = new Scanner(System.in);
        System.out.print("please give a number to calculate its faktorial: ");
        int n= scan.nextInt();
        int sum=1;
        int i= 1;
        while(i<=n){
            sum*=i;
            i++;
            System.out.println("faktorial -"+i+"- = "+sum);
        }
        System.out.println("faktorial("+n+")= "+sum);








    }




}