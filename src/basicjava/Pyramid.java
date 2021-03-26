package basicjava;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args) {
        Scanner pyramid = new Scanner(System.in);
        System.out.print("Enter number of pattern row: ");
        int n;
        n = pyramid.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
   
    }

}
