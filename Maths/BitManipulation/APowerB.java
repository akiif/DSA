package Maths.BitManipulation;

/*
Q. Calculate a pow b using bit manipulation
Math.pow(a, b)
3pow6 => 3pow4 * 3pow2
  110
3       => 3pow4 * 3pow2
*/

public class APowerB {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(aPowerB(a, b));
        System.out.println(Math.pow(a, b));
    }

    // Time Complexity = O (power)
    static int aPowerB(int base, int power) {
        int ans = 1;

        while (power > 0) {

            if ((power & 1) == 1) {
                ans *= base;
            }
            base *= base;  // 3pow6 = 3pow4 * 3pow2  ... Its doubling everytime in binary form, so we are doing this.
            power = power >> 1;
        }
        return ans;
    }
}
