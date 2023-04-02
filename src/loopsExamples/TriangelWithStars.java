package loopsExamples;

public class TriangelWithStars {
    public static void main(String[] args) {
        int n=10;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");
        for (int i = n; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("");

        for (int i = 0; i <n ; i++) {
            for (int j = (n-i)-1; j >0 ; j--) {
                System.out.print("-");
            }
            for (int k = 0; k <i+1 ; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }




    }
}
