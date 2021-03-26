
package basicjava;

import java.util.Scanner;

public class PalindroneDEmo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, temp, sum=0, rem; 
        
        System.out.print("Enter to read steger value: ");
        n = input.nextInt();
        
        temp = n;
        while (temp!=0){
        rem= temp%10;
        sum = sum*10+rem;
        temp = temp/10;
    }
        if(sum==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
              
    }
}
