
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {


//Write a program that ask the console for two intiger (int n and int m)
// and displays all the ODD numbers from n to m

        Scanner scan = new Scanner(System.in);
        System.out.print("please enter the first number : ");
        int n= scan.nextInt();
        System.out.print("please enter the second number : ");
        int m= scan.nextInt();
        int small;
        int bigger;
        if(n>m) {
            small = m;
            bigger = n;
        } else{
                        small=n;
                    bigger=m;}
        for (int i = small; i <=bigger ; i++) {
            if (i%2!=0){
                System.out.print(i+", ");
            }
        }


    }

    }


