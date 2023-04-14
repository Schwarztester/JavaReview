package TwoDimentionalArrays;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        // create a program. write the mane, age and salary and department from the console.
        // than print salarries of each staff with their names


        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter the number of staff");
        int n = scanner.nextInt();
        System.out.println("please enter the number of identification items for each staff");
        int m = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        String staff[][] = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    System.out.print("Enter the name of Staff:");
                    staff[i][j] = scanner1.nextLine();
                } else if (j == 1) {
                    System.out.print("Enter the age of Staff:");
                    staff[i][j] = scanner1.nextLine();
                } else if (j == 2) {
                    System.out.print("Enter the salary of Staff:");
                    staff[i][j] = scanner1.nextLine();
                } else if (j == 3) {
                    System.out.print("Enter the department of Staff:");
                    staff[i][j] = scanner1.nextLine();
                }
            }
        }


        // printing the requested part of array
        System.out.println("enter the name of staff to see his/her salary and department");
        String name = scanner1.nextLine();
        for (int i = 0; i < n; i++) {
            if (staff[i][0].equalsIgnoreCase(name))
                System.out.println(name + " " + staff[i][1] + " " + staff[i][3]);
        }
    }

}





