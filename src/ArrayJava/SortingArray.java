package ArrayJava;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Descending Process :
        System.out.print("Enter the number of Array: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int i;
        System.out.println("Enter " + n + " array value respectfully: ");
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }

        Arrays.sort(a);

        // Ascending Process :
        System.out.print("Ascending: ");
        for (i = 0; i < n; i++) {
            System.out.print("  " + a[i]);
        }
        System.out.println("");

        //Descending Process: 
        System.out.print("Descending: ");
        for (i = n - 1; i >= 0; i--) {
            System.out.print("  " + a[i]);
        }
        System.out.println("");
                
        //Ascending process in different program
        /*int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
        System.out.println("");*/
 
    }

}
