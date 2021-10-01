package Day1;

public class Day1P6 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int highest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Highest value is " + highest);
    }
}
