package Arrays2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Create a String array  and find the longest member of the array

        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("give the length of names[]");
        int length= scanner.nextInt();
        String []names= new String[length];
        String longest="";
        System.out.println("enter the members of names ");
        for (int i = 0; i < names.length; i++) {
            names[i]=scanner2.nextLine();
            if (names[i].length()>longest.length())
                longest=names[i];
            System.out.print(names[i]+", ");
        }
        System.out.println();
        System.out.println("longest = " + longest);
        System.out.println("length of the longest = " + longest.length());

    }
}
