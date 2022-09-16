package Maths.BitManipulation;

/*
Q: Set the ith bit -> Turn it to 1
-> 0 --> 1
-> 1 --> 1
Ans: OR that particular ith with 1
Example: Set the 4th bit for: 1010110
    1 0 1 0 1 1 0
||  0 0 0 1 0 0 0  --> Mask
 -------------------
    1 0 1 1 1 1 0

We need a mask with n - 1 zeros.
To create a mask we can use left shift with n - 1
1 << (n - 1)
1 << 3 => 0001000
return num | (1 << ( i - 1 ));
 */

public class SetTheIthBit {
    public static void main(String[] args) {
        int num = 0B1010110;
        int index = 4;
        System.out.println(Integer.toBinaryString(setTheIthBit(num, index)));
    }

    static int setTheIthBit(int num, int i) {
        return num | (1 << ( i - 1 ));
    }
}
