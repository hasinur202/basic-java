
package ArrayJava;

public class FullPyramid {
    public static void main(String[] args) {
        int [][]a = new int [5][9];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <=i; j++) {
                
                System.out.print("   ");
            }
            while (k!=i ){
                System.out.println(" ");
                k++;
            }
            System.out.println("");
        }
        
    }
    
}
