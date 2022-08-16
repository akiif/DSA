package Arrayss;

//https://leetcode.com/problems/plus-one/

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        //normal case where last digit is other than 9
        //we add 1 to the last digit
        for(int i = n - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        //case where all digits were 9, we add carry 1
        //to this new array and return that array
        int[] newDigits = new int[n+1];
        newDigits[0] = 1;
        return newDigits;

    }
}
