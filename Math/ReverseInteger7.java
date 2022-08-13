package Math;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger7 {
    public int reverse(int x) {
        long rev = 0;
        while (x!=0) {
            rev = rev * 10 + x % 10;
            x = x/10;
        }

        if (rev >= Integer.MIN_VALUE && rev <= Integer.MAX_VALUE)
            return (int) rev;
        else
            return 0;
    }
}
