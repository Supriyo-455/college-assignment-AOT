package Day3;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Day3P1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Console c = System.console();

        additionWithScanner(sc);
        additionWithBufferedReader(bf);
        additionWithConsole(c);

        sc.close();
    }

    private static void additionWithConsole(Console c) {
        String[] inputs = c.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        System.out.println(a + " + " + b + " :" + (a + b));
    }

    private static void additionWithBufferedReader(BufferedReader bf) throws IOException {
        String[] input = bf.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(a + " + " + b + " :" + (a + b));
    }

    private static void additionWithScanner(Scanner sc) {
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(a + " + " + b + " :" + (a + b));
    }
}
