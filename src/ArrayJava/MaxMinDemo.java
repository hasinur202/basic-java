package ArrayJava;

import java.util.Scanner;

public class MaxMinDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[20];
        int n, max, min, i;
        System.out.print("Enter number of array: ");
        n = input.nextInt();
        System.out.println("Enter " + n + " array value respectfully: ");
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
        max = a[0];
        for (i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        min = a[0];
        for (i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }

}
