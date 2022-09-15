package TimeAndSpaceComplexity;

public class FibonacciFormula {

    public static void main(String[] args) {
        int num = 50;
        System.out.println(Fibonacci(num));
    }

    static long Fibonacci(int num) {
        double rootFive = Math.sqrt(5);
        System.out.println(rootFive);
        double fib = (((1 / rootFive) * (Math.pow( (1 + rootFive) / 2, num)))
                    - ((1 / rootFive) * (Math.pow( (1 - rootFive) / 2, num))));
        return (long) fib;
    }
}