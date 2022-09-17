package Maths.BitManipulation;

/*
Q: Find the number of digits in base b
Ans:
(6)    => 1
   10

(6)    =>  (110)    => 3
   10           2

The formula is: log  * a = x , where x is the no of digits
                   b
Number of digits in base b of no. n
= int (log n) + 1
          b
*/

public class DigitsInBaseB {


    public static void main(String[] args) {
        int num = 15;
        int base = 10;
        System.out.println(digitsInBaseB(num, base));

        System.out.println(digitsInBase2(num));
    }

    static int digitsInBaseB(int num, int base) {
        return (int) (Math.log(num) / Math.log(base)) + 1;
    }
    /*
    log a = log(a) / log(b)
       b
     */

    static int digitsInBase2(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n = n >> 1;
        }
        return count;
    }
}
