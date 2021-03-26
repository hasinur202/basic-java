
package basicjava;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i, n, fibo;
        System.out.print("Enter how many fibonacci number: ");
        n = input.nextInt();
        
        int first = 0;
        int second = 1;
        System.out.print(first+"  "+second);
        
        for(i = 3; i<=n; i++){
            fibo = first + second;
            System.out.print("  "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println(" ");
        
        
    }
    
}
