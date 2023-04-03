package Arrays;

import java.util.Scanner;

public class ExamplesArrays {
    public static void main(String[] args) {
        //From the array int[] nums= {6,19,26,9,46,8,5,65,90,25};
        //display the number at the given index. index will be given from the console
        Scanner scanner= new Scanner(System.in);

        int[] nums= {6,19,26,9,46,8,5,65,90,25};
        for (int i = 0; i < nums.length; i++) {

            System.out.println("enter your index");
            int index=scanner.nextInt();
            System.out.println(index+". indexteki eleman= "+ nums[index]);

        }



    }
}
