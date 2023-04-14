package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        // Write a code that produces a random number between 1 and 100,
        // and asks the user to guess that number. The user must guess the number
        // in 10 attempts. If the guess of the user is higher than the random number
        // print "Too High" and then print the number of attempts left,
        // if the user's guess is lower than the random number
        // print "Too Low" and then print the number of attempts left,
        // if the guess of the user is correct print "Congrats! You win". If the user is not
        // able to guess the number in 10 attempts print "Sorry! You lost"

        //int random = (int)(Math.random() * 100 + 1);
        //System.out.println(random);
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = rand.nextInt(100);
        //System.out.println(n);
        int attempt = 1;
        int totalAttempt = 10;

        while (attempt < totalAttempt+1) {
            System.out.println("enter your" + attempt + ". guess");
           int guess = scanner.nextInt();
            if (guess == n) {
                System.out.println("congrat! You Win in " + attempt + "try");
                break;
            } else if (guess < n) {
                System.out.println("Too Low");
                System.out.println("the number of attempts left " + (totalAttempt - attempt));
                attempt++;

            } else if (guess > n) {
                System.out.println("Too High");
                System.out.println("the number of attempts left " + (totalAttempt - attempt));
                attempt++;

            }
            if ( totalAttempt<attempt ){

                System.out.println("you tried "+(attempt-1)+" times");
                System.out.println("Sorry! You lost. The number  was " + n);
                break;}


        }

    }

}

