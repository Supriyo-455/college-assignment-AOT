package Day2;

import java.util.Scanner;

public class Day2P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sequence is: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(fibonacci(i));
        }
        sc.close();
    }

    private static long[] memo = new long[1000];

    private static long fibonacci(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return memo[n];
    }
}
