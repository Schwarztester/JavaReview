package MoreExercises;

import java.util.Scanner;

public class MoneyConverter {
    public static void main(String[] args) {
        //  create a program  to convert US dollar to TL, Tl to US dollar
        //  and  Euro to TL and TL to Euro

        double result;
        double dollarToTl = 19.2;
        double euroToTl = 20.04;

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("please select your operation");
        System.out.println("for US dollar to TL enter X");
        System.out.println("for TL to US dollar enter Y");
        System.out.println("for TL to  Euro enter Z");
        System.out.println("for Euro to TL enter T");

        System.out.print("My currency selection is: ");
        String currency = scanner.nextLine();


        System.out.print("amount of your currency you want to convert: ");
        double amounth = scanner1.nextDouble();


        if (currency.equalsIgnoreCase("x")) {
            result = amounth * dollarToTl;
            System.out.println(amounth+"$= "+result+" Tl");
        } else if (currency.equalsIgnoreCase("y")) {

        result= amounth/dollarToTl;
            System.out.println(amounth+"TL= "+result+" $");

        } else if (currency.equalsIgnoreCase("z")) {

            result= amounth*euroToTl;
            System.out.println(amounth+"Euro= "+result+" Tl");
        } else if (currency.equalsIgnoreCase("t")) {

            result= amounth/euroToTl;
            System.out.println(amounth+"Tl= "+result+" Euro");
        } else
            System.out.println("Hatali giris yaptiniz tekrar deneyin");

    }


}

