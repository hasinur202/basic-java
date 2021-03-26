
package basicjava;

import java.util.Scanner;

public class BioData {
    public static void main(String[]args) {
       Scanner input = new Scanner(System.in);
        int num1, num2, result;
        
        System.out.print("Enter the first value: ");
        num1= input.nextInt();
        
        System.out.print("Enter the 2nd value: ");
        num2 = input.nextInt();
        
        result= num1+num2;
        System.out.println("Sum = "+result);
        
        result= num1-num2;
        System.out.println("Sub. = "+result);
        
        result = num1*num2;
        System.out.println("Mult. = "+result);
        
        double result2 = (double) num1/num2;
        System.out.println("Div = "+result2);
        
        double result3 = (double) num1%num2;
        System.out.println("Reminder = "+result3);
        
        
        
        
        
        
        
    }
}
