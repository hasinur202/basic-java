
package basicjava;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i, num, count=0;
        System.out.print("Enter any integer Number: ");
        num= input.nextInt();

           for (i=2; i<num; i++){
               if(num%i==0){
                   count++;
                   break;
               }
           }
          if(count==0){
               System.out.println("Prime Number");
           }
           else{
               System.out.println("Non-Prime Number");
           }
    }
    
}
