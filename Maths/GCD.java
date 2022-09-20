package Maths;

/*
Euclid's Algorithm:
gcd (a, b) = gcd(remainder(b, a), a)

gcd (105, 224) = gcd (rem(224, 105), 105)
               = gcd (14, 105)
               = gcd (rem(105, 14), 14)

        => 105x + 224y
        => 14x +  105y

* GCD and HCF are same.
 */

public class GCD {
    public static void main(String[] args) {
        int a = 105;
        int b = 224;
        System.out.println(gcd(a, b));
    }

    static int gcd (int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
