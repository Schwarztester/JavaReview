package Arrays;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //write a program which prints only positive members of the array

        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        int arr[]=new int[length];
        for (int i = 0; i <length ; i++) {
arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < length; i++) {
            if (arr[i]>0)
                System.out.print(arr[i]+" ");
        }





    }
}
