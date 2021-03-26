
package basicjava;

import java.util.Scanner;

public class ArmstrongDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, rem,rm,temp; int sum = 0;
        System.out.print("Enter to read a stenger value: ");
        n= input.nextInt();
        temp = n;
        while(temp !=0){
            rem = temp%10;
            
            sum = sum+rem*rem*rem;     
            temp = temp/10;
            
        }
        
        if (n==sum){
            System.out.println(n+" is Armstrong");
        }
        else{
            System.out.println(n+" is not Armstrong");
        }
    }
    
}
