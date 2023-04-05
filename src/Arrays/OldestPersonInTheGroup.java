package Arrays;

import java.util.Scanner;

public class OldestPersonInTheGroup {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int []age= new int[5];
        for (int i = 0; i < age.length; i++) {
            age[i]=scanner.nextInt();
        }
        int oldest=age[0];
        for (int i = 0; i < age.length; i++) {
            if (age[i]>oldest)
                oldest=age[i];
        }
        System.out.println(oldest);
    }
}
