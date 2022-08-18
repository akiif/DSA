package Strings;

//https://leetcode.com/problems/add-strings/

public class AddStrings415 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder resString = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int n1 = 0, n2 = 0;
            if (i >= 0) {
                n1 = num1.charAt(i) - '0';
            }
            if (j >= 0) {
                n2 = num2.charAt(j) - '0';
            }
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            resString.append(sum);
            i--;
            j--;
        }

        if (carry != 0) {
            resString.append(carry);
        }

        return resString.reverse().toString();
    }
}
