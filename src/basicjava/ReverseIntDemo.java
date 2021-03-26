
package basicjava;

import java.util.Scanner;


public class ReverseIntDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int n,rem; int sum = 0;
        System.out.print("Enter to read any postive interger: ");
        n = input.nextInt();
        //while loop
        int temp = n;
        while (temp !=0){
            rem = temp%10;
            sum = sum*10+rem;
            //System.out.print(rem);
            temp = temp/10;
        }
        System.out.println(sum);        
        System.out.println("");  
    }
    
}
