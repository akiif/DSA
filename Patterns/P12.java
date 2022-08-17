package Patterns;

/*
https://www.youtube.com/watch?v=XzIM_xS9bgM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=58
Its in fibonacci sequence;
0
1	1
2	3	5
8	13  21	34
55	89	144	233	377

*/

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int fibonacci = 0;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
