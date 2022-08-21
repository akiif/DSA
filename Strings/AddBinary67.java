package Strings;

//https://leetcode.com/problems/add-binary/

public class AddBinary67 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;  //if there is a carry from the last addition, add it to carry
            if (j >= 0) {
                sum += b.charAt(j) - '0';  //we subtract '0' to get the int value of the char from the ascii
                j--;
            }
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            res.append(sum % 2); /*if sum==2 or sum==0 append 0 cause 1+1=0 in this
            case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            */
            //For binary use n%2||n/2 and for decimal use n%10||n/10
            carry = sum / 2; //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithmetic
        }

        if (carry == 1) res.append(1);  //leftover carry, add it
        return res.reverse().toString();
    }
}
