package Recursion.PatternsR;

/*
Triangle1:-
 *	*	*	*	*
 *	*	*	*
 *	*	*
 *	*
 *

Triangle2:-

 */

public class Triangle {
    public static void main(String[] args) {
        int num = 5;
        print1(num);
        System.out.println();
        print2(num);
    }

    static void print1(int n) {
        fun(n, 0);
    }

    static void fun (int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*\t");
            fun(row, col + 1);
        } else {
            System.out.println();
            fun(row - 1, 0);
        }
    }

    static void print2(int n) {
        fun2(n, 0);
    }

    static void fun2 (int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            fun2(row, col + 1);
            System.out.print("*\t");
        } else {
            fun2(row - 1, 0);
            System.out.println();
        }
    }
}
