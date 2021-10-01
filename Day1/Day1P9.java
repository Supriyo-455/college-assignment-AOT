package Day1;

public class Day1P9 {
    public static void main(String[] args) {
        int sum = 0, c = 0;
        int num = Integer.parseInt(args[0]);
        while (num > 0) {
            int r = num % 10;
            c = (c * 10) + r;
            sum += r;
            num /= 10;
        }
        System.out.println("Sum of the digit is: " + sum);
        System.out.println("The reverse number is: " + c);
    }
}
