package TimeAndSpaceComplexity;

public class FibonacciFormula {

    public static void main(String[] args) {
        int num = 6;
        System.out.println(Fibonacci(num));
    }

    static long Fibonacci(int num) {
        double rootFive = Math.sqrt(5);
        double fib = (((1 / rootFive) * (Math.pow( (1 + rootFive) / 2, num)))
                    - ((1 / rootFive) * (Math.pow( (1 - rootFive) / 2, num))));
        return Math.round(fib);
    }
}