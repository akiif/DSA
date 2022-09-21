package Recursion;

/* TODO: Recursion is a function that calls itself.
Function calls: are stored in stack.
* While the function is not finished executing it will remain in the stack
* When a function finishes executing, it is removed from the stack and the flow of program is restored where the
  function was called.
* If you are calling a function again and again, you can treat it as a separate call in the stack.

Why Recursion?
* It helps us in solving bigger/complex problems in a simple way.
* You can convert recursion solutions into iteration and vice versa.
* Space Complexity is not complex because of the recursive complex.

Recursion:
* TODO: Base condition: It is a condition where our recursive function will stop making making new calls.

* Break it down into smaller problems.
* Fib (N) = Fib(N - 1) + Fib(N - 2) :- This is known as recurrence relation.
* The base condition is represented by the answers we already have: (Fib(0) = 0, Fib(1) = 1)

TODO: Types of recurrence relation:
1. Linear recurrence relation :- Add or subtract linearly.
2. Divide and Conquer recurrence relation. :- Search space is reduced by a factor.
*/

public class RecursionIntroduction {
    public static void main(String[] args) {
        // Write a function that prints from n to 5
        print(1);
    }

    static void print(int n) {

        System.out.println(n);

        if (n == 5) {  // base condition
            return;
        }
        // recursive call
        print(n + 1);

    }
    static void message() {
        System.out.println("Hello World!");
    }
}
