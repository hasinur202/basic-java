
package stringdemo;

public class String1 {
    public static void main(String[] args) {
        String h1 = "Hasinur Rahman";
        String h2 = "hAsinur Rahman";
        
        if(h1.equalsIgnoreCase(h2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equals");
        }
        
        int len = h1.length();
        System.out.println("Length of h1: "+len);
        
        boolean con = h1.contains("Hasi");
        System.out.println(con);
        
        boolean b = h1.isEmpty();
        System.out.println(b);
      
    }
    
}
