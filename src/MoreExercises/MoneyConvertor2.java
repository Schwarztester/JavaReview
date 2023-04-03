package MoreExercises;

import java.util.Scanner;

public class MoneyConvertor2 {
    public static void main(String[] args) {
        double result;
        double dollarToTl = 19.2;
        double euroToTl = 20.04;
        String choice;
        double money;

        do {
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("please select your operation");
            System.out.println("for US dollar to TL enter X");
            System.out.println("for TL to US dollar enter Y");
            System.out.println("for TL to  Euro enter Z");
            System.out.println("for Euro to TL enter T");
            System.out.println("Press 'E' to EXIT");
            choice = scanner.nextLine();


            if (choice.equalsIgnoreCase("e")) {
                break;
            } else if (choice.equalsIgnoreCase("x")) {
                System.out.println("enter your amount of money");
                money=scanner1.nextDouble();
                result = money * dollarToTl;
                System.out.println(money + "$= " + result + " Tl");


            } else if (choice.equalsIgnoreCase("y")) {
                System.out.println("enter your amount of money");
                money=scanner1.nextDouble();
                result = money / dollarToTl;
                System.out.println(money + "TL= " + result + " $");

            } else if (choice.equalsIgnoreCase("z")) {
                System.out.println("enter your amount of money");
                money=scanner1.nextDouble();
                result = money * euroToTl;
                System.out.println(money + "Euro= " + result + " Tl");
            } else if (choice.equalsIgnoreCase("t")) {
                System.out.println("enter your amount of money");
                money=scanner1.nextDouble();
                result = money / euroToTl;
                System.out.println(money + "Tl= " + result + " Euro");
            } else
                System.out.println("Hatali giris yaptiniz tekrar deneyin");


        }
        while (true);
    }
}
