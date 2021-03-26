
package basicjava;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char a;
        System.out.print("Enter any letter: ");
        a = input.next().charAt(0);
        
        if (a=='a')
        {     
            System.out.println("Vowel");
    }
        else if(a=='e'){
            System.out.println("Vowel");
        }
        else if(a=='i'){
            System.out.println("Vowel");
        }
        else if(a=='o'){
            System.out.println("Vowel");
        }
        else if(a=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }    
}}
