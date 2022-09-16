package Maths.BitManipulation;

/*
Q. Find the ith bit of a number.
Ans: AND that particular ith with 1
Example: Find the 5th bit for: 10110110
    1 0 1 1 0 1 1 0
 &  0 0 0 1 0 0 0 0  --> This is called a mask.
 -------------------
    0 0 0 1 0 0 0 0

We need a mask with n - 1 zeros.
To create a mask we can use left shift with n - 1
1 << (n - 1)
1 << 4 => 10000
return num & (1 << ( i - 1 ));
*/

public class IthBit {
    public static void main(String[] args) {
        int num = 0B10110110;
        int index = 5;
        System.out.println(Integer.toBinaryString(ithBit(num, index)));
    }

    static int ithBit(int num, int i) {
        return num & (1 << ( i - 1 ));
    }
}
