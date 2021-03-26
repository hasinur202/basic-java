package ArrayJava;

import java.util.Scanner;

public class OutputArray {

    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);
        int [][]a=  new int [4][4];
        int [][]b = new int [4][4];
        
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                a[i][j] = k;
                k++;
            }
        }
        
                  
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" "+a[i][j]);
                
            }
            System.out.println("");
        }
        
        
        
        
        /*int[][] a = new int[4][5];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = k;
                k++;
            }

        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  "+a[i][j]);
            }
            System.out.println("");
        }*/

    }

}
