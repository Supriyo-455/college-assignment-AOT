package Day5;

public class Day5P5 {
    public int counter = 0;
    public static int staticCounter = 0;

    public Day5P5() {
        counter++;
        staticCounter++;
    }

    public static void main(String args[]) {
        Day5P5 tester = new Day5P5();
        Day5P5 tester1 = new Day5P5();
        Day5P5 tester2 = new Day5P5();
        System.out.println("Counter: " + tester2.counter);
        System.out.println("Static Counter: " + tester2.staticCounter);
    }
}
