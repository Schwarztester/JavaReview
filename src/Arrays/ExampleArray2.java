package Arrays;

import java.util.Scanner;

public class ExampleArray2 {
    public static void main(String[] args) {

        //create an array of integers and loop through all the elements


        Scanner scanner=new Scanner(System.in);
        System.out.println("enter size of your array");
        int length= scanner.nextInt();

        int []arr =new int[length];
        for (int i = 0; i <length ; i++) {
            System.out.println("enter the member of array with index number"+i);
           arr[i]=scanner.nextInt();

        }
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
