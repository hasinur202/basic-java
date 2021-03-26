
package basicjava;


public class MathDemo {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
            
        int max = Math.max(x, y);
        System.out.println("Maximum vlaue: "+max);
        
        double power = Math.pow(x, y);
        System.out.println("x to the power y = "+power);
        
        int round = Math.round(8.6f);
        System.out.println("Round = "+round);
        
        int modulus = Math.floorMod(x,y);
        System.out.println("Modulus = "+modulus);
        
    }
}
