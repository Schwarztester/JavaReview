package TwoDimentionalArrays;

public class Ex4 {
    public static void main(String[] args) {
        //Write a Java program to find the duplicate values of an array of integer values.
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
            if (arr[i] == arr[j])
                System.out.println("element with the index of " + i +
                        " and element with the index of " + (j) +
                        " are the same");
        }

    }
}
}

