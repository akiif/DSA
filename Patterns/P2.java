package Patterns;

/*
https://www.youtube.com/watch?v=Y-AePs3E7FU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=37

* * * * *
* * * *
* * *
* *
*

*/

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
