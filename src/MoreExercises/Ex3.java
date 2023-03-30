package MoreExercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // input n. print YES if this number PRIME otherwise print NO.
        // prime numbers are divisible only by one and by itself

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
int counter=0;
        for (int i = 2; i < n; i++) {


            if (n % i == 0) {
                counter++;
            }
        }
        if (counter==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
