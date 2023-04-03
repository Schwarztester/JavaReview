package Arrays;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // craete an array and find the multiplication of all even elements (except if one element zero is)

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0 && arr[i]!=0 )
            sum = sum * arr[i];
        }
        System.out.println(sum);
    }
}
