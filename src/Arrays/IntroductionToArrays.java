package Arrays;

import java.util.Scanner;

public class IntroductionToArrays {
    public static void main(String[] args) {

        String []names={"hasan","Ali","Ayse"};
        double numbers[]={1,2,3,4,5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("......................................");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

        //another way to define an Array
        double xyz[]= new double[8];
        xyz[0]=2;
        xyz[1]=3;
        xyz[3]=8;
        xyz[4]=5;
        xyz[5]=5;
        xyz[6]=15;
        xyz[7]=50;

        for (int i = 0; i < xyz.length; i++) {
            System.out.print(xyz[i]+",");

            }
        //another way to fill an array from console

        System.out.println("............................");
        Scanner scanner=new Scanner(System.in);
        double array[]= new double[8];
        for (int j = 0; j < array.length ; j++) {
            System.out.println("please enter:");
            array[j]= scanner.nextDouble();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");

        }

    }
}
