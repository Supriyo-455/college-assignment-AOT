package Day1;

public class Day1P11 {
    public static void main(String[] args) {
        boolean isPrime = true;
        int num = Integer.parseInt(args[0]);
        if (num == 1)
            isPrime = false;
        else
            for (int i = 0; i < i * num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        System.out.println((isPrime) ? "The number is prime" : "The number is not prime");
    }
}
