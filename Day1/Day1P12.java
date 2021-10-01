package Day1;

public class Day1P12 {
    public static void main(String[] args) {
        boolean isPrime = true;
        String primeNumberFound = "";
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Prime numbers are: ");
        for (int i = num1; i <= num2; i++) {
            isPrime = checkPrime(i);
            if (isPrime)
                primeNumberFound = primeNumberFound + i + " ";
        }
        System.out.println(primeNumberFound);
    }

    private static boolean checkPrime(int i) {
        if (i == 1) {
            return false;
        }
        for (int j = 0; j <= i / 2; j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
