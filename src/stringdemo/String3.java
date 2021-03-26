
package stringdemo;

public class String3 {
    public static void main(String[] args) {
        String name = "Bangladesh is a small country.";
        System.out.println(name);
        
       /* String nn = name.trim();
        System.out.println("After removing space: "+nn);*/
        
        char ch = name.charAt(5);
        System.out.println("ch "+ch);
        
        int hh = name.codePointAt(3);
        System.out.println("Asky value: "+hh);
        
        int pos = name.indexOf("l");
        System.out.println("Position: "+pos);
        
        pos = name.lastIndexOf("n");
        System.out.println("Last position: "+pos);
        
        String name1 = " This is my country";
        System.out.println(name1);
        
        String rep = name1.replace('i', 'j');
        System.out.println("After replace: "+rep);
        
        String [] spl = name1.split(" ");
        System.out.print("After split: ");
        for(String x : spl){
            System.out.println(x);
        }
        
        
    }
    
}
