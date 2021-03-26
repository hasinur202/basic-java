
package basicjava;

import java.util.Scanner;

public class LoopPlm {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
           System.out.print("Enter the value of m: ");
           int m = input.nextInt();
           System.out.print("Enter the value of n: ");
           int n = input.nextInt();
        int i, sum=0;
        for (i = m; i <= n; i++) {
             
            /*if(i%2==0){
                sum=sum+i;
            }*/
            if(i%2!=0){
                sum=sum+i;
                System.out.println(i);
            }

        }
        //System.out.println("Sum of all even numbers from m to n: "+sum);
        System.out.println("Sum of all odd numbers from m to n: "+sum);
    }
    
}
