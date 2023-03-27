package loopsExamples;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        //Write a program that ask for numbers.The program should stop prompting when we enter "0".
        // The program should print sum of numbers entered.

        Scanner scanner=new Scanner(System.in);
        int num= scanner.nextInt();
        int sum=0;
      while(num!=0){
          sum+=num;

          num= scanner.nextInt();

      }
        System.out.println("sum: "+sum);




    }
}



