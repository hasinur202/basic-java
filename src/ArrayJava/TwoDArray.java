package ArrayJava;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        
        int[][] a = new int[2][3];
        int[][] b = new int[2][3];
        int[][] ab = new int[2][3];

        System.out.println("Enter elements for a matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("a[" + row + "][" + column + "] = ");
                a[row][column] = input.nextInt();
            }

        }
        System.out.println("\nEnter elements for b matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("b[" + row + "][" + column + "] = ");
                b[row][column] = input.nextInt();

            }
        }

        System.out.print("\na =");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("\t  " + a[row][column]);
            }
            System.out.println("");
        }

        System.out.print("\nb = ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print("\t  " + b[row][column]);
            }
            System.out.println(" ");
        }

        System.out.println("a+b = ________________________");
        //System.out.println("Addition: ");
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++) {

                ab[row][column] = a[row][column] + b[row][column];

                System.out.print("\t  " + ab[row][column]);
            }
            System.out.println(" ");
        }

    }

}
