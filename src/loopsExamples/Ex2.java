package loopsExamples;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {


//Write a program that ask the console for two intiger (int n and int m)
// and displays all the ODD numbers from n to m  and displays the sum of the odd numbers

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the first number : ");
        int n= scan.nextInt();
        System.out.print("please enter the second number : ");
        int m= scan.nextInt();
        int small;
        int bigger;
        int sum=0;
        if(n>m) {
            small = m;
            bigger = n;
        } else{
                        small=n;
                    bigger=m;}
        for (int i = small; i <=bigger ; i++) {
            if (i%2!=0){
                System.out.print(i+", ");
                sum+=i;
            }
        }
        System.out.println("sum of the odd numbers="+sum);

        //second way

        System.out.print("please enter the first number : ");
        int a= scan.nextInt();
        System.out.print("please enter the second number : ");
        int b= scan.nextInt();
        int temp;
        if(a>b) {
           temp = b;
            b=a;
            a=temp;}


           sum=0;
       while (a<=b) {
            if (a%2!=0){
                System.out.print(a+", ");
                sum+=a;

            }
            a++;
        }
        System.out.println("sum of the odd numbers="+sum);



    }

    }


