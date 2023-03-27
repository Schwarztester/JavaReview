package loopsExamples;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        //Program asks two integer numbers (n and m) and
        // displays the average of all numbers between n and m
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your first number");
        int n=scanner.nextInt();
        System.out.println("enter your second number");
        int m=scanner.nextInt();
        int sum=0;
        int temp;
        if (n>m){
            temp= m;
            m=n;
            n=temp;
        }
        System.out.println("n:"+n+", m:"+m);
        int devision= m-(n+1);

        while (n<=m){
            sum+=n;
            n++;

        }
        System.out.println(sum);

        System.out.println("devision"+devision);
       double average= (double) sum/devision;
        System.out.println("average = " + average);


        }

    }

