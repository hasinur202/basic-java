
/*package basicjava;
//1^2*2^2*3^2*4^2*5^2....n^2

import java.util.Scanner;

public class LoopSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, mult=1;
        System.out.print("Enter the value of n: ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.print(i+"^2 ");
            mult=mult*i*i;    
        }
        
        System.out.println("\nTotal multiplication: "+mult);
    }*/
    
package basicjava;
//Factorial

import java.util.Scanner;

public class LoopSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, mult=1;
        System.out.print("Enter Any Integer Number: ");
        n = input.nextInt();
        
        for (int i = n; i >= 1; i--) {
            
           mult=mult*i;    
        }
        
        System.out.println("The factorial value "+n+" = "+mult);
    }
}
    
    
