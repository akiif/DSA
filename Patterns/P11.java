package Patterns;

/*
https://www.youtube.com/watch?v=Yqq4GUPvWQM&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=56

1
2	3
4	5	6
7	8	9	10
11	12	13	14	15

*/

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(count++ + "\t");
            System.out.println();
        }
    }
}
