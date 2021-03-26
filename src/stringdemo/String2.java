package stringdemo;

public class String2 {

    public static void main(String[] args) {
        String firstName = "Hasinur";
        String lastName = " Rahman";

        String fullName = firstName.concat(lastName);
        System.out.println("Full Name: " + fullName);

        String upp = firstName.toUpperCase();
        System.out.println("Upper Case: " + upp);

        String low = lastName.toLowerCase();
        System.out.println("Lower Case: " + low);

        String full = upp.concat(low);
        System.out.println("Upper + Lower: " + full);
        
        boolean first = firstName.startsWith("Has");
        System.out.println(first);
        
        boolean last = lastName.endsWith("na");
        System.out.println(last);

    }

}
