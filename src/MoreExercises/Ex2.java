package MoreExercises;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        //input n.  print all the odd numbers from n to zero


        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();

        if (n>0){
            for (int i = n; i >0 ; i--) {
                if(i%2==1)
                    System.out.println(i+" ");
            }

        } else
            System.out.println("Please enter a positive number");

    }
}
