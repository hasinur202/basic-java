
package basicjava;

import java.util.Scanner;


public class SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,rem; int sum = 0;
        System.out.print("Enter to read any postive interger: ");
        n = input.nextInt();
        //while loop
        /*int temp = n;
        while (temp !=0){
            rem = temp%10;
            sum = sum + rem;
            temp = temp/10;
        }*/
        //for loop
        for(int temp = n; temp!=0; temp=temp/10){
            rem=temp%10;
            sum = sum+rem;   
        }
                
        System.out.println("Sum of integer: "+sum);
    }
}
