
package basicjava;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, n;
        System.out.print("Enter the value: ");
        n = input.nextInt();
       
        //continue
        for(i=1; i<=n;i++){
            if (i==10){
                continue;
            }
            System.out.println(i);
        }
        
       
        
        //break
        /* for(i=1; i<=n;i++){
            if (i==10){
                System.out.println("\"Program break\"");
                break;
            }
            System.out.println(i);
        }

//do while loop
        /* i=1;
        do {
            System.out.println(i+". Bangladesh");
            i++;
        }while(i<=n);
        
        //while loop
        i=1;
        while (i<=n){
            System.out.println(i+". Bangladesh");
            i++;
        }
        
        //for loop
        for(i=1; i<=n; i++){
            System.out.println(i+". Bangladesh");
        }*/
    }
    
}
