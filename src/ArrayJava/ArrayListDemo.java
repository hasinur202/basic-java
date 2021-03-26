package ArrayJava;

import java.util.ArrayList;
//import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> hasin = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();

        System.out.println("Array Size:  " + hasin.size());
        
        hasin.add(25);
        hasin.add(28);
        hasin.add(30);
        hasin.add(40);
        hasin.add(4, 50);
        System.out.println("Array List: "+hasin);
        System.out.println("Array Size: "+hasin.size());
          
        number2.add(10);
        number2.add(20);
        number2.add(22);
        number2.add(23);
        System.out.println("number2: "+number2);

        number3.add(1);
        number3.add(2);
        number3.add(4);
        number3.add(5);
        System.out.println("number3: "+number3);
        
        number1.addAll(number2);
        System.out.println("number1: "+number1);
        
        boolean c = number1.equals(number2);
        System.out.println("number1 == number2 : "+c);
        
       c = number1.equals(number3);
        System.out.println("number1 == number3: "+c);
        
        
        
        //hasin.removeAll(hasin);
        //System.out.println("After removing all: "+hasin);

        /* System.out.print("Array List:");
        for(int y : hasin){
            System.out.print("  "+y);
        }*/
 /*
        System.out.print("\nArray List:");
        Iterator x = hasin.iterator();
        while(x.hasNext()){
            System.out.print("  "+x.next());
        }
        System.out.println("");*/
        
        hasin.set(4, 60);
        System.out.println("\n\nSet 60 in 4th position: "+hasin);
        
        boolean pos = hasin.contains(30);
        System.out.println("30 is in the list: "+pos);
        
        int contain = hasin.indexOf(30);
        System.out.println("The index of 30: "+contain);
        
        int x = hasin.get(0);
        System.out.println("The value of 0 position: "+x);
        
        
        hasin.clear();
        
        boolean b = hasin.isEmpty();
        System.out.println("Array list empty: "+b);
        
        
                
        
        
        
        
        
        
        
        
    }

}
