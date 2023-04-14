package TwoDimentionalArrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Write a Java program to find the sum of two arrays elements.
        // take the number of the array sizes from user
        // if the user entered different number for sizes "both array must have same number of elements" message
        //should appears on console and force the user to enter same numbers

        //Example:-
        //array1[] = {10, 20, 30, 40, 50};
        //array2[] = {9, 18, 27, 36, 45};
        //The resultant array will be,
        //array3[] = {19, 38, 57, 76, 95};
        Scanner scanner=new Scanner(System.in);
        int n=0;
        int m=0;

        System.out.println("enter the the length of arr1");

        n= scanner.nextInt();
        System.out.println("enter the the length of arr2");
        m= scanner.nextInt();

        if (!(n==m)){
            do {
                System.out.println( "both array must have same number of elements");
                System.out.println("re enter the the length of arr1");

                n= scanner.nextInt();
                System.out.println("re enter the the length of arr2");
                m= scanner.nextInt();

            }
            while (!(n==m));

        }
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arrSum[]=new int[n];

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("enter the an element for arr1 in the position of index "+i);
            arr1[i]=scanner.nextInt();
            System.out.println("enter the an element for arr2 in the position of index "+i);
            arr2[i]=scanner.nextInt();
            arrSum[i]= arr1[i]+arr2[i];

        }
        System.out.println("}");
        System.out.print("arr1[]:  {");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+", ");

        }
        System.out.println("}");
        System.out.print("arr2[]:  {");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+", ");

        }
        System.out.println("}");
        System.out.print("arrSum[]:{");
        for (int i = 0; i < arrSum.length; i++) {
            System.out.print(arrSum[i]+", ");

        }
        System.out.println("}");

    }
}
