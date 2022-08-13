package Math;

//https://leetcode.com/problems/a-number-after-a-double-reversal/

public class ANumberAfteraDoubleReversal2119 {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num % 10 > 0;
    }
}
