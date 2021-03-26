
package lab;

import java.util.Scanner;


public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Circle y = new Circle(n);
        Circle x = new Circle();
        
        double area = y.Area();
        double perim = y.perimeter();  
        double area1 = x.Area();
        double perim2 = x.perimeter();
        System.out.println("Area: "+area+"\tPerimeter: "+perim);
        System.out.println("Area: "+area1+"\tPerimeter: "+perim2);
       
       
    }
}
