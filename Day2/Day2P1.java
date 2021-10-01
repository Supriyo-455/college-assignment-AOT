package Day2;

import java.util.Scanner;

public class Day2P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial(" + n + ") is " + fact);
        sc.close();
    }

    private static long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}