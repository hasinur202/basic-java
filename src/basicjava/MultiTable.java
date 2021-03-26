
package basicjava;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j,m, n, i, mult=1;
        System.out.print("Enter the first value: ");
        n=input.nextInt();
        System.out.print("Enter the 2nd value: ");
        m= input.nextInt();
        for(i=n; i<=m; i++){
           
            for(j=1; j<=10; j++){
            mult=i*j;
            System.out.println(i+" X "+j+" = "+mult);
        } 
            System.out.print("\n");
        }
        
    }
    
}
