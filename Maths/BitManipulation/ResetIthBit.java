package Maths.BitManipulation;

/*
Q: Reset the ith bit -> Turn it to 0
-> 0 --> 0
-> 1 --> 0
Ans: AND everything with 1 except that particular ith with 0
Example: Reset the 5th bit for: 1010110
    1 0 1 0 1 1 0
&   1 1 0 1 1 1 1  --> Mask
 -------------------
    1 0 0 0 1 1 0


To create a mask we can use left shift with n - 1
1 << (n - 1)
1 << 3 => 001000
Then take the complement of it, which is: 110111
Mask: !(1 << (n - 1))
 */

public class ResetIthBit {
    public static void main(String[] args) {
        int num = 0B1010110;
        int index = 5;
        System.out.println(Integer.toBinaryString(setTheIthBit(num, index)));
    }

    static int setTheIthBit(int num, int i) {
        return num & ~(1 << ( i - 1 ));
    }
}
