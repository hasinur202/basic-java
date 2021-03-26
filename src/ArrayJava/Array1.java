
package ArrayJava;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double []number = new double [10];
        double n;
        System.out.print("Enter the value of Array: ");
        n = input.nextDouble();
        
        System.out.println("Enter "+(int) n+" numbers of array respectfully: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("array ["+i+"] = ");
            number[i] = input.nextDouble();
        }
        
        for (int i = 1; i <= n; i++) {
            sum = sum+number[i];    
        }
        System.out.println("The sum is: "+sum);
        double avg = sum/n;
        System.out.println("Average is: "+avg);
     
    }
    
}
