package Maths;
/*

root  =  (X + (N / X)) / 2

Where,
 X => the square the root that I am assuming
 root => the actual square root

error = | root - X |

1) Assign X to N
2) You will find your answer when error is less than 1.
3) Update the value of X

Time Complexity: O(log(N) * F(N))
 */
public class NewtonRaphsonMethod {

    public static void main(String[] args) {
        int num = 40;
        System.out.println(newtonRaphsonMethod(num));
    }

    static double newtonRaphsonMethod (double n) {
        double x = n;
        double root;

        while (true) {

            root = 0.5 * (x + (n / x));

            if (Math.abs(root - x) < 0.5) {  // Here 0.5 is the precision value
                break;
            }

            x = root;
        }

        return root;
    }
}
