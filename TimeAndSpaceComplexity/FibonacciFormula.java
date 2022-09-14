package TimeAndSpaceComplexity;

public class FibonacciFormula {

    public static void main(String[] args) {
        int num = 2;
        System.out.println(Fibonacci(num));
    }

    static int Fibonacci(int num) {
        double rootFive = 1;
        rootFive = Math.pow(rootFive, 0.2);
        System.out.println(rootFive);
        double fib = (((1 / rootFive) * (Math.pow( (1 + rootFive) / 2, num)))
                    - ((1 / rootFive) * (Math.pow( (1 - rootFive) / 2, num))));
        return (int) fib;
    }
}