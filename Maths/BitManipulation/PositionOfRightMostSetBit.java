package Maths.BitManipulation;

/*
Q: Find the position of the right most set bit.
Example: 1 0 1 1 0 1 1 0 :- Here the position of the right most set bit is 2
*/

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        int num = 0B101101100;
        System.out.println(positionOfRightMostSetBit(num));
    }

    static int positionOfRightMostSetBit(int num) {
        return num & (-num);
    }
}
