
package basicjava;

import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
    double result2; 
    double b, h, result;
    
        System.out.print("Enter the value of b = ");
        b= input.nextDouble();
        
        System.out.print("Enter the value of h = ");
        h = input.nextDouble();
        
        result = b*h;       //We know the formula of Triangle 0.5*base*height
        result2 = result/2;
        System.out.println("The area of triangle: "+result2);
           
    
    }
    
  
}
