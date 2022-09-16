package TimeAndSpaceComplexity;

/*
Time Complexity
= O ( ( (1 + root(5)) / 2 ) ^ N )
= O ( (1.6180)^N )
The above T(N) are also known as the Golden ratio
*/
public class FibonacciFormula {

    public static void main(String[] args) {
        int num = 50;
        System.out.println(Fibonacci(num));
    }

    static long Fibonacci(int num) {
        double rootFive = Math.sqrt(5);
        double fib = ( Math.pow( (1 + rootFive) / 2, num)  / rootFive );
        /* In the above we are removing   ( - (Math.pow( (1 - rootFive) / 2, num)) because it is a less dominating term.
        Same As:-
        (( (Math.pow( (1 + rootFive) / 2, num)) -  (Math.pow( (1 - rootFive) / 2, num)) ) / rootFive );
        OR
        ( (1 / rootFive) *
                ( (Math.pow( (1 + rootFive) / 2, num)) -  (Math.pow( (1 - rootFive) / 2, num)) ) )
         */
        return Math.round(fib);
    }
}