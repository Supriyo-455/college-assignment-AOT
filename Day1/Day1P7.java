package Day1;

public class Day1P7 {
    public static void main(String[] args) {
        int avg, total;
        total = Integer.parseInt(args[0]);
        avg = total / 6;
        System.out.print("The student Grade is: ");
        if (avg >= 80) {
            System.out.print("A");
        } else if (avg >= 60 && avg < 80) {
            System.out.print("B");
        } else if (avg >= 40 && avg < 60) {
            System.out.print("C");
        } else {
            System.out.print("D");
        }
    }
}
