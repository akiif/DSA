package Maths;

/*
* lcm(a, b) = Minimum number divisible by both a and b
* Example:
* lcm(2, 4) => 4
* lcm(3, 7) => 21
* Note: Say we have a, b
*   d = gcd(a, b)       ---(1)
*   f = a / d, g = b / d  ----(2)
*   a = fd, b = gd
*   LCM = C   ** lcm (a, b) = lcm(fd, gd)
*   We know that f and g will have no other common factor
*   Example:- a = 9,      b = 18
*             f = 1,      g = 2       ---> From eqn(2)
*
* **a = fd,     b = gd
* lcm = f * g * d
* Info:
* LCM is a number that is divided by both a and b
* Hence it should contain a * b     | Example lcm(17, 19) should contain 17 * 19
* = fd * gd
* = f * g * d
* a * b = fd    *   gd
*       = d     *   dfg
*       = hcf   *   lcm
* hcf * lcm = a * b
* lcm(a, b) = (a * b) / hcf(a, b)
 */

public class LCM {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        System.out.println("The LCM is: " + lcm(a, b));
    }

    static int lcm (int a, int b) {
        int d = hcf(a, b);
        return (a * b) / d;
    }

    static int hcf (int a, int b) {
        if (a == 0) {
            return b;
        }
        return hcf (b % a, a);
    }
}
