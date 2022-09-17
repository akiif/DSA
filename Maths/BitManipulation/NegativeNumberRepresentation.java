package Maths.BitManipulation;

public class NegativeNumberRepresentation {
    public static void main(String[] args) {
        byte b1 = 10;
        String s1 = String.format("%8s", Integer.toBinaryString(b1 & 0xFF)).replace(' ', '0');
        System.out.println("The positive 10 is: " + s1);
        byte b2 = -10;
        String s2 = String.format("%8s", Integer.toBinaryString(b2 & 0xFF)).replace(' ', '0');
        System.out.println("The negative 10 is: " + s2);
    }
}
